package com.znarfmods.ultimatetools.init;

import org.apache.logging.log4j.Logger;

import com.znarfmods.ultimatetools.References;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Ignore;
import net.minecraftforge.common.config.Configuration;

@Config(modid = References.MODID)
public class ModConfig {
	//the values added to the configuration file
	
	@Comment({
				"Determines the amount of uses on tools and armor pieces.",
				"Default value: 20000"
			})
	public static int maxUses = 20000;
	
	@Comment({
				"Determines the harvest level of the tools (mainly applicable to pickaxes).",
				"Default value: 10"
			})
	public static int harvestLevel = 10;
	
	@Comment({
				"Determines the amount of damage the tools deal.",
				"Default value: 100.0"
			})
	public static float damage = 100F;
	
	@Comment({
				"Determines the efficiency fo the tools.",
				"Default value: 40.0"
			})
	public static float efficiency = 40F;
	
	@Comment({
				"Determines how far the tools and armor may be enchanted.",
				"Default value: 30"
			})
	public static int enchantability = 30;
	
	@Comment({
				"Determines the toughness of the armorpieces",
				"Default value: 5.0"
			})
	public static float toughness = 5F;
	
	@Comment({
		"Determines how much a given armor piece reduces the damage the player took.",
		"Default values:",
		"helmet: 10",
		"chestplate: 14",
		"leggings: 12",
		"boots: 7"
	})
	@Ignore
	public static int[] reductionAmounts = {7,12,14,10};
	
	// private helpers for the reductionAmounts
	@Ignore
	public static String[] names = {"ultimate_helmet", "ultimate_chestplate", "ultimate_leggings", "ultimate_boots"};
	@Ignore
	public static int[] defaultReductionAmounts = {7,12,14,10};
	
	
	public static void init(Configuration config, Logger logger) {
		// load the values for the amount of uses on tools and armor, the harvest level of the tools and their damage
		try {
			// load the config
			config.load();
			maxUses = config.getInt("maxUses", Configuration.CATEGORY_GENERAL, 20000, 1, 100000000, "");
			harvestLevel = config.getInt("harvestLevel", Configuration.CATEGORY_GENERAL, 10, 1, 1000, "");
			damage = config.getFloat("damage", Configuration.CATEGORY_GENERAL, 100F, 1F, 100000000F, "");
			efficiency = config.getFloat("efficiency", Configuration.CATEGORY_GENERAL, 40F, 1F, 10000F, "");
			enchantability = config.getInt("enchantability", Configuration.CATEGORY_GENERAL, 30, 1, 100, "");
			toughness = config.getFloat("toughness", Configuration.CATEGORY_GENERAL, 5F, 0.1F, 1000F, "");
			for (int i = 0; i < reductionAmounts.length; i++) {
				reductionAmounts[i] = config.getInt("reductionAmount "+ names[3-i], Configuration.CATEGORY_GENERAL, defaultReductionAmounts[i], 1, 1000, "");
			}
			config.save();
			
			// just for testing purposes
	        logger.info("\n"+
					"------------------------------\n"+
					"Loaded the following config entries:\n"+
	    			"harvestLevel: "+ModConfig.harvestLevel+"\n"+
					"maxUses: "+ModConfig.maxUses+"\n"+
	    			"damage: "+ModConfig.damage+"\n"+
					"efficiency: "+ModConfig.efficiency+"\n"+
	    			"enchantability: "+ModConfig.enchantability+"\n"+
					"toughness: "+ModConfig.toughness+"\n"+
	    			"reduction amounts: {"+
					ModConfig.reductionAmounts[0]+", "+
	    			ModConfig.reductionAmounts[1]+", "+
					ModConfig.reductionAmounts[2]+", "+
	    			ModConfig.reductionAmounts[3]+"}\n"+
	    			"------------------------------"
	    			);
	        
			// in case of any error in that part, the following part falls back to the default values.
		} catch(Throwable e) {
			logger.error("Error while loading \"UltimateTools\" config entries (UltimateTools version "+References.VERSION+")!",e);
			maxUses = 20000;
			harvestLevel = 10;
			damage = 100F;
			efficiency = 40F;
			enchantability = 30;
			toughness = 5F;
			reductionAmounts = defaultReductionAmounts;
		}
	}
	
	public static void init(Configuration config) {
		// load the values for the amount of uses on tools and armor, the harvest level of the tools and their damage
		try {
			// load the config
			config.load();
			maxUses = config.getInt("maxUses", Configuration.CATEGORY_GENERAL, 20000, 1, 100000000, "Determines the amount of uses on tools and armor pieces.");
			harvestLevel = config.getInt("harvestLevel", Configuration.CATEGORY_GENERAL, 10, 1, 1000, "\nDetermines the harvest level of the tools (mainly applicable to pickaxes).");
			damage = config.getFloat("damage", Configuration.CATEGORY_GENERAL, 100F, 1F, 100000000F, "\nDetermines the amount of damage the tools deal.");
			efficiency = config.getFloat("efficiency", Configuration.CATEGORY_GENERAL, 40F, 1F, 10000F, "\nDetermines the efficiency of the tools.");
			enchantability = config.getInt("enchantability", Configuration.CATEGORY_GENERAL, 30, 1, 100, "");
			toughness = config.getFloat("toughness", Configuration.CATEGORY_GENERAL, 5F, 0.1F, 1000F, "");
			for (int i = 0; i < reductionAmounts.length; i++) {
				reductionAmounts[i] = config.getInt("reductionAmount "+ names[3-i], Configuration.CATEGORY_GENERAL, defaultReductionAmounts[i], 1, 1000, "");
			}
			config.save();
			
	        
			// in case of any error in that part, the following part falls back to the default values.
		} catch(Throwable e) {
			efficiency = 40F;
			maxUses = 20000;
			harvestLevel = 10;
			damage = 100F;
			enchantability = 30;
			toughness = 5F;
			reductionAmounts = defaultReductionAmounts;
		}
	}
}
