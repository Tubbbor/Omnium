package net.tubbor.enchantment;

import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.predicate.item.EnchantmentsPredicate;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.tubbor.Omnium;
import net.tubbor.enchantment.custom.FrostEnchantmentEffect;
import net.tubbor.util.ModTags;

public class ModEnchantments {
    public static final RegistryKey<Enchantment> FROST =
            RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(Omnium.MOD_ID, "frost"));

    public static void bootstrap(Registerable<Enchantment> registerable) {
        var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

        register(registerable, FROST, Enchantment.builder(Enchantment.definition(
                        items.getOrThrow(ModTags.Items.OMNIUM_TOOLS),
                        items.getOrThrow(ModTags.Items.OMNIUM_WEAPON),
                        5,
                        2,
                        Enchantment.leveledCost(5, 7),
                        Enchantment.leveledCost(25, 9),
                        7,
                        AttributeModifierSlot.MAINHAND))
                .exclusiveSet(enchantments.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE_SET))
                .exclusiveSet(enchantments.getOrThrow(EnchantmentTags.TREASURE))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                        EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                        new FrostEnchantmentEffect()));
    }


    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
        registry.register(key, builder.build(key.getValue()));
    }
}