package net.tubbor.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.tubbor.world.ModPlacedFeatures;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.STONY_PEAKS, BiomeKeys.JAGGED_PEAKS, BiomeKeys.FROZEN_PEAKS), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.INDIGO_BLOCK_PLACED_KEY);

        // Example for individual Bioms
        // BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.PLAINS),
        // GenerationStep.Feature.UNDERGROUND_ORES,
        //         ModPlacedFeatures.PINK_GARNET_ORE_PLACED_KEY);
    }
}