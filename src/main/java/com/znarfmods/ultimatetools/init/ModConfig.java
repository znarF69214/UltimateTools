package com.znarfmods.ultimatetools.init;

import org.apache.logging.log4j.Logger;

import com.znarfmods.ultimatetools.References;

import net.minecraftforge.common.config.Configuration;

public class ModConfig {
	public static int maxUses;
	public static int harvestLevel;
	public static float damage;
	
	public static void init(Configuration config, Logger logger) {
		// load the values for the amount of uses on tools and armor, the harvest level of the tools and their damage
		try {
			// load the config
			config.load();
			maxUses = config.getInt("maxUses", Configuration.CATEGORY_GENERAL, 20000, 1, 100000000, "Determines the amount of uses on tools and armor pieces.");
			harvestLevel = config.getInt("harvestLevel", Configuration.CATEGORY_GENERAL, 10, 1, 1000, "\nDetermines the harvest level of the tools (mainly applicable to pickaxes).");
			damage = config.getFloat("damage", Configuration.CATEGORY_GENERAL, 100F, 1F, 100000000F, "\nDetermines the amount of damage the tools deal.");
			config.save();
			
			// just for testing purposes
	        logger.info("\n"+
					"------------------------------\n"+
					"Loaded the following config entries:\n"+
	    			"harvestLevel: "+ModConfig.harvestLevel+"\n"+
					"maxUses: "+ModConfig.maxUses+"\n"+
	    			"damage: "+ModConfig.damage+"\n"+
	    			"------------------------------"
	    			);
	        
			// in case of any error in that part, the following part falls back to the default values.
		} catch(Throwable e) {
			logger.error("Error while loading \"UltimateTools\" config entries (UltimateTools version "+References.VERSION+")!",e);
			maxUses = 20000;
			harvestLevel = 10;
			damage = 100F;
		}
	}
}
