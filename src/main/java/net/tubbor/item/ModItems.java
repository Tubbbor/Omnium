package net.tubbor.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tubbor.Omnium;
import net.tubbor.block.ModBlocks;


public class ModItems {
//Items
    public static final Item OMNIUM_INGOT = registerItem("omnium_ingot", new Item(new Item.Settings()));
    public static final Item FROZEN_CORE = registerItem("frozen_core", new Item(new Item.Settings()));
    public static final Item INDIGO_SHARD = registerItem("indigo_shard", new Item(new Item.Settings()));
    public static final Item LAQUEM_INGOT = registerItem("laquem_ingot", new Item(new Item.Settings()));
    public static final Item SILVA = registerItem("silva",
            new AliasedBlockItem(ModBlocks.SILVA_BUSH, new Item.Settings()));
    public static final Item CHARTREUSE = registerItem("chartreuse", new Item(new Item.Settings()));

    public static final Item ANTIQUE_SMITHING_UPGRADE_TEMPLATE = registerItem(
            "antique_smithing_upgrade_template",
            new Item(new Item.Settings())
    );

//Tools
    public static final Item OMNIUM_AXE = registerItem("omnium_axe",
            new AxeItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.OMNIUM, 5.0F, -3.0F))));
    public static final Item OMNIUM_SWORD = registerItem("omnium_sword",
            new SwordItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.OMNIUM, 3, -2.4F))));
    public static final Item OMNIUM_PICKAXE = registerItem("omnium_pickaxe",
            new PickaxeItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.OMNIUM, 1.0F, -2.8F))));
    public static final Item OMNIUM_SHOVEL = registerItem("omnium_shovel",
            new ShovelItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.OMNIUM, 1.5F, -3.0F))));
    public static final Item OMNIUM_HOE = registerItem("omnium_hoe",
            new HoeItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.OMNIUM, -4.0F, 0.0F))));

    public static final Item LAQUEM_AXE = registerItem("laquem_axe",
            new AxeItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.LAQUEM, 5.0F, -3.0F))));
    public static final Item LAQUEM_SWORD = registerItem("laquem_sword",
            new SwordItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LAQUEM, 3, -2.4F))));
    public static final Item LAQUEM_PICKAXE = registerItem("laquem_pickaxe",
            new PickaxeItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LAQUEM, 1.0F, -2.8F))));
    public static final Item LAQUEM_SHOVEL = registerItem("laquem_shovel",
            new ShovelItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.LAQUEM, 1.5F, -3.0F))));
    public static final Item LAQUEM_HOE = registerItem("laquem_hoe",
            new HoeItem(ModToolMaterials.OMNIUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.LAQUEM, -4.0F, 0.0F))));

//Armor
    public static final Item OMNIUM_HELMET = registerItem(
            "omnium_helmet",
            new ArmorItem(ModArmorMaterials.OMNIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40)))
    );
    public static final Item OMNIUM_CHESTPLATE = registerItem(
            "omnium_chestplate",
            new ArmorItem(ModArmorMaterials.OMNIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40)))
    );
    public static final Item OMNIUM_LEGGINGS = registerItem(
            "omnium_leggings",
            new ArmorItem(ModArmorMaterials.OMNIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40)))
    );
    public static final Item OMNIUM_BOOTS = registerItem(
            "omnium_boots",
            new ArmorItem(ModArmorMaterials.OMNIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40)))
    );

    public static final Item LAQUEM_HELMET = registerItem(
            "laquem_helmet",
            new ArmorItem(ModArmorMaterials.LAQUEM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40)))
    );
    public static final Item LAQUEM_CHESTPLATE = registerItem(
            "laquem_chestplate",
            new ArmorItem(ModArmorMaterials.LAQUEM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(40)))
    );
    public static final Item LAQUEM_LEGGINGS = registerItem(
            "laquem_leggings",
            new ArmorItem(ModArmorMaterials.LAQUEM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(40)))
    );
    public static final Item LAQUEM_BOOTS = registerItem(
            "laquem_boots",
            new ArmorItem(ModArmorMaterials.LAQUEM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40)))
    );

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Omnium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Omnium.LOGGER.info("Registering ModItems for " + Omnium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(OMNIUM_INGOT);
            entries.add(FROZEN_CORE);
            entries.add(INDIGO_SHARD);
            entries.add(LAQUEM_INGOT);
            entries.add(SILVA);
            entries.add(CHARTREUSE);
            entries.add(ANTIQUE_SMITHING_UPGRADE_TEMPLATE);

            entries.add(OMNIUM_AXE);
            entries.add(OMNIUM_PICKAXE);
            entries.add(OMNIUM_SWORD);
            entries.add(OMNIUM_SHOVEL);
            entries.add(OMNIUM_HOE);
            entries.add(LAQUEM_AXE);
            entries.add(LAQUEM_PICKAXE);
            entries.add(LAQUEM_SWORD);
            entries.add(LAQUEM_SHOVEL);
            entries.add(LAQUEM_HOE);

            entries.add(OMNIUM_HELMET);
            entries.add(OMNIUM_CHESTPLATE);
            entries.add(OMNIUM_LEGGINGS);
            entries.add(OMNIUM_BOOTS);
            entries.add(LAQUEM_HELMET);
            entries.add(LAQUEM_CHESTPLATE);
            entries.add(LAQUEM_LEGGINGS);
            entries.add(LAQUEM_BOOTS);
        });
    }
}
