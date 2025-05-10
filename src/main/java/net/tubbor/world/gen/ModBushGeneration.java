package net.tubbor.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.tubbor.world.ModPlacedFeatures;

public class ModBushGeneration {
    public static void generateBushes() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SILVA_BUSH_PLACED_KEY);
    }
}