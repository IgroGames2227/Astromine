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

package com.github.mixinors.astromine.discoveries.datagen.registry;

import net.minecraft.recipe.Ingredient;

import com.github.mixinors.astromine.datagen.generator.recipe.RecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.onetime.Crafting2x2RecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.onetime.Crafting3x3RecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.onetime.SlabCraftingRecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.onetime.SmeltingRecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.onetime.StairsCraftingRecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.onetime.StonecuttingRecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.onetime.WallCraftingRecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.set.BlastingSetRecipeGenerator;
import com.github.mixinors.astromine.datagen.generator.recipe.set.SmeltingSetRecipeGenerator;
import com.github.mixinors.astromine.datagen.registry.AstromineRecipeGenerators;
import com.github.mixinors.astromine.discoveries.datagen.generators.recipe.TrituratingRecipeGenerator;

import static com.github.mixinors.astromine.datagen.material.MaterialItemType.ASTEROID_CLUSTER;
import static com.github.mixinors.astromine.datagen.material.MaterialItemType.ASTEROID_ORE;
import static com.github.mixinors.astromine.datagen.material.MaterialItemType.DUST;
import static com.github.mixinors.astromine.datagen.material.MaterialItemType.GEM;
import static com.github.mixinors.astromine.datagen.material.MaterialItemType.INGOT;
import static com.github.mixinors.astromine.datagen.material.MaterialItemType.MISC_RESOURCE;
import static com.github.mixinors.astromine.datagen.material.MaterialItemType.MOON_ORE;


public class AstromineRecipeGenerators extends AstromineRecipeGenerators {
	public final RecipeGenerator ASTEROID_ORE_TO_INGOT = register(new SmeltingSetRecipeGenerator(ASTEROID_ORE, INGOT));
	public final RecipeGenerator ASTEROID_ORE_TO_GEM = register(new SmeltingSetRecipeGenerator(ASTEROID_ORE, GEM));
	public final RecipeGenerator ASTEROID_ORE_TO_MISC = register(new SmeltingSetRecipeGenerator(ASTEROID_ORE, MISC_RESOURCE));
	public final RecipeGenerator ASTEROID_CLUSTER_TO_INGOT = register(new SmeltingSetRecipeGenerator(ASTEROID_CLUSTER, INGOT));
	public final RecipeGenerator ASTEROID_CLUSTER_TO_GEM = register(new SmeltingSetRecipeGenerator(ASTEROID_CLUSTER, GEM));
	public final RecipeGenerator ASTEROID_CLUSTER_TO_MISC = register(new SmeltingSetRecipeGenerator(ASTEROID_CLUSTER, MISC_RESOURCE));

	public final RecipeGenerator MOON_ORE_TO_INGOT = register(new SmeltingSetRecipeGenerator(MOON_ORE, INGOT));
	public final RecipeGenerator MOON_ORE_TO_GEM = register(new SmeltingSetRecipeGenerator(MOON_ORE, GEM));
	public final RecipeGenerator MOON_ORE_TO_MISC = register(new SmeltingSetRecipeGenerator(MOON_ORE, MISC_RESOURCE));

	public final RecipeGenerator ASTEROID_ORE_TO_INGOT_BLASTING = register(new BlastingSetRecipeGenerator(ASTEROID_ORE, INGOT));
	public final RecipeGenerator ASTEROID_ORE_TO_GEM_BLASTING = register(new BlastingSetRecipeGenerator(ASTEROID_ORE, GEM));
	public final RecipeGenerator ASTEROID_ORE_TO_MISC_BLASTING = register(new BlastingSetRecipeGenerator(ASTEROID_ORE, MISC_RESOURCE));
	public final RecipeGenerator ASTEROID_CLUSTER_TO_INGOT_BLASTING = register(new BlastingSetRecipeGenerator(ASTEROID_CLUSTER, INGOT));
	public final RecipeGenerator ASTEROID_CLUSTER_TO_GEM_BLASTING = register(new BlastingSetRecipeGenerator(ASTEROID_CLUSTER, GEM));
	public final RecipeGenerator ASTEROID_CLUSTER_TO_MISC_BLASTING = register(new BlastingSetRecipeGenerator(ASTEROID_CLUSTER, MISC_RESOURCE));

	public final RecipeGenerator MOON_ORE_TO_INGOT_BLASTING = register(new BlastingSetRecipeGenerator(MOON_ORE, INGOT));
	public final RecipeGenerator MOON_ORE_TO_GEM_BLASTING = register(new BlastingSetRecipeGenerator(MOON_ORE, GEM));
	public final RecipeGenerator MOON_ORE_TO_MISC_BLASTING = register(new BlastingSetRecipeGenerator(MOON_ORE, MISC_RESOURCE));

	public final RecipeGenerator ASTEROID_ORE_TO_DUSTS = register(new TrituratingRecipeGenerator(ASTEROID_ORE, DUST, 2, 90, 340));
	public final RecipeGenerator ASTEROID_CLUSTER_TO_DUSTS = register(new TrituratingRecipeGenerator(ASTEROID_CLUSTER, DUST, 2, 90, 340));

	public final RecipeGenerator MOON_ORE_TO_DUSTS = register(new TrituratingRecipeGenerator(MOON_ORE, DUST, 2, 90, 340));

	public final RecipeGenerator SMOOTH_ASTEROID_STONE = register(new SmeltingRecipeGenerator(Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE), AstromineBlocks.SMOOTH_ASTEROID_STONE));
	public final RecipeGenerator SMOOTH_MARTIAN_STONE = register(new SmeltingRecipeGenerator(Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE), AstromineBlocks.SMOOTH_MARTIAN_STONE));
	public final RecipeGenerator SMOOTH_VULCAN_STONE = register(new SmeltingRecipeGenerator(Ingredient.ofItems(AstromineBlocks.VULCAN_STONE), AstromineBlocks.SMOOTH_VULCAN_STONE));
	
	public final RecipeGenerator POLISHED_ASTEROID_STONE = register(new Crafting2x2RecipeGenerator(AstromineBlocks.POLISHED_ASTEROID_STONE, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE), 4));
	public final RecipeGenerator POLISHED_MARTIAN_STONE = register(new Crafting2x2RecipeGenerator(AstromineBlocks.POLISHED_MARTIAN_STONE, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE), 4));
	public final RecipeGenerator POLISHED_VULCAN_STONE = register(new Crafting2x2RecipeGenerator(AstromineBlocks.POLISHED_VULCAN_STONE, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE), 4));

	public final RecipeGenerator ASTEROID_STONE_BRICKS = register(new Crafting2x2RecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.POLISHED_ASTEROID_STONE), 4));
	public final RecipeGenerator MARTIAN_STONE_BRICKS = register(new Crafting2x2RecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.POLISHED_MARTIAN_STONE), 4));
	public final RecipeGenerator VULCAN_STONE_BRICKS = register(new Crafting2x2RecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.POLISHED_VULCAN_STONE), 4));
	
	public final RecipeGenerator ASTEROID_STONE_SLAB = register(new SlabCraftingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE)));
	public final RecipeGenerator MOON_STONE_SLAB = register(new SlabCraftingRecipeGenerator(AstromineBlocks.MOON_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.MOON_STONE)));
	public final RecipeGenerator MARTIAN_STONE_SLAB = register(new SlabCraftingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE)));
	public final RecipeGenerator VULCAN_STONE_SLAB = register(new SlabCraftingRecipeGenerator(AstromineBlocks.VULCAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE)));

	public final RecipeGenerator ASTEROID_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE)));
	public final RecipeGenerator MOON_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.MOON_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.MOON_STONE)));
	public final RecipeGenerator MARTIAN_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE)));
	public final RecipeGenerator VULCAN_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.VULCAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE)));

	public final RecipeGenerator SMOOTH_ASTEROID_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.SMOOTH_ASTEROID_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE)));
	public final RecipeGenerator SMOOTH_MARTIAN_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.SMOOTH_MARTIAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE)));
	public final RecipeGenerator SMOOTH_VULCAN_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.SMOOTH_VULCAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE)));

	public final RecipeGenerator POLISHED_ASTEROID_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.POLISHED_ASTEROID_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_ASTEROID_STONE)));
	public final RecipeGenerator POLISHED_MARTIAN_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.POLISHED_MARTIAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_MARTIAN_STONE)));
	public final RecipeGenerator POLISHED_VULCAN_STONE_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.POLISHED_VULCAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_VULCAN_STONE)));

	public final RecipeGenerator ASTEROID_STONE_BRICK_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE_BRICKS)));
	public final RecipeGenerator MARTIAN_STONE_BRICK_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE_BRICKS)));
	public final RecipeGenerator VULCAN_STONE_BRICK_STAIRS = register(new StairsCraftingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE_BRICKS)));
	
	public final RecipeGenerator ASTEROID_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_WALL, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE)));
	public final RecipeGenerator MOON_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.MOON_STONE_WALL, Ingredient.ofItems(AstromineBlocks.MOON_STONE)));
	public final RecipeGenerator MARTIAN_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_WALL, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE)));
	public final RecipeGenerator VULCAN_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.VULCAN_STONE_WALL, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE)));

	public final RecipeGenerator SMOOTH_ASTEROID_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.SMOOTH_ASTEROID_STONE_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE)));
	public final RecipeGenerator SMOOTH_MARTIAN_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.SMOOTH_MARTIAN_STONE_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE)));
	public final RecipeGenerator SMOOTH_VULCAN_STONE_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.SMOOTH_VULCAN_STONE_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE)));

	public final RecipeGenerator ASTEROID_STONE_BRICK_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE_BRICKS)));
	public final RecipeGenerator MARTIAN_STONE_BRICK_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE_BRICKS)));
	public final RecipeGenerator VULCAN_STONE_BRICK_WALL = register(new WallCraftingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE_BRICKS)));

	public final RecipeGenerator POLISHED_ASTEROID_STONE_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_ASTEROID_STONE, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE)));
	public final RecipeGenerator POLISHED_MARTIAN_STONE_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_MARTIAN_STONE, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE)));
	public final RecipeGenerator POLISHED_VULCAN_STONE_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_VULCAN_STONE, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE)));

	public final RecipeGenerator ASTEROID_STONE_BRICKS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE), "smooth"));
	public final RecipeGenerator MARTIAN_STONE_BRICKS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE), "smooth"));
	public final RecipeGenerator VULCAN_STONE_BRICKS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE), "smooth"));
	
	public final RecipeGenerator ASTEROID_STONE_BRICKS_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.POLISHED_ASTEROID_STONE), "polished"));
	public final RecipeGenerator MARTIAN_STONE_BRICKS_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.POLISHED_MARTIAN_STONE), "polished"));
	public final RecipeGenerator VULCAN_STONE_BRICKS_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICKS, Ingredient.ofItems(AstromineBlocks.POLISHED_VULCAN_STONE), "polished"));
	
	public final RecipeGenerator ASTEROID_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE), 2));
	public final RecipeGenerator MOON_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MOON_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.MOON_STONE), 2));
	public final RecipeGenerator MARTIAN_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE), 2));
	public final RecipeGenerator VULCAN_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE), 2));

	public final RecipeGenerator SMOOTH_ASTEROID_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_ASTEROID_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE), 2));
	public final RecipeGenerator SMOOTH_MARTIAN_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_MARTIAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE), 2));
	public final RecipeGenerator SMOOTH_VULCAN_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_VULCAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE), 2));

	public final RecipeGenerator POLISHED_ASTEROID_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_ASTEROID_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.POLISHED_ASTEROID_STONE), 2));
	public final RecipeGenerator POLISHED_MARTIAN_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_MARTIAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.POLISHED_MARTIAN_STONE), 2));
	public final RecipeGenerator POLISHED_VULCAN_STONE_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_VULCAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.POLISHED_VULCAN_STONE), 2));

	public final RecipeGenerator POLISHED_ASTEROID_STONE_SLAB_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_ASTEROID_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE), 2, "smooth"));
	public final RecipeGenerator POLISHED_MARTIAN_STONE_SLAB_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_MARTIAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE), 2, "smooth"));
	public final RecipeGenerator POLISHED_VULCAN_STONE_SLAB_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_VULCAN_STONE_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE), 2, "smooth"));
	
	public final RecipeGenerator ASTEROID_STONE_BRICK_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE_BRICKS), 2));
	public final RecipeGenerator MARTIAN_STONE_BRICK_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE_BRICKS), 2));
	public final RecipeGenerator VULCAN_STONE_BRICK_SLAB_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE_BRICKS), 2));

	public final RecipeGenerator ASTEROID_STONE_BRICK_SLAB_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE), 2, "smooth"));
	public final RecipeGenerator MARTIAN_STONE_BRICK_SLAB_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE), 2, "smooth"));
	public final RecipeGenerator VULCAN_STONE_BRICK_SLAB_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE), 2, "smooth"));
	
	public final RecipeGenerator ASTEROID_STONE_BRICK_SLAB_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.POLISHED_ASTEROID_STONE), 2, "polished"));
	public final RecipeGenerator MARTIAN_STONE_BRICK_SLAB_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.POLISHED_MARTIAN_STONE), 2, "polished"));
	public final RecipeGenerator VULCAN_STONE_BRICK_SLAB_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_SLAB, Ingredient.ofItems(AstromineBlocks.POLISHED_VULCAN_STONE), 2, "polished"));
	
	public final RecipeGenerator ASTEROID_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE)));
	public final RecipeGenerator MOON_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MOON_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.MOON_STONE)));
	public final RecipeGenerator MARTIAN_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE)));
	public final RecipeGenerator VULCAN_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE)));

	public final RecipeGenerator SMOOTH_ASTEROID_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_ASTEROID_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE)));
	public final RecipeGenerator SMOOTH_MARTIAN_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_MARTIAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE)));
	public final RecipeGenerator SMOOTH_VULCAN_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_VULCAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE)));

	public final RecipeGenerator POLISHED_ASTEROID_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_ASTEROID_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_ASTEROID_STONE)));
	public final RecipeGenerator POLISHED_MARTIAN_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_MARTIAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_MARTIAN_STONE)));
	public final RecipeGenerator POLISHED_VULCAN_STONE_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_VULCAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_VULCAN_STONE)));

	public final RecipeGenerator POLISHED_ASTEROID_STONE_STAIRS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_ASTEROID_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE), "smooth"));
	public final RecipeGenerator POLISHED_MARTIAN_STONE_STAIRS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_MARTIAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE), "smooth"));
	public final RecipeGenerator POLISHED_VULCAN_STONE_STAIRS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.POLISHED_VULCAN_STONE_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE), "smooth"));

	public final RecipeGenerator ASTEROID_STONE_BRICK_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE_BRICKS)));
	public final RecipeGenerator MARTIAN_STONE_BRICK_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE_BRICKS)));
	public final RecipeGenerator VULCAN_STONE_BRICK_STAIRS_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE_BRICKS)));

	public final RecipeGenerator ASTEROID_STONE_BRICK_STAIRS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE), "smooth"));
	public final RecipeGenerator MARTIAN_STONE_BRICK_STAIRS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE), "smooth"));
	public final RecipeGenerator VULCAN_STONE_BRICK_STAIRS_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE), "smooth"));

	public final RecipeGenerator ASTEROID_STONE_BRICK_STAIRS_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_ASTEROID_STONE), "polished"));
	public final RecipeGenerator MARTIAN_STONE_BRICK_STAIRS_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_MARTIAN_STONE), "polished"));
	public final RecipeGenerator VULCAN_STONE_BRICK_STAIRS_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_STAIRS, Ingredient.ofItems(AstromineBlocks.POLISHED_VULCAN_STONE), "polished"));

	public final RecipeGenerator ASTEROID_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_WALL, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE)));
	public final RecipeGenerator MOON_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MOON_STONE_WALL, Ingredient.ofItems(AstromineBlocks.MOON_STONE)));
	public final RecipeGenerator MARTIAN_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_WALL, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE)));
	public final RecipeGenerator VULCAN_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_WALL, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE)));

	public final RecipeGenerator SMOOTH_ASTEROID_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_ASTEROID_STONE_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE)));
	public final RecipeGenerator SMOOTH_MARTIAN_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_MARTIAN_STONE_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE)));
	public final RecipeGenerator SMOOTH_VULCAN_STONE_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.SMOOTH_VULCAN_STONE_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE)));
	
	public final RecipeGenerator ASTEROID_STONE_BRICK_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.ASTEROID_STONE_BRICKS)));
	public final RecipeGenerator MARTIAN_STONE_BRICK_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.MARTIAN_STONE_BRICKS)));
	public final RecipeGenerator VULCAN_STONE_BRICK_WALL_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.VULCAN_STONE_BRICKS)));

	public final RecipeGenerator ASTEROID_STONE_BRICK_WALL_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_ASTEROID_STONE), "smooth"));
	public final RecipeGenerator MARTIAN_STONE_BRICK_WALL_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_MARTIAN_STONE), "smooth"));
	public final RecipeGenerator VULCAN_STONE_BRICK_WALL_FROM_SMOOTH_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.SMOOTH_VULCAN_STONE), "smooth"));
	
	public final RecipeGenerator ASTEROID_STONE_BRICK_WALL_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.ASTEROID_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.POLISHED_ASTEROID_STONE), "polished"));
	public final RecipeGenerator MARTIAN_STONE_BRICK_WALL_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.MARTIAN_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.POLISHED_MARTIAN_STONE), "polished"));
	public final RecipeGenerator VULCAN_STONE_BRICK_WALL_FROM_POLISHED_STONECUTTING = register(new StonecuttingRecipeGenerator(AstromineBlocks.VULCAN_STONE_BRICK_WALL, Ingredient.ofItems(AstromineBlocks.POLISHED_VULCAN_STONE), "polished"));

	public final RecipeGenerator SPACE_SLIME_BLOCK = register(new Crafting3x3RecipeGenerator(AstromineBlocks.SPACE_SLIME_BLOCK, Ingredient.ofItems(AstromineItems.SPACE_SLIME_BALL)));

	public static void initialize() {

	}
}
