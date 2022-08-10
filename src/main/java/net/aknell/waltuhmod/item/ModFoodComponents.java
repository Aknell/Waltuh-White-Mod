package net.aknell.waltuhmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent AMPHETAMINE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).snack().alwaysEdible().statusEffect(
            new StatusEffectInstance(StatusEffects.STRENGTH, 1200), 1f).statusEffect(
            new StatusEffectInstance(StatusEffects.NAUSEA, 1200), 1f).build();
    public static final FoodComponent METHAMPHETAMINE = new FoodComponent.Builder().hunger(0).saturationModifier(0f).snack().alwaysEdible().statusEffect(
            new StatusEffectInstance(StatusEffects.STRENGTH, 2400), 1f).statusEffect(
            new StatusEffectInstance(StatusEffects.NAUSEA, 1200), 1f).statusEffect(
            new StatusEffectInstance(StatusEffects.BLINDNESS, 2400), 1f).build();

}
