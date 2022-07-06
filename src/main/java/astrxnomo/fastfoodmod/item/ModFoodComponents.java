package astrxnomo.fastfoodmod.item;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PIZZA = new FoodComponent.Builder().hunger(8).saturationModifier(6f).alwaysEdible().meat().
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,20*15,1), 1f).build();
    public static final FoodComponent HAMBURGER = new FoodComponent.Builder().hunger(10).saturationModifier(6f).alwaysEdible().meat().
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,20*15,1), 1f).build();
    public static final FoodComponent TACO = new FoodComponent.Builder().hunger(6).saturationModifier(6f).alwaysEdible().meat().
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,20*15,1), 1f).build();
    public static final FoodComponent CHOCOLATE_BAR = new FoodComponent.Builder().hunger(4).saturationModifier(3f).alwaysEdible().meat().
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,20*15,1), 1f).build();
    public static final FoodComponent FRENCH_FRIES = new FoodComponent.Builder().hunger(4).saturationModifier(4f).alwaysEdible().meat().
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,20*15,1), 1f).build();
    public static final FoodComponent SODA = new FoodComponent.Builder().hunger(4).saturationModifier(2f).alwaysEdible().meat().
            statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20*15,2), 1f).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST,20*15,1), 1f).build();

    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();
    public static final FoodComponent KETCHUP = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();
    public static final FoodComponent LETTUCE = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();
    public static final FoodComponent DOUGH = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();
    public static final FoodComponent SPICE_LEAF = new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build();

}
