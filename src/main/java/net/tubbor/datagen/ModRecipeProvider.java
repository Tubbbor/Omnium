package net.tubbor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;
import net.tubbor.Omnium;
import net.tubbor.block.ModBlocks;
import net.tubbor.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.OMNIUM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.OMNIUM_INGOT)
                .criterion(hasItem(ModItems.OMNIUM_INGOT), conditionsFromItem(ModItems.OMNIUM_INGOT))
                .offerTo(exporter, Identifier.of(Omnium.MOD_ID, "omnium_from_block"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OMNIUM_INGOT)
                .pattern("PIP")
                .pattern("IFI")
                .pattern("PIP")
                .input('I', ModItems.INDIGO_SHARD)
                .input('F', ModItems.FROZEN_CORE)
                .input('P', Items.PRISMARINE_CRYSTALS)
                .criterion(hasItem(ModItems.FROZEN_CORE), conditionsFromItem(ModItems.FROZEN_CORE))
                .offerTo(exporter, Identifier.of(Omnium.MOD_ID, "omnium_from_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.LAQUEM_INGOT)
                .pattern(" I ")
                .pattern("ICI")
                .pattern(" I ")
                .input('I', ModItems.CHARTREUSE)
                .input('C', ModItems.SILVA)
                .criterion(hasItem(ModItems.SILVA), conditionsFromItem(ModItems.SILVA))
                .offerTo(exporter, Identifier.of(Omnium.MOD_ID, "laquem_from_crafting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE, 2)
                .pattern("EAE")
                .pattern("ENE")
                .pattern("EEE")
                .input('E', Items.ECHO_SHARD)
                .input('A', ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE)
                .input('N', Items.NETHERITE_INGOT)
                .criterion(hasItem(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE), conditionsFromItem(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE))
                .offerTo(exporter, Identifier.of(Omnium.MOD_ID, "antique_smithing_upgrade_template"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OMNIUM_INGOT, 9)
                .input(ModBlocks.OMNIUM_BLOCK)
                .criterion(hasItem(ModBlocks.OMNIUM_BLOCK), conditionsFromItem(ModBlocks.OMNIUM_BLOCK))
                .offerTo(exporter);

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_AXE),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.OMNIUM_AXE
                )
                .criterion("has_netherite_axe", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_AXE))
                .offerTo(exporter, Identifier.of("omnium", "omnium_axe_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_SWORD),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.OMNIUM_SWORD
                )
                .criterion("has_netherite_sword", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_SWORD))
                .offerTo(exporter, Identifier.of("omnium", "omnium_sword_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_PICKAXE),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.OMNIUM_PICKAXE
                )
                .criterion("has_netherite_pickaxe", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_PICKAXE))
                .offerTo(exporter, Identifier.of("omnium", "omnium_pickaxe_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_SHOVEL),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.OMNIUM_SHOVEL
                )
                .criterion("has_netherite_shovel", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_SHOVEL))
                .offerTo(exporter, Identifier.of("omnium", "omnium_shovel_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_HOE),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.TOOLS,
                        ModItems.OMNIUM_HOE
                )
                .criterion("has_netherite_hoe", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_HOE))
                .offerTo(exporter, Identifier.of("omnium", "omnium_hoe_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_HELMET),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.OMNIUM_HELMET
                )
                .criterion("has_netherite_helmet", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_HELMET))
                .offerTo(exporter, Identifier.of("omnium", "omnium_helmet_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_CHESTPLATE),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.OMNIUM_CHESTPLATE
                )
                .criterion("has_netherite_chestplate", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_CHESTPLATE))
                .offerTo(exporter, Identifier.of("omnium", "omnium_chestplate_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_LEGGINGS),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.OMNIUM_LEGGINGS
                )
                .criterion("has_netherite_leggings", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_LEGGINGS))
                .offerTo(exporter, Identifier.of("omnium", "omnium_leggings_upgrade"));

        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.ANTIQUE_SMITHING_UPGRADE_TEMPLATE),
                        Ingredient.ofItems(Items.NETHERITE_BOOTS),
                        Ingredient.ofItems(ModItems.OMNIUM_INGOT),
                        RecipeCategory.COMBAT,
                        ModItems.OMNIUM_BOOTS
                )
                .criterion("has_boots_helmet", InventoryChangedCriterion.Conditions.items(Items.NETHERITE_BOOTS))
                .offerTo(exporter, Identifier.of("omnium", "omnium_boots_upgrade"));
    }
}