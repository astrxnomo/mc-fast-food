package astrxnomo.fastfoodmod.item;

import astrxnomo.fastfoodmod.FastFoodMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item PIZZA = registerItem("pizza",
            new Item(new FabricItemSettings().group(ModItemGroup.FASTFOOD).food(ModFoodComponents.PIZZA).rarity(Rarity.UNCOMMON)));

    public static final Item HAMBURGER = registerItem("hamburger",
            new Item(new FabricItemSettings().group(ModItemGroup.FASTFOOD).food(ModFoodComponents.HAMBURGER).rarity(Rarity.UNCOMMON)));

    public static final Item TACO = registerItem("taco",
            new Item(new FabricItemSettings().group(ModItemGroup.FASTFOOD).food(ModFoodComponents.TACO).rarity(Rarity.UNCOMMON)));

    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar",
                new Item(new FabricItemSettings().group(ModItemGroup.FASTFOOD).food(ModFoodComponents.CHOCOLATE_BAR).rarity(Rarity.UNCOMMON)));

    public static final Item FRENCH_FRIES = registerItem("french_fries",
            new Item(new FabricItemSettings().group(ModItemGroup.FASTFOOD).food(ModFoodComponents.FRENCH_FRIES).rarity(Rarity.UNCOMMON)));

    public static final Item SODA = registerItem("soda",
            new Item(new FabricItemSettings().group(ModItemGroup.FASTFOOD).food(ModFoodComponents.SODA).rarity(Rarity.UNCOMMON)));


    public static final Item CHEESE = registerItem("cheese",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.CHEESE)));

    public static final Item KETCHUP = registerItem("ketchup",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.KETCHUP)));

    public static final Item LETTUCE = registerItem("lettuce",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.LETTUCE)));

    public static final Item DOUGH = registerItem("dough",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.DOUGH)));

    public static final Item SPICE_LEAF = registerItem("spice_leaf",
            new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(ModFoodComponents.SPICE_LEAF)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(FastFoodMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FastFoodMod.LOGGER.info("Registering Mod Items for " + FastFoodMod.MOD_ID);
    }
}
