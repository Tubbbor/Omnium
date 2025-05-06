package net.tubbor.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.tubbor.effect.ModEffects;

public record FrostEnchantmentEffect() implements EnchantmentEntityEffect {
    public static final MapCodec<FrostEnchantmentEffect> CODEC = MapCodec.unit(FrostEnchantmentEffect::new);

    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if (user instanceof LivingEntity livingUser) {
            int duration = 200;
            int amplifier = Math.max(0, level - 1);
            livingUser.addStatusEffect(new StatusEffectInstance(ModEffects.FROSTBURN, duration, amplifier));
        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}