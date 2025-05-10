package net.tubbor.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import net.tubbor.Omnium;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> INDIGO_BLOCK_PLACED_KEY = registerKey("indigo_block_placed");

    public static final RegistryKey<PlacedFeature> SILVA_BUSH_PLACED_KEY = registerKey("silva_bush_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, INDIGO_BLOCK_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.INDIGO_BLOCK_KEY),
                ModOrePlacement.modifiersWithCount(70,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(128), YOffset.fixed(480))));

        register(
                context,
                SILVA_BUSH_PLACED_KEY,
                configuredFeatures.getOrThrow(ModConfiguredFeatures.SILVA_BUSH_KEY),
                RarityFilterPlacementModifier.of(1),                 // ~once every 25 chunks
                CountPlacementModifier.of(2),                         // only one attempt per chunk
                SquarePlacementModifier.of(),
                HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(80)),
                BiomePlacementModifier.of()
        );
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Omnium.MOD_ID, name));
    }

    private static void register(
            Registerable<PlacedFeature> context,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> configuration,
            List<PlacementModifier> modifiers
    ) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(
            Registerable<PlacedFeature> context,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?, ?>> configuration,
            PlacementModifier... modifiers
    ) {
        register(context, key, configuration, List.of(modifiers));
    }
}
