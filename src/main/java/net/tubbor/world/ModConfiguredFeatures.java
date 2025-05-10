package net.tubbor.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.tubbor.Omnium;
import net.tubbor.block.ModBlocks;
import net.tubbor.block.custom.SilvaBushBlock;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> INDIGO_BLOCK_KEY = registerKey("indigo_block");

    public static final RegistryKey<ConfiguredFeature<?, ?>> SILVA_BUSH_KEY = registerKey("silva_bush");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldIndigoOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.INDIGO_BLOCK.getDefaultState()));

        register(context, INDIGO_BLOCK_KEY, Feature.ORE, new OreFeatureConfig(overworldIndigoOres, 4, 0));


                        register(context, SILVA_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.SILVA_BUSH
                                .getDefaultState().with(SilvaBushBlock.AGE, 1))),
                        List.of(Blocks.MOSS_BLOCK)));
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Omnium.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}