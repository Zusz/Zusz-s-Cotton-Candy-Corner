package net.zusz.zcottoncandymod;

import net.fabricmc.api.ModInitializer;

import net.zusz.zcottoncandymod.block.ModBlocks;
import net.zusz.zcottoncandymod.block.entity.ModBlockEntities;
import net.zusz.zcottoncandymod.item.ModItemGroups;
import net.zusz.zcottoncandymod.item.ModItems;
import net.zusz.zcottoncandymod.screen.ModScreenHandlers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZCottonCandyMod implements ModInitializer {
	public static final String MOD_ID = "zcottoncandymod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
	}
}