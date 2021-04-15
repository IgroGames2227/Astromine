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

package com.github.chainmailstudios.astromine.foundations.datagen.registry;

import com.github.chainmailstudios.astromine.datagen.generator.recipe.RecipeGenerator;
import com.github.chainmailstudios.astromine.datagen.generator.recipe.onetime.*;
import com.github.chainmailstudios.astromine.datagen.generator.recipe.set.*;
import com.github.chainmailstudios.astromine.datagen.registry.AstromineRecipeGenerators;
import com.github.chainmailstudios.astromine.foundations.datagen.generators.recipe.*;
import com.github.chainmailstudios.astromine.foundations.registry.AstromineFoundationsBlocks;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.recipe.Ingredient;

import static com.github.chainmailstudios.astromine.datagen.material.MaterialItemType.*;


public class AstromineFoundationsRecipeGenerators extends AstromineRecipeGenerators {
	public final RecipeGenerator INGOT_TO_BLOCK = register(new Crafting3x3SetRecipeGenerator(INGOT, BLOCK));
	public final RecipeGenerator GEM_TO_BLOCK = register(new Crafting3x3SetRecipeGenerator(GEM, BLOCK));
	public final RecipeGenerator MISC_TO_BLOCK = register(new Crafting3x3SetRecipeGenerator(MISC_RESOURCE, BLOCK));
	public final RecipeGenerator NUGGET_TO_INGOT = register(new Crafting3x3SetRecipeGenerator(NUGGET, INGOT));
	public final RecipeGenerator FRAGMENT_TO_GEM = register(new Crafting3x3SetRecipeGenerator(FRAGMENT, GEM));
	public final RecipeGenerator TINY_DUST_TO_DUST = register(new Crafting3x3SetRecipeGenerator(TINY_DUST, DUST));

	public final RecipeGenerator INGOT_TO_BLOCK_2x2 = register(new Crafting2x2SetRecipeGenerator(INGOT, BLOCK_2x2));
	public final RecipeGenerator GEM_TO_BLOCK_2x2 = register(new Crafting2x2SetRecipeGenerator(GEM, BLOCK_2x2));
	public final RecipeGenerator MISC_TO_BLOCK_2x2 = register(new Crafting2x2SetRecipeGenerator(MISC_RESOURCE, BLOCK_2x2));

	public final RecipeGenerator BLOCK_TO_INGOTS = register(new ShapelessCraftingSetRecipeGenerator(BLOCK, INGOT, 9));
	public final RecipeGenerator BLOCK_TO_GEMS = register(new ShapelessCraftingSetRecipeGenerator(BLOCK, GEM, 9));
	public final RecipeGenerator BLOCK_TO_MISC = register(new ShapelessCraftingSetRecipeGenerator(BLOCK, MISC_RESOURCE, 9));
	public final RecipeGenerator INGOT_TO_NUGGETS = register(new ShapelessCraftingSetRecipeGenerator(INGOT, NUGGET, 9));
	public final RecipeGenerator GEM_TO_FRAGMENTS = register(new ShapelessCraftingSetRecipeGenerator(GEM, FRAGMENT, 9));
	public final RecipeGenerator DUST_TO_TINY_DUSTS = register(new ShapelessCraftingSetRecipeGenerator(DUST, TINY_DUST, 9));

	public final RecipeGenerator INGOT_TO_PICKAXE = register(new ToolCraftingRecipeGenerators.PickaxeCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_PICKAXE = register(new ToolCraftingRecipeGenerators.PickaxeCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_PICKAXE = register(new ToolCraftingRecipeGenerators.PickaxeCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_AXE = register(new ToolCraftingRecipeGenerators.AxeCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_AXE = register(new ToolCraftingRecipeGenerators.AxeCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_AXE = register(new ToolCraftingRecipeGenerators.AxeCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_SHOVEL = register(new ToolCraftingRecipeGenerators.ShovelCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_SHOVEL = register(new ToolCraftingRecipeGenerators.ShovelCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_SHOVEL = register(new ToolCraftingRecipeGenerators.ShovelCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_SWORD = register(new ToolCraftingRecipeGenerators.SwordCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_SWORD = register(new ToolCraftingRecipeGenerators.SwordCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_SWORD = register(new ToolCraftingRecipeGenerators.SwordCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_HOE = register(new ToolCraftingRecipeGenerators.HoeCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_HOE = register(new ToolCraftingRecipeGenerators.HoeCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_HOE = register(new ToolCraftingRecipeGenerators.HoeCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_MATTOCK = register(new ToolCraftingRecipeGenerators.MattockCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_MATTOCK = register(new ToolCraftingRecipeGenerators.MattockCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_MATTOCK = register(new ToolCraftingRecipeGenerators.MattockCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_MINING_TOOL = register(new ToolCraftingRecipeGenerators.MiningToolCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_MINING_TOOL = register(new ToolCraftingRecipeGenerators.MiningToolCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_MINING_TOOL = register(new ToolCraftingRecipeGenerators.MiningToolCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_HAMMER = register(new ToolCraftingRecipeGenerators.HammerCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_HAMMER = register(new ToolCraftingRecipeGenerators.HammerCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_HAMMER = register(new ToolCraftingRecipeGenerators.HammerCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_EXCAVATOR = register(new ToolCraftingRecipeGenerators.ExcavatorCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_EXCAVATOR = register(new ToolCraftingRecipeGenerators.ExcavatorCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_EXCAVATOR = register(new ToolCraftingRecipeGenerators.ExcavatorCraftingRecipeGenerator(MISC_RESOURCE));

	public final RecipeGenerator INGOT_TO_HELMET = register(new ArmorCraftingRecipeGenerators.HelmetCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_HELMET = register(new ArmorCraftingRecipeGenerators.HelmetCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_HELMET = register(new ArmorCraftingRecipeGenerators.HelmetCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_CHESTPLATE = register(new ArmorCraftingRecipeGenerators.ChestplateCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_CHESTPLATE = register(new ArmorCraftingRecipeGenerators.ChestplateCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_CHESTPLATE = register(new ArmorCraftingRecipeGenerators.ChestplateCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_LEGGINGS = register(new ArmorCraftingRecipeGenerators.LeggingsCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_LEGGINGS = register(new ArmorCraftingRecipeGenerators.LeggingsCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_LEGGINGS = register(new ArmorCraftingRecipeGenerators.LeggingsCraftingRecipeGenerator(MISC_RESOURCE));
	public final RecipeGenerator INGOT_TO_BOOTS = register(new ArmorCraftingRecipeGenerators.BootsCraftingRecipeGenerator(INGOT));
	public final RecipeGenerator GEM_TO_BOOTS = register(new ArmorCraftingRecipeGenerators.BootsCraftingRecipeGenerator(GEM));
	public final RecipeGenerator MISC_TO_BOOTS = register(new ArmorCraftingRecipeGenerators.BootsCraftingRecipeGenerator(MISC_RESOURCE));

	public final RecipeGenerator ORE_TO_INGOT = register(new SmeltingSetRecipeGenerator(ORE, INGOT));
	public final RecipeGenerator ORE_TO_GEM = register(new SmeltingSetRecipeGenerator(ORE, GEM));
	public final RecipeGenerator ORE_TO_MISC = register(new SmeltingSetRecipeGenerator(ORE, MISC_RESOURCE));
	public final RecipeGenerator METEOR_ORE_TO_NUGGET = register(new SmeltingSetRecipeGenerator(METEOR_ORE, NUGGET));
	public final RecipeGenerator METEOR_ORE_TO_FRAGMENT = register(new SmeltingSetRecipeGenerator(METEOR_ORE, FRAGMENT));
	public final RecipeGenerator DUST_TO_INGOT = register(new SmeltingSetRecipeGenerator(DUST, INGOT));
	public final RecipeGenerator DUST_TO_GEM = register(new SmeltingSetRecipeGenerator(DUST, GEM));
	public final RecipeGenerator METEOR_CLUSTER_TO_NUGGET = register(new SmeltingSetRecipeGenerator(METEOR_CLUSTER, NUGGET));
	public final RecipeGenerator METEOR_CLUSTER_TO_FRAGMENT = register(new SmeltingSetRecipeGenerator(METEOR_CLUSTER, FRAGMENT));
	public final RecipeGenerator TINY_DUST_TO_NUGGET = register(new SmeltingSetRecipeGenerator(TINY_DUST, NUGGET));
	public final RecipeGenerator TINY_DUST_TO_FRAGMENT = register(new SmeltingSetRecipeGenerator(TINY_DUST, FRAGMENT));

	public final RecipeGenerator ORE_TO_INGOT_BLASTING = register(new BlastingSetRecipeGenerator(ORE, INGOT));
	public final RecipeGenerator ORE_TO_GEM_BLASTING = register(new BlastingSetRecipeGenerator(ORE, GEM));
	public final RecipeGenerator ORE_TO_MISC_BLASTING = register(new BlastingSetRecipeGenerator(ORE, MISC_RESOURCE));
	public final RecipeGenerator METEOR_ORE_TO_NUGGET_BLASTING = register(new BlastingSetRecipeGenerator(METEOR_ORE, NUGGET));
	public final RecipeGenerator METEOR_ORE_TO_FRAGMENT_BLASTING = register(new BlastingSetRecipeGenerator(METEOR_ORE, FRAGMENT));
	public final RecipeGenerator DUST_TO_INGOT_BLASTING = register(new BlastingSetRecipeGenerator(DUST, INGOT));
	public final RecipeGenerator DUST_TO_GEM_BLASTING = register(new BlastingSetRecipeGenerator(DUST, GEM));
	public final RecipeGenerator METEOR_CLUSTER_TO_NUGGET_BLASTING = register(new BlastingSetRecipeGenerator(METEOR_CLUSTER, NUGGET));
	public final RecipeGenerator METEOR_CLUSTER_TO_FRAGMENT_BLASTING = register(new BlastingSetRecipeGenerator(METEOR_CLUSTER, FRAGMENT));
	public final RecipeGenerator TINY_DUST_TO_NUGGET_BLASTING = register(new BlastingSetRecipeGenerator(TINY_DUST, NUGGET));
	public final RecipeGenerator TINY_DUST_TO_FRAGMENT_BLASTING = register(new BlastingSetRecipeGenerator(TINY_DUST, FRAGMENT));

	public final RecipeGenerator INGOT_TO_PLATES_CRAFTING = register(new ShapedCraftingSetRecipeGenerator(INGOT, PLATE, "#", "#"));
	public final RecipeGenerator INGOT_TO_GEAR_CRAFTING = register(new ShapedCraftingSetRecipeGenerator(INGOT, GEAR, 2, " # ", "# #", " # "));

	public final RecipeGenerator PLATE_TO_WIRE_CRAFTING = register(new WireFromPlateRecipeGenerator(PLATE, Ingredient.fromTag(FabricToolTags.SHEARS), WIRE, 1));

	public final RecipeGenerator PICKAXE_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(PICKAXE, INGOT));
	public final RecipeGenerator PICKAXE_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(PICKAXE, GEM));
	public final RecipeGenerator AXE_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(AXE, INGOT));
	public final RecipeGenerator AXE_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(AXE, GEM));
	public final RecipeGenerator SHOVEL_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(SHOVEL, INGOT));
	public final RecipeGenerator SHOVEL_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(SHOVEL, GEM));
	public final RecipeGenerator SWORD_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(SWORD, INGOT));
	public final RecipeGenerator SWORD_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(SWORD, GEM));
	public final RecipeGenerator HOE_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(HOE, INGOT));
	public final RecipeGenerator HOE_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(HOE, GEM));
	public final RecipeGenerator MATTOCK_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(MATTOCK, INGOT));
	public final RecipeGenerator MATTOCK_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(MATTOCK, GEM));
	public final RecipeGenerator MINING_TOOL_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(MINING_TOOL, INGOT));
	public final RecipeGenerator MINING_TOOL_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(MINING_TOOL, GEM));
	public final RecipeGenerator HAMMER_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(HAMMER, INGOT));
	public final RecipeGenerator HAMMER_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(HAMMER, GEM));
	public final RecipeGenerator EXCAVATOR_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(EXCAVATOR, INGOT));
	public final RecipeGenerator EXCAVATOR_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(EXCAVATOR, GEM));

	public final RecipeGenerator HELMET_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(HELMET, INGOT));
	public final RecipeGenerator HELMET_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(HELMET, GEM));
	public final RecipeGenerator CHESTPLATE_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(CHESTPLATE, INGOT));
	public final RecipeGenerator CHESTPLATE_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(CHESTPLATE, GEM));
	public final RecipeGenerator LEGGINGS_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(LEGGINGS, INGOT));
	public final RecipeGenerator LEGGINGS_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(LEGGINGS, GEM));
	public final RecipeGenerator BOOTS_SMITHING_FROM_INGOT = register(new SmithingSetRecipeGenerator(BOOTS, INGOT));
	public final RecipeGenerator BOOTS_SMITHING_FROM_GEM = register(new SmithingSetRecipeGenerator(BOOTS, GEM));

	public final RecipeGenerator SALVAGE_SMELTING_TO_NUGGET = register(new SalvageSmeltingRecipeGenerator(NUGGET));
	public final RecipeGenerator SALVAGE_SMELTING_TO_FRAGMENT = register(new SalvageSmeltingRecipeGenerator(FRAGMENT));
	public final RecipeGenerator SALVAGE_BLASTING_TO_NUGGET = register(new SalvageBlastingRecipeGenerator(NUGGET));
	public final RecipeGenerator SALVAGE_BLASTING_TO_FRAGMENT = register(new SalvageBlastingRecipeGenerator(FRAGMENT));

	public final RecipeGenerator WRENCH = register(new WrenchCraftingRecipeGenerator());

	public final RecipeGenerator APPLE = register(new AppleCraftingRecipeGenerator());

	public final RecipeGenerator SMOOTH_METEOR_STONE = register(new SmeltingRecipeGenerator(Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE), AstromineFoundationsBlocks.SMOOTH_METEOR_STONE));

	public final RecipeGenerator POLISHED_METEOR_STONE = register(new Crafting2x2RecipeGenerator(AstromineFoundationsBlocks.POLISHED_METEOR_STONE, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE), 4));
	public final RecipeGenerator METEOR_STONE_BRICKS = register(new Crafting2x2RecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICKS, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE), 4));

	public final RecipeGenerator POLISHED_METEOR_STONE_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.POLISHED_METEOR_STONE, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE)));
	public final RecipeGenerator METEOR_STONE_BRICKS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICKS, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE), "smooth"));
	public final RecipeGenerator METEOR_STONE_BRICKS_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICKS, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE), "polished"));

	public final RecipeGenerator METEOR_STONE_SLAB = register(new SlabCraftingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE)));
	public final RecipeGenerator METEOR_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE)));
	public final RecipeGenerator METEOR_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_WALL, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE)));

	public final RecipeGenerator SMOOTH_METEOR_STONE_SLAB = register(new SlabCraftingRecipeGenerator(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE)));
	public final RecipeGenerator SMOOTH_METEOR_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE)));
	public final RecipeGenerator SMOOTH_METEOR_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE_WALL, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE)));

	public final RecipeGenerator POLISHED_METEOR_STONE_SLAB = register(new SlabCraftingRecipeGenerator(AstromineFoundationsBlocks.POLISHED_METEOR_STONE_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE)));
	public final RecipeGenerator POLISHED_METEOR_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineFoundationsBlocks.POLISHED_METEOR_STONE_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE)));

	public final RecipeGenerator METEOR_STONE_BRICK_SLAB = register(new SlabCraftingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE_BRICKS)));
	public final RecipeGenerator METEOR_STONE_BRICK_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE_BRICKS)));
	public final RecipeGenerator METEOR_STONE_BRICK_WALL = register(new WallCraftingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_WALL, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE_BRICKS)));

	public final RecipeGenerator METEOR_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE), 2));
	public final RecipeGenerator METEOR_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE)));
	public final RecipeGenerator METEOR_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_WALL, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE)));

	public final RecipeGenerator SMOOTH_METEOR_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE), 2));
	public final RecipeGenerator SMOOTH_METEOR_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE)));
	public final RecipeGenerator SMOOTH_METEOR_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE_WALL, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE)));

	public final RecipeGenerator POLISHED_METEOR_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.POLISHED_METEOR_STONE_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE), 2));
	public final RecipeGenerator POLISHED_METEOR_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.POLISHED_METEOR_STONE_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE)));

	public final RecipeGenerator POLISHED_METEOR_STONE_SLAB_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.POLISHED_METEOR_STONE_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE), 2, "smooth"));
	public final RecipeGenerator POLISHED_METEOR_STONE_STAIRS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.POLISHED_METEOR_STONE_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE), "smooth"));

	public final RecipeGenerator METEOR_STONE_BRICK_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE_BRICKS), 2));
	public final RecipeGenerator METEOR_STONE_BRICK_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE_BRICKS)));
	public final RecipeGenerator METEOR_STONE_BRICK_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_WALL, Ingredient.ofItems(AstromineFoundationsBlocks.METEOR_STONE_BRICKS)));

	public final RecipeGenerator METEOR_STONE_BRICK_SLAB_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE), 2, "smooth"));
	public final RecipeGenerator METEOR_STONE_BRICK_STAIRS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE), "smooth"));
	public final RecipeGenerator METEOR_STONE_BRICK_WALL_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_WALL, Ingredient.ofItems(AstromineFoundationsBlocks.SMOOTH_METEOR_STONE), "smooth"));

	public final RecipeGenerator METEOR_STONE_BRICK_SLAB_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE), 2, "polished"));
	public final RecipeGenerator METEOR_STONE_BRICK_STAIRS_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE), "polished"));
	public final RecipeGenerator METEOR_STONE_BRICK_WALL_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineFoundationsBlocks.METEOR_STONE_BRICK_WALL, Ingredient.ofItems(AstromineFoundationsBlocks.POLISHED_METEOR_STONE), "polished"));
}
