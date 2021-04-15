/*
 * MIT License
 *
 * Copyright (c) 2020, 2021 Mixinors
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

package com.github.chainmailstudios.astromine.common.screenhandler.base.block;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.math.BlockPos;

import com.github.chainmailstudios.astromine.common.block.entity.base.ComponentFluidItemBlockEntity;
import com.github.chainmailstudios.astromine.common.widget.blade.FluidVerticalBarWidget;
import com.github.vini2003.blade.common.miscellaneous.Position;
import com.github.vini2003.blade.common.miscellaneous.Size;

/**
 * A {@link ComponentBlockEntityScreenHandler}
 * with an attached {@link ComponentFluidItemBlockEntity}.
 */
public class ComponentBlockEntityFluidItemScreenHandler extends ComponentBlockEntityScreenHandler {
	public ComponentFluidItemBlockEntity blockEntity;

	public FluidVerticalBarWidget fluidBar;

	/** Instantiates a {@link ComponentBlockEntityItemScreenHandler},
	 * obtaining the {@link ComponentFluidItemBlockEntity}. */
	public ComponentBlockEntityFluidItemScreenHandler(ScreenHandlerType<?> type, int syncId, PlayerEntity player, BlockPos position) {
		super(type, syncId, player, position);

		blockEntity = (ComponentFluidItemBlockEntity) player.world.getBlockEntity(position);
	}

	/** Override behavior to add a fluid bar. */
	@Override
	public void initialize(int width, int height) {
		super.initialize(width, height);

		fluidBar = new FluidVerticalBarWidget();
		fluidBar.setPosition(Position.of(mainTab, 7, 11));
		fluidBar.setSize(Size.of(24F, 48F));
		fluidBar.setVolumeSupplier(() -> blockEntity.getFluidComponent().getFirst());

		mainTab.addWidget(fluidBar);
	}
}
