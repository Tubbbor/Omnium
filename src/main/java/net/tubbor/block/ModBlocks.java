package net.tubbor.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.tubbor.Omnium;
import net.tubbor.block.custom.SilvaBushBlock;

public class ModBlocks {

    public static final Block OMNIUM_BLOCK = registerBlock("omnium_block",
            new Block(AbstractBlock.Settings.create().strength(5.5F, 7.0F).requiresTool().sounds(BlockSoundGroup.METAL)));
    public static final Block INDIGO_BLOCK = registerBlock("indigo_block",
            new Block(AbstractBlock.Settings.create().strength(2.0F, 2.0F).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block SILVA_BUSH = registerBlockWithoutBlockItem("silva_bush",
            new SilvaBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)));

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(Omnium.MOD_ID, name), block);
    }

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Omnium.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Omnium.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Omnium.LOGGER.info("Registering Mod Blocks for " + Omnium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(ModBlocks.OMNIUM_BLOCK);
            entries.add(ModBlocks.INDIGO_BLOCK);
        });
    }
}
