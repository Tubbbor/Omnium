package net.tubbor.enchantment;

import com.mojang.serialization.MapCodec;
import net.tubbor.Omnium;
import net.tubbor.enchantment.custom.FrostEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {
    public static final MapCodec<? extends EnchantmentEntityEffect> FROST =
            registerEntityEffect("frost", FrostEnchantmentEffect.CODEC);


    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec) {
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(Omnium.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects() {
        Omnium.LOGGER.info("Registering Mod Enchantment Effects for " + Omnium.MOD_ID);
    }
}