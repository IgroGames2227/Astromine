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

package com.github.mixinors.astromine.registry;

import com.github.mixinors.astromine.AMCommon;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

import java.util.HashSet;
import java.util.Set;

public class AMBiomes {
	private static final Set<RegistryKey<?>> KEYS = new HashSet<>();
	
	public static final Identifier ASTEROID_BELT_ID = AMCommon.id("asteroid_belt");
	public static final RegistryKey<Biome> ASTEROID_BELT = register(Registry.BIOME_KEY, ASTEROID_BELT_ID);
	
	public static final Identifier VULCAN_PLAINS_ID = AMCommon.id("vulcan_plains");
	public static final RegistryKey<Biome> VULCAN_PLAINS = register(Registry.BIOME_KEY, VULCAN_PLAINS_ID);
	
	public static final Identifier LUNAR_PLAINS_ID = AMCommon.id("lunar_plains");
	public static final RegistryKey<Biome> LUNAR_PLAINS = register(Registry.BIOME_KEY, LUNAR_PLAINS_ID);
	public static final Identifier LUNAR_HILLS_ID = AMCommon.id("lunar_hills");
	public static final RegistryKey<Biome> LUNAR_HILLS = register(Registry.BIOME_KEY, LUNAR_HILLS_ID);
	public static final Identifier LUNAR_LOWLANDS_ID = AMCommon.id("lunar_lowlands");
	public static final RegistryKey<Biome> LUNAR_LOWLANDS = register(Registry.BIOME_KEY, LUNAR_LOWLANDS_ID);
	
	public static final Identifier MARTIAN_PLAINS_ID = AMCommon.id("martian_plains");
	public static final RegistryKey<Biome> MARTIAN_PLAINS = register(Registry.BIOME_KEY, MARTIAN_PLAINS_ID);
	public static final Identifier MARTIAN_RIVERBED_ID = AMCommon.id("martian_riverbed");
	public static final RegistryKey<Biome> MARTIAN_RIVERBED = register(Registry.BIOME_KEY, MARTIAN_RIVERBED_ID);
	
	public static final Identifier GLACIOS_ID = AMCommon.id("glacios");
	public static final RegistryKey<Biome> GLACIOS = register(Registry.BIOME_KEY, GLACIOS_ID);
	
	public static void init() {
	
	}

	public static <T> RegistryKey<T> register(RegistryKey<Registry<T>> registry, Identifier identifier) {
		RegistryKey<T> key = RegistryKey.of(registry, identifier);
		KEYS.add(key);
		return key;
	}

	public static boolean isAstromine(RegistryKey<?> key) {
		return KEYS.contains(key);
	}
}
