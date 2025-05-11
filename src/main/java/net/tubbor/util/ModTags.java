package net.tubbor.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.tubbor.Omnium;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_OMNIUM_TOOL = createTag("needs_omnium_tool");
        public static final TagKey<Block> INCORRECT_FOR_OMNIUM_TOOL = createTag("incorrect_for_omnium_tool");
        public static final TagKey<Block> NEEDS_LAQUEM_TOOL = createTag("needs_laquem_tool");
        public static final TagKey<Block> INCORRECT_FOR_LAQUEM_TOOL = createTag("incorrect_for_laquem_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Omnium.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> OMNIUM_TOOLS = createTag("omnium_tools");
        public static final TagKey<Item> OMNIUM_WEAPON = createTag("omnium_weapon");
        public static final TagKey<Item> LAQUEM_TOOLS = createTag("laquem_tools");
        public static final TagKey<Item> LAQUEM_WEAPON = createTag("laquem_weapon");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Omnium.MOD_ID, name));
        }
    }
}
