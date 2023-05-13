package com.znarfmods.ultimatetools.init;

import org.apache.logging.log4j.Logger;

import com.znarfmods.ultimatetools.References;

import net.minecraftforge.common.config.Configuration;

public class ModConfig {
	public static int maxUses;
	public static int harvestLevel;
	public static float damage;
	
	public static void init(Configuration config, Logger logger) {
		// load the value for the amount of uses on tools and armor
		try {
			// load the config
			config.load();
			maxUses = config.getInt("maxUses", Configuration.CATEGORY_GENERAL, 20000, 1, 100000000, "Determines the amount of uses on tools and armor pieces.");
			config.save();
			// read the 
		} catch(Throwable e) {
			logger.error("Error while loading \"UltimateTools\" config entry for maxUses (UltimateTools version "+References.VERSION+")!",e);
			maxUses = 20000;
		}
		
		// load the value for the harvest level of the tools
		try {
			// load the config
			config.load();
			harvestLevel = config.getInt("harvestLevel", Configuration.CATEGORY_GENERAL, 10, 1, 1000, "Determines the harvest level of the tools (mainly applicable to pickaxes).");
			config.save();
			// read the 
		} catch(Throwable e) {
			logger.error("Error while loading \"UltimateTools\" config entry for harvestLevel (UltimateTools version "+References.VERSION+")!",e);
			harvestLevel = 10;
		}
		
		//load the value for the damage of the tools
		try {
			// load the config
			config.load();
			damage = config.getFloat("damage", Configuration.CATEGORY_GENERAL, 100F, 1F, 100000000F, "Determines the amount of damage the tools deal.");
			config.save();
			// read the 
		} catch(Throwable e) {
			logger.error("Error while loading \"UltimateTools\" config entry for damage (UltimateTools version "+References.VERSION+")!",e);
			damage = 100F;
		}
	}
}
