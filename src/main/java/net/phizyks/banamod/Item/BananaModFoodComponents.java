package net.phizyks.banamod.Item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class BananaModFoodComponents {
    public static final FoodComponent BANANA = (new FoodComponent.Builder()).hunger(7).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 60, 1), 1.0F).statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200, 1), 0.25F).alwaysEdible().build();
}
