package com.znarfmods.ultimatetools.init;

import com.znarfmods.ultimatetools.items.CustomAxe;
import com.znarfmods.ultimatetools.items.CustomHoe;
import com.znarfmods.ultimatetools.items.CustomPickaxe;
import com.znarfmods.ultimatetools.items.CustomShovel;
import com.znarfmods.ultimatetools.items.CustomSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class UltimateToolsInit {
	
	public static ToolMaterial[] ultimateToolMaterial = new ToolMaterial[5];
	public static Item ultimateSword;
    public static Item ultimatePickaxe;
    public static Item ultimateShovel;
    public static Item ultimateAxe;
    public static Item ultimateHoe;
	
    /**
     * A function to initialize the "ultimate tools" with default specs.
     */
	public static void initTools() {
		
		/** default tool specs:
         *	String[] names =  {"ultimate_sword","ultimate_pickaxe","ultimate_shovel","ultimate_axe","ultimate_hoe"};
         *	int harvestLevel = 10;
         *	int maxUses = 20000;
         *	float efficiency = 40F;
         *	float damage = 100F;
         *	int enchantability = 30;
         */
		initTools(20000);
	}
    
	/**
	 * A function to initialize the "ultimate tools" with custom harvestLevel, maxUses and damage provided by the parameters.
	 * @param maxUses			(int)		determines the maximal amount of uses on the item.
	 */
	public static void initTools(int maxUses) {
		if (maxUses <= 0) {
			initTools();
			return;
		}
		// uses harvestLevel = 10 and damage = 100F
		initTools(10, maxUses, 100F);
	}
	
	/**
	 * A function to initialize the "ultimate tools" with custom harvestLevel, maxUses and damage provided by the parameters.
	 * @param harvestLevel		(int)		determines the strength of the material that may be mined with the tools (diamond tools: 4; iron tools: 3; stone tools: 2; wooden tools: 1)
	 * @param maxUses			(int)		determines the maximal amount of uses on the item.
	 * @param damage			(float)		determines the damage dealt by the tools.
	 */
	public static void initTools(int harvestLevel, int maxUses, float damage) {
		if (harvestLevel <= 0 || damage <= 0F) {
			initTools(maxUses);
			return;
		}
		// uses efficiency = 40F and enchantability = 30
		initTools(harvestLevel, maxUses, 40F, damage, 30);
	}
	
	/**
	 * A function to initialize the "ultimate tools" with default names and custom specs provided by the parameters.
	 * @param harvestLevel		(int)		determines the strength of the material that may be mined with the tools (diamond tools: 4; iron tools: 3; stone tools: 2; wooden tools: 1)
	 * @param maxUses			(int)		determines the maximal amount of uses on the item.
	 * @param efficiency		(float)		determines the efficiency of the tools.
	 * @param damage			(float)		determines the damage dealt by the tools.
	 * @param enchantability	(int)		determines the level of enchantability.
	 */
	public static void initTools(int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
		if (efficiency <= 0F || enchantability <= 0) {
			initTools(harvestLevel,maxUses,damage);
			return;
		}
		// set the names
		String[] names =  {"ultimate_sword","ultimate_pickaxe","ultimate_shovel","ultimate_axe","ultimate_hoe"};
		initTools(names, harvestLevel, maxUses, efficiency, damage, enchantability);
	}
	
	/**
	 * A function to initialize the "ultimate tools" with custom specs provided by the parameters.
	 * @param names				(String[]) 	determines the names for the four parts of the "ultimate armor".
	 * @param harvestLevel		(int)		determines the strength of the material that may be mined with the tools (diamond tools: 4; iron tools: 3; stone tools: 2; wooden tools: 1)
	 * @param maxUses			(int)		determines the maximal amount of uses on the item.
	 * @param efficiency		(float)		determines the efficiency of the tools.
	 * @param damage			(float)		determines the damage dealt by the tools.
	 * @param enchantability	(int)		determines the level of enchantability.
	 */
	public static void initTools(String[] names, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
		if (names.length != ultimateToolMaterial.length) {
			initTools(harvestLevel,maxUses,efficiency,damage,enchantability);
			return;
		}
		
		for (int i = 0; i<names.length; i++) {
			if(names[i].equals("")) {
				initTools(harvestLevel,maxUses,efficiency,damage,enchantability);
				return;
			}
		}
		
		// to avoid errors on loading
    float destructionSpeedAxe = -1.5F;
        
    // create the toolMaterials from tool specs
    for (int i=0; i<ultimateToolMaterial.length;i++) {
    	ultimateToolMaterial[i] = EnumHelper.addToolMaterial(names[i], harvestLevel, maxUses, efficiency, damage, enchantability);
    }
        
    // create the tools using custom methods to automatically set the names
    ultimateSword = new CustomSword(ultimateToolMaterial[0], ModCreativeTabs.ULTIMATETOOLS);
    ultimatePickaxe = new CustomPickaxe(ultimateToolMaterial[1], ModCreativeTabs.ULTIMATETOOLS);
    ultimateShovel = new CustomShovel(ultimateToolMaterial[2], ModCreativeTabs.ULTIMATETOOLS);
    ultimateAxe = new CustomAxe(ultimateToolMaterial[3],destructionSpeedAxe, ModCreativeTabs.ULTIMATETOOLS);
    ultimateHoe = new CustomHoe(ultimateToolMaterial[4], ModCreativeTabs.ULTIMATETOOLS);
	}

}
