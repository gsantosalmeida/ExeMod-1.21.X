package net.gabi.exemod.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponentes {
    public static final FoodComponent COUVE_FLOR = new FoodComponent.Builder().nutrition(3).saturationModifier(2.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200), 0.15F).build();

}
