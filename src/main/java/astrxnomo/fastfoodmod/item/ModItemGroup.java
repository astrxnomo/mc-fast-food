package astrxnomo.fastfoodmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import astrxnomo.fastfoodmod.FastFoodMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup FASTFOOD = FabricItemGroupBuilder.build(new Identifier(FastFoodMod.MOD_ID, "fastfood"),
            () -> new ItemStack(ModItems.PIZZA));
}
