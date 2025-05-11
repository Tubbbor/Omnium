package net.tubbor.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tubbor.Omnium;
import net.tubbor.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup OMNIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Omnium.MOD_ID, "omnium"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.OMNIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.omnium.omnium"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.OMNIUM_INGOT);
                        entries.add(ModItems.FROZEN_CORE);
                        entries.add(ModItems.INDIGO_SHARD);
                        entries.add(ModItems.LAQUEM_INGOT);
                        entries.add(ModItems.SILVA);
                        entries.add(ModItems.CHARTREUSE);
                        entries.add(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE);

                        entries.add(ModBlocks.OMNIUM_BLOCK);
                        entries.add(ModBlocks.INDIGO_BLOCK);

                        entries.add(ModItems.OMNIUM_AXE);
                        entries.add(ModItems.OMNIUM_SWORD);
                        entries.add(ModItems.OMNIUM_PICKAXE);
                        entries.add(ModItems.OMNIUM_SHOVEL);
                        entries.add(ModItems.OMNIUM_HOE);
                        entries.add(ModItems.LAQUEM_AXE);
                        entries.add(ModItems.LAQUEM_SWORD);
                        entries.add(ModItems.LAQUEM_PICKAXE);
                        entries.add(ModItems.LAQUEM_SHOVEL);
                        entries.add(ModItems.LAQUEM_HOE);

                        entries.add(ModItems.OMNIUM_HELMET);
                        entries.add(ModItems.OMNIUM_CHESTPLATE);
                        entries.add(ModItems.OMNIUM_LEGGINGS);
                        entries.add(ModItems.OMNIUM_BOOTS);
                        entries.add(ModItems.LAQUEM_HELMET);
                        entries.add(ModItems.LAQUEM_CHESTPLATE);
                        entries.add(ModItems.LAQUEM_LEGGINGS);
                        entries.add(ModItems.LAQUEM_BOOTS);
                    })
                    .build());

    public static void registerItemGroups() {
        Omnium.LOGGER.info("Registering Item Groups for " + Omnium.MOD_ID);
    }
}
