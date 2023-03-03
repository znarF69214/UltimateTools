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
	
	public static void initTools() {
		
		// create the tool specs
        String[] name =  {"ultimate_sword","ultimate_pickaxe","ultimate_shovel","ultimate_axe","ultimate_hoe"};
        int harvestLevel = 6;
        int maxUses = 20000;
        float efficiency = 130.0F;
        float damage = 100.0F;
        int enchantability = 30;
        float destructionSpeedAxe = -1.5F;
        
        // create the toolMaterials from tool specs
        for (int i=0; i<ultimateToolMaterial.length;i++) {
        	ultimateToolMaterial[i] = EnumHelper.addToolMaterial(name[i], harvestLevel, maxUses, efficiency, damage, enchantability);
        }
        
        // create the tools using custom methods to automatically set the names
        ultimateSword = new CustomSword(ultimateToolMaterial[0], ModCreativeTabs.ULTIMATETOOLS);
        ultimatePickaxe = new CustomPickaxe(ultimateToolMaterial[1], ModCreativeTabs.ULTIMATETOOLS);
        ultimateShovel = new CustomShovel(ultimateToolMaterial[2], ModCreativeTabs.ULTIMATETOOLS);
        ultimateAxe = new CustomAxe(ultimateToolMaterial[3],destructionSpeedAxe, ModCreativeTabs.ULTIMATETOOLS);
        ultimateHoe = new CustomHoe(ultimateToolMaterial[4], ModCreativeTabs.ULTIMATETOOLS);
	}
	

}
