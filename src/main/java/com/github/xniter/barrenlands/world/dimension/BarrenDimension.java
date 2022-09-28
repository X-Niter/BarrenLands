package com.github.xniter.barrenlands.world.dimension;

import com.github.xniter.barrenlands.Barrenlands;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;

public class BarrenDimension {

    public static final ResourceKey<Level> BARRENDIM = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(Barrenlands.MOD_ID, "barrendim"));

    public static void register() {
        System.out.println("Registering Barren Lands Dimension for " + Barrenlands.MOD_ID);
        Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(Barrenlands.MOD_ID, "barren_chunkgen"),
                BarrenChunkGenerator.CODEC);
        Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(Barrenlands.MOD_ID, "biomes"),
                BarrenBiomeProvider.CODEC);
        System.out.println("Barren Lands Dimension Registered Successfully");
    }
}
