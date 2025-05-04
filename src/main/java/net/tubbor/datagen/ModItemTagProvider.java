package net.tubbor.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.ArmorItem;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.tubbor.item.ModItems;
import net.tubbor.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.OMNIUM_TOOLS)
                .add(ModItems.OMNIUM_AXE)
                .add(ModItems.OMNIUM_SWORD)
                .add(ModItems.OMNIUM_PICKAXE)
                .add(ModItems.OMNIUM_SHOVEL)
                .add(ModItems.OMNIUM_HOE);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.OMNIUM_AXE);
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.OMNIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.OMNIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.OMNIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.OMNIUM_HOE);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.OMNIUM_HELMET)
                .add(ModItems.OMNIUM_CHESTPLATE)
                .add(ModItems.OMNIUM_LEGGINGS)
                .add(ModItems.OMNIUM_BOOTS);
    }
}
