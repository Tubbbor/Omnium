package net.tubbor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.tubbor.block.ModBlocks;
import net.tubbor.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OMNIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INDIGO_BLOCK);
        blockStateModelGenerator.registerTintableCrossBlockState(
                ModBlocks.SILVA_BUSH,
                BlockStateModelGenerator.TintType.NOT_TINTED
        );
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.OMNIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.FROZEN_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.INDIGO_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAQUEM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SILVA, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHARTREUSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.OMNIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OMNIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OMNIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OMNIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OMNIUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OMNIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OMNIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OMNIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OMNIUM_BOOTS));
    }
}
