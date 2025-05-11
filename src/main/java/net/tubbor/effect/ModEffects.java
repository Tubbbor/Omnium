package net.tubbor.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.tubbor.Omnium;

public class ModEffects {
    public static final RegistryEntry<StatusEffect> FROSTBURN = registerStatusEffect("frostburn",
            new FrostburnEffect(StatusEffectCategory.HARMFUL, 0x00FFFF)
                    .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED,
                            Identifier.of(Omnium.MOD_ID, "frostburn"), -0.10f,
                            EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL));

    public static final RegistryEntry<StatusEffect> VENOM = registerStatusEffect("venom",
            new VenomEffect(StatusEffectCategory.HARMFUL, 0x00FF00));

    private static RegistryEntry<StatusEffect>  registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.registerReference(Registries.STATUS_EFFECT, Identifier.of(Omnium.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        Omnium.LOGGER.info("Registering Mod Effects for " + Omnium.MOD_ID);
    }
}
