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

package com.github.chainmailstudios.astromine.common.block;

import com.github.chainmailstudios.astromine.common.block.base.TieredHorizontalFacingEnergyMachineBlock;
import com.github.chainmailstudios.astromine.common.block.entity.SolidGeneratorBlockEntity;
import com.github.chainmailstudios.astromine.common.screenhandler.SolidGeneratorScreenHandler;
import com.github.chainmailstudios.astromine.registry.AstromineConfig;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public abstract class SolidGeneratorBlock extends TieredHorizontalFacingEnergyMachineBlock {
	public SolidGeneratorBlock(Settings settings) {
		super(settings);
	}

	public abstract static class Base extends SolidGeneratorBlock {
		public Base(Settings settings) {
			super(settings);
		}

		@Override
		public boolean hasScreenHandler() {
			return true;
		}

		@Override
		public ScreenHandler createScreenHandler(BlockState state, World world, BlockPos pos, int syncId, PlayerInventory playerInventory, PlayerEntity player) {
			return new SolidGeneratorScreenHandler(syncId, playerInventory.player, pos);
		}

		@Override
		public void populateScreenHandlerBuffer(BlockState state, World world, BlockPos pos, ServerPlayerEntity player, PacketByteBuf buffer) {
			buffer.writeBlockPos(pos);
		}
	}

	public static class Primitive extends Base {
		public Primitive(Settings settings) {
			super(settings);
		}

		@Override
		public BlockEntity createBlockEntity() {
			return new SolidGeneratorBlockEntity.Primitive();
		}

		@Override
		public double getMachineSpeed() {
			return AstromineConfig.get().primitiveSolidGeneratorSpeed;
		}

		@Override
		public double getEnergyCapacity() {
			return AstromineConfig.get().primitiveSolidGeneratorEnergy;
		}
	}

	public static class Basic extends Base {
		public Basic(Settings settings) {
			super(settings);
		}

		@Override
		public BlockEntity createBlockEntity() {
			return new SolidGeneratorBlockEntity.Basic();
		}

		@Override
		public double getMachineSpeed() {
			return AstromineConfig.get().basicSolidGeneratorSpeed;
		}

		@Override
		public double getEnergyCapacity() {
			return AstromineConfig.get().basicSolidGeneratorEnergy;
		}
	}

	public static class Advanced extends Base {
		public Advanced(Settings settings) {
			super(settings);
		}

		@Override
		public BlockEntity createBlockEntity() {
			return new SolidGeneratorBlockEntity.Advanced();
		}

		@Override
		public double getMachineSpeed() {
			return AstromineConfig.get().advancedSolidGeneratorSpeed;
		}

		@Override
		public double getEnergyCapacity() {
			return AstromineConfig.get().advancedSolidGeneratorEnergy;
		}
	}

	public static class Elite extends Base {
		public Elite(Settings settings) {
			super(settings);
		}

		@Override
		public BlockEntity createBlockEntity() {
			return new SolidGeneratorBlockEntity.Elite();
		}

		@Override
		public double getMachineSpeed() {
			return AstromineConfig.get().eliteSolidGeneratorSpeed;
		}

		@Override
		public double getEnergyCapacity() {
			return AstromineConfig.get().eliteSolidGeneratorEnergy;
		}
	}
}
