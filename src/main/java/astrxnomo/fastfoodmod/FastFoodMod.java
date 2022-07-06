package astrxnomo.fastfoodmod;

import net.fabricmc.api.ModInitializer;
import astrxnomo.fastfoodmod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FastFoodMod implements ModInitializer {
	public static final String MOD_ID = "fastfoodmod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();


	}
}
