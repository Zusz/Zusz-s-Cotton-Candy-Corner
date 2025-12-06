package net.zusz.zcottoncandymod;

import net.fabricmc.api.ModInitializer;

import net.zusz.zcottoncandymod.blocks.ModBlocks;
import net.zusz.zcottoncandymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZCottonCandyMod implements ModInitializer {
	public static final String MOD_ID = "zcottoncandymod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}