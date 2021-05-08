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

package com.github.mixinors.astromine.client.rei.refining;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

import net.minecraft.util.Identifier;

import com.github.mixinors.astromine.client.rei.AstromineRoughlyEnoughItemsPlugin;
import com.github.mixinors.astromine.common.recipe.ingredient.FluidIngredient;
import com.github.mixinors.astromine.common.volume.fluid.FluidVolume;
import com.github.mixinors.astromine.common.recipe.RefiningRecipe;
import me.shedaniel.rei.api.EntryStack;
import me.shedaniel.rei.api.RecipeDisplay;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Environment(EnvType.CLIENT)
public class RefiningDisplay implements RecipeDisplay {
	private final double energy;
	private final FluidIngredient input;
	private final FluidVolume firstOutput;
	private final FluidVolume secondOutput;
	private final FluidVolume thirdOutput;
	private final FluidVolume fourthOutput;
	private final FluidVolume fifthOutput;
	private final FluidVolume sixthOutput;
	private final FluidVolume seventhOutput;
	private final Identifier id;

	public RefiningDisplay(double energy, FluidIngredient input, FluidVolume firstOutput, FluidVolume secondOutput, FluidVolume thirdOutput, FluidVolume fourthOutput, FluidVolume fifthOutput, FluidVolume sixthOutput, FluidVolume seventhOutput, Identifier id) {
		this.energy = energy;
		this.input = input;
		this.firstOutput = firstOutput;
		this.secondOutput = secondOutput;
		this.thirdOutput = thirdOutput;
		this.fourthOutput = fourthOutput;
		this.fifthOutput = fifthOutput;
		this.sixthOutput = sixthOutput;
		this.seventhOutput = seventhOutput;
		this.id = id;
	}

	public RefiningDisplay(RefiningRecipe recipe) {
		this(recipe.getEnergyInput(), recipe.getIngredient(), recipe.getFirstOutputVolume(), recipe.getSecondOutputVolume(), recipe.getThirdOutputVolume(), recipe.getFourthOutputVolume(), recipe.getFifthOutputVolume(), recipe.getSixthOutputVolume(), recipe.getSeventhOutputVolume(),
			recipe.getId());
	}

	@Override
	public Optional<Identifier> getRecipeLocation() {
		return Optional.ofNullable(id);
	}

	@Override
	public List<List<EntryStack>> getInputEntries() {
		return Collections.singletonList(Arrays.stream(input.getMatchingVolumes()).map(AstromineRoughlyEnoughItemsPlugin::convertToEntryStack).collect(Collectors.toList()));
	}

	@Override
	public List<List<EntryStack>> getRequiredEntries() {
		return getInputEntries();
	}

	@Override
	public Identifier getRecipeCategory() {
		return AstromineRoughlyEnoughItemsPlugin.REFINING;
	}

	@Override
	public List<List<EntryStack>> getResultingEntries() {
		return Arrays.asList(Collections.singletonList(AstromineRoughlyEnoughItemsPlugin.convertToEntryStack(firstOutput)), Collections.singletonList(AstromineRoughlyEnoughItemsPlugin.convertToEntryStack(secondOutput)), Collections.singletonList(AstromineRoughlyEnoughItemsPlugin.convertToEntryStack(
			thirdOutput)), Collections.singletonList(AstromineRoughlyEnoughItemsPlugin.convertToEntryStack(fourthOutput)), Collections.singletonList(AstromineRoughlyEnoughItemsPlugin.convertToEntryStack(fifthOutput)), Collections.singletonList(AstromineRoughlyEnoughItemsPlugin.convertToEntryStack(
				sixthOutput)), Collections.singletonList(AstromineRoughlyEnoughItemsPlugin.convertToEntryStack(seventhOutput)));
	}

	public double getEnergy() {
		return energy;
	}
}
