package com.znarfmods.ultimatetools.init;

import com.znarfmods.ultimatetools.items.CustomBasicItem;

import net.minecraft.item.Item;

public class ModItems {
	public static Item ultimateIngot;
	public static Item ultimateDust;
	
	public static void init() {
		ultimateIngot = new CustomBasicItem("ultimate_ingot").setCreativeTab(ModCreativeTabs.ULTIMATETOOLS);
		ultimateDust = new CustomBasicItem("ultimate_dust").setCreativeTab(ModCreativeTabs.ULTIMATETOOLS);
		
	}
}
