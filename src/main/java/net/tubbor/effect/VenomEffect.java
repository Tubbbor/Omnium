package net.tubbor.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class VenomEffect extends StatusEffect {
    public VenomEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean applyUpdateEffect(LivingEntity entity, int amplifier) {
        entity.damage(entity.getDamageSources().magic(), 0.5F + amplifier);

        return super.applyUpdateEffect(entity, amplifier);
    }

    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        int i = 20 >> amplifier;
        return i > 0 ? duration % i == 0 : true;
    }
}
