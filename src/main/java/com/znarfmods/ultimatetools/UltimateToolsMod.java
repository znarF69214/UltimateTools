package com.znarfmods.ultimatetools;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import com.znarfmods.ultimatetools.init.ModArmor;
import com.znarfmods.ultimatetools.init.ModBlocks;
import com.znarfmods.ultimatetools.init.ModConfig;
import com.znarfmods.ultimatetools.init.ModItems;
import com.znarfmods.ultimatetools.init.ModRecipes;
import com.znarfmods.ultimatetools.init.UltimateToolsInit;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MCVERSION)
public class UltimateToolsMod
{
    final String VERSION = References.VERSION;
    final String MCVERSION = References.MCVERSION;
    public final String MODID = References.MODID;
    
    @Instance
    public static UltimateToolsMod instance;

    private static Logger logger;
    
    

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("\n"+
        			"------------------------------\n"+
        			"Creating UltimateTools (Version "+VERSION+") for Minecraft Version "+MCVERSION+"\n"+
        			"------------------------------"
        			);
        logger.info("Loading Config File!");
        ModConfig.init(new Configuration(event.getSuggestedConfigurationFile()), logger);
        logger.info("Loaded Config! Starting to initialize the mod items and blocks!");
        UltimateToolsInit.initTools(ModConfig.harvestLevel,ModConfig.maxUses,ModConfig.efficiency,ModConfig.damage,ModConfig.enchantability);
        logger.info("Ultimate Tools: Initialized!");
        ModItems.init();
        logger.info("Mod Items: Initialized!");
        ModArmor.init(ModConfig.maxUses);
        logger.info("Mod Armor: Initialized!");
        ModBlocks.init();
        logger.info("Mod Blocks: Initialized!");
        logger.info("\n"+
        			"------------------------------\n"+
        			"Created UltimateTools (Version "+VERSION+") for Minecraft Version "+MCVERSION+"\n"+
        			"------------------------------"
        			);
        
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        logger.info("\n"+
        			"------------------------------\n"+
        			"Loading UltimateTools (Version "+VERSION+")!\n"+
        			"------------------------------"
        			);
    	logger.info("Mod Recipes: Registering!");
        ModRecipes.init();
        logger.info("Mod Recipes: Registered!");
        logger.info("\n"+
        			"------------------------------\n"+
        			"Loaded UltimateTools (Version "+VERSION+")!\n"+
        			"------------------------------"
        			);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	logger.info("\n"+
    				"------------------------------\n"+
    				"Finishing UltimateTools (Version"+VERSION+")!\n"+
    				"------------------------------"
    				);
    	logger.info("\n"+
    				"------------------------------\n"+
    				"Fully loaded UltimateTools (Version "+VERSION+")!\n"+
    				"------------------------------"
    				);
    }
}
