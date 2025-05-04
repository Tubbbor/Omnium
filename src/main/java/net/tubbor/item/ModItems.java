package net.tubbor.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tubbor.Omnium;

import static net.minecraft.item.Items.ENCHANTED_BOOK;
import static net.minecraft.item.Items.register;


public class ModItems {

    public static final Item OMNIUM_INGOT = registerItem("omnium_ingot", new Item(new Item.Settings()));
    public static final Item INDIGO_SHARD = registerItem("indigo_shard", new Item(new Item.Settings()));
    public static final Item CHARTREUSE = registerItem("chartreuse", new Item(new Item.Settings()));

    public static final Item OMNIUM_SMITHING_UPGRADE_TEMPLATE = registerItem(
            "omnium_smithing_upgrade_template",
            new Item(new Item.Settings())
    );


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

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Omnium.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Omnium.LOGGER.info("Registering ModItems for " + Omnium.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH).register(entries -> {
            entries.add(OMNIUM_INGOT);
            entries.add(INDIGO_SHARD);
            entries.add(CHARTREUSE);
            entries.add(OMNIUM_SMITHING_UPGRADE_TEMPLATE);

            entries.add(OMNIUM_AXE);
            entries.add(OMNIUM_PICKAXE);
            entries.add(OMNIUM_SWORD);
            entries.add(OMNIUM_SHOVEL);
            entries.add(OMNIUM_HOE);

            entries.add(OMNIUM_HELMET);
            entries.add(OMNIUM_CHESTPLATE);
            entries.add(OMNIUM_LEGGINGS);
            entries.add(OMNIUM_BOOTS);
        });
    }
}
