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

package com.github.chainmailstudios.astromine.technologies.datagen;

import com.github.chainmailstudios.astromine.datagen.generator.loottable.LootTableGenerator;
import com.github.chainmailstudios.astromine.datagen.generator.loottable.onetime.DropSelfLootTableGenerator;
import com.github.chainmailstudios.astromine.datagen.registry.AstromineLootTableGenerators;
import com.github.chainmailstudios.astromine.technologies.registry.AstromineTechnologiesBlocks;

public class AstromineTechnologiesLootTableGenerators extends AstromineLootTableGenerators {
	public final LootTableGenerator DROP_SELF = register(new DropSelfLootTableGenerator(
			AstromineTechnologiesBlocks.HOLOGRAPHIC_BRIDGE_PROJECTOR,
			AstromineTechnologiesBlocks.HOLOGRAPHIC_BRIDGE_INVISIBLE_BLOCK,

			AstromineTechnologiesBlocks.VENT,

			AstromineTechnologiesBlocks.PRIMITIVE_TANK,
			AstromineTechnologiesBlocks.BASIC_TANK,
			AstromineTechnologiesBlocks.ADVANCED_TANK,
			AstromineTechnologiesBlocks.ELITE_TANK,
			AstromineTechnologiesBlocks.CREATIVE_TANK,

			AstromineTechnologiesBlocks.PRIMITIVE_SOLID_GENERATOR,
			AstromineTechnologiesBlocks.BASIC_SOLID_GENERATOR,
			AstromineTechnologiesBlocks.ADVANCED_SOLID_GENERATOR,
			AstromineTechnologiesBlocks.ELITE_SOLID_GENERATOR,

			AstromineTechnologiesBlocks.PRIMITIVE_LIQUID_GENERATOR,
			AstromineTechnologiesBlocks.BASIC_LIQUID_GENERATOR,
			AstromineTechnologiesBlocks.ADVANCED_LIQUID_GENERATOR,
			AstromineTechnologiesBlocks.ELITE_LIQUID_GENERATOR,

			AstromineTechnologiesBlocks.PRIMITIVE_ELECTRIC_FURNACE,
			AstromineTechnologiesBlocks.BASIC_ELECTRIC_FURNACE,
			AstromineTechnologiesBlocks.ADVANCED_ELECTRIC_FURNACE,
			AstromineTechnologiesBlocks.ELITE_ELECTRIC_FURNACE,

			AstromineTechnologiesBlocks.PRIMITIVE_ALLOY_SMELTER,
			AstromineTechnologiesBlocks.BASIC_ALLOY_SMELTER,
			AstromineTechnologiesBlocks.ADVANCED_ALLOY_SMELTER,
			AstromineTechnologiesBlocks.ELITE_ALLOY_SMELTER,

			AstromineTechnologiesBlocks.PRIMITIVE_TRITURATOR,
			AstromineTechnologiesBlocks.BASIC_TRITURATOR,
			AstromineTechnologiesBlocks.ADVANCED_TRITURATOR,
			AstromineTechnologiesBlocks.ELITE_TRITURATOR,

			AstromineTechnologiesBlocks.PRIMITIVE_PRESSER,
			AstromineTechnologiesBlocks.BASIC_PRESSER,
			AstromineTechnologiesBlocks.ADVANCED_PRESSER,
			AstromineTechnologiesBlocks.ELITE_PRESSER,

			AstromineTechnologiesBlocks.PRIMITIVE_WIREMILL,
			AstromineTechnologiesBlocks.BASIC_WIREMILL,
			AstromineTechnologiesBlocks.ADVANCED_WIREMILL,
			AstromineTechnologiesBlocks.ELITE_WIREMILL,

			AstromineTechnologiesBlocks.PRIMITIVE_ELECTROLYZER,
			AstromineTechnologiesBlocks.BASIC_ELECTROLYZER,
			AstromineTechnologiesBlocks.ADVANCED_ELECTROLYZER,
			AstromineTechnologiesBlocks.ELITE_ELECTROLYZER,

			AstromineTechnologiesBlocks.PRIMITIVE_REFINERY,
			AstromineTechnologiesBlocks.BASIC_REFINERY,
			AstromineTechnologiesBlocks.ADVANCED_REFINERY,
			AstromineTechnologiesBlocks.ELITE_REFINERY,

			AstromineTechnologiesBlocks.PRIMITIVE_FLUID_MIXER,
			AstromineTechnologiesBlocks.BASIC_FLUID_MIXER,
			AstromineTechnologiesBlocks.ADVANCED_FLUID_MIXER,
			AstromineTechnologiesBlocks.ELITE_FLUID_MIXER,

			AstromineTechnologiesBlocks.PRIMITIVE_SOLIDIFIER,
			AstromineTechnologiesBlocks.BASIC_SOLIDIFIER,
			AstromineTechnologiesBlocks.ADVANCED_SOLIDIFIER,
			AstromineTechnologiesBlocks.ELITE_SOLIDIFIER,

			AstromineTechnologiesBlocks.PRIMITIVE_MELTER,
			AstromineTechnologiesBlocks.BASIC_MELTER,
			AstromineTechnologiesBlocks.ADVANCED_MELTER,
			AstromineTechnologiesBlocks.ELITE_MELTER,

			AstromineTechnologiesBlocks.PRIMITIVE_BUFFER,
			AstromineTechnologiesBlocks.BASIC_BUFFER,
			AstromineTechnologiesBlocks.ADVANCED_BUFFER,
			AstromineTechnologiesBlocks.ELITE_BUFFER,
			AstromineTechnologiesBlocks.CREATIVE_BUFFER,

			AstromineTechnologiesBlocks.FLUID_EXTRACTOR,
			AstromineTechnologiesBlocks.FLUID_INSERTER,
			AstromineTechnologiesBlocks.BLOCK_BREAKER,
			AstromineTechnologiesBlocks.BLOCK_PLACER,

			AstromineTechnologiesBlocks.NUCLEAR_WARHEAD,

			AstromineTechnologiesBlocks.PRIMITIVE_CAPACITOR,
			AstromineTechnologiesBlocks.BASIC_CAPACITOR,
			AstromineTechnologiesBlocks.ADVANCED_CAPACITOR,
			AstromineTechnologiesBlocks.ELITE_CAPACITOR,
			AstromineTechnologiesBlocks.CREATIVE_CAPACITOR,

			AstromineTechnologiesBlocks.AIRLOCK));
}
