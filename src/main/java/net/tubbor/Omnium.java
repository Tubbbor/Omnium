package net.tubbor;

import net.fabricmc.api.ModInitializer;

import net.tubbor.block.ModBlocks;
import net.tubbor.item.ModItemGroups;
import net.tubbor.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Omnium implements ModInitializer {
	public static final String MOD_ID = "omnium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}