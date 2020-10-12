/*
 * MIT License
 *
 * Copyright (c) 2020 Chainmail Studios
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.chainmailstudios.astromine.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import com.github.chainmailstudios.astromine.common.block.transfer.TransferType;
import com.github.chainmailstudios.astromine.common.item.base.FluidVolumeItem;
import com.github.chainmailstudios.astromine.common.utilities.data.Holder;
import com.github.chainmailstudios.astromine.common.volume.fraction.Fraction;
import com.github.chainmailstudios.astromine.common.volume.handler.FluidHandler;
import com.github.chainmailstudios.astromine.common.volume.handler.TransferHandler;
import com.github.chainmailstudios.astromine.registry.AstromineComponentTypes;

import java.util.Optional;

@Mixin(AbstractBlock.class)
public class AbstractBlockMixin {
	@SuppressWarnings("all")
	@Inject(at = @At("HEAD"),
		method = "onUse(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/entity/player/PlayerEntity;Lnet/minecraft/util/Hand;Lnet/minecraft/util/hit/BlockHitResult;)Lnet/minecraft/util/ActionResult;", cancellable = true)
	void astromine_onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult result, CallbackInfoReturnable<ActionResult> cir) {
		final ItemStack stack = player.getStackInHand(hand);

		final Item stackItem = stack.getItem();

		final boolean isBucket = stackItem instanceof BucketItem;

		final boolean isFluidVolumeItem = stackItem instanceof FluidVolumeItem;

		final Optional<FluidHandler> handler = FluidHandler.ofOptional(stack);

		if (state.getBlock().hasBlockEntity()) {
			final Optional<TransferHandler> optionalTransferHandler = TransferHandler.of(world.getBlockEntity(pos));

			if (optionalTransferHandler.isPresent()) {
				TransferHandler transferHandler = optionalTransferHandler.get();

				Holder<TransferType> typeHolder = Holder.of(null);

				transferHandler.withDirection(AstromineComponentTypes.FLUID_INVENTORY_COMPONENT, result.getSide(), (type) -> {
					typeHolder.set(type);
				});

				if (typeHolder.get() == null || (!typeHolder.get().canInsert() && !typeHolder.get().canExtract())) {
					return;
				}
			}
		}

		final Holder<Boolean> shouldSkip = Holder.of(false);

		handler.ifPresent(stackHandler -> {
			final Block block = state.getBlock();

			if (block.hasBlockEntity()) {
				final BlockEntity blockEntity = world.getBlockEntity(pos);

				FluidHandler.ofOptional(blockEntity).ifPresent(blockEntityHandler -> {
					stackHandler.withVolume(0, (optionalStackVolume) -> {
						optionalStackVolume.ifPresent((stackVolume) -> {
							if (stackVolume.isEmpty()) {
								blockEntityHandler.withFirstExtractable(result.getSide(), (optionalFirstExtractable) -> {
									optionalFirstExtractable.ifPresent((firstExtractable) -> {
										if (isBucket) {
											firstExtractable.ifStored(Fraction.bucket(), () -> {
												if (stack.getCount() == 1 || (player.inventory.getEmptySlot() == -1 && stack.getCount() == 1)) {
													stackVolume.moveFrom(firstExtractable, Fraction.bucket());
													player.setStackInHand(hand, new ItemStack(stackVolume.getFluid().getBucketItem()));
												} else if (player.inventory.getEmptySlot() != -1 && stack.getCount() > 1) {
													stackVolume.moveFrom(firstExtractable, Fraction.bucket());
													stack.decrement(1);
													player.giveItemStack(new ItemStack(stackVolume.getFluid().getBucketItem()));
												}
											});
										} else {
											stackVolume.moveFrom(firstExtractable, Fraction.bucket());
										}
									});
								});
							} else {
								blockEntityHandler.withFirstInsertable(result.getSide(), stackVolume.getFluid(), (optionalFirstInsertable) -> {
									optionalFirstInsertable.ifPresent((firstInsertable) -> {
										if (isBucket) {
											firstInsertable.ifAvailable(Fraction.bucket(), () -> {
												if (stack.getCount() == 1 || (player.inventory.getEmptySlot() == -1 && stack.getCount() == 1)) {
													firstInsertable.moveFrom(stackVolume, Fraction.bucket());

													if (!player.isCreative()) {
														player.setStackInHand(hand, new ItemStack(Items.BUCKET));
													}
												} else if (player.inventory.getEmptySlot() != -1 && stack.getCount() > 1) {
													firstInsertable.moveFrom(stackVolume, Fraction.bucket());

													if (!player.isCreative()) {
														stack.decrement(1);
														player.giveItemStack(new ItemStack(Items.BUCKET));
													}
												}
											});
										} else {
											firstInsertable.moveFrom(stackVolume, Fraction.bucket());
										}
									});
								});
							}

							shouldSkip.set(true);
						});
					});
				});
			}
		});

		if (shouldSkip.get()) {
			cir.setReturnValue(ActionResult.SUCCESS);
		}
	}
}
