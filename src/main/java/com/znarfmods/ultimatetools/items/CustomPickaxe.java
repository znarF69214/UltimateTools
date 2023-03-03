package com.znarfmods.ultimatetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CustomPickaxe extends ItemPickaxe {
	public CustomPickaxe(ToolMaterial myToolMaterial) {
		super(myToolMaterial);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public CustomPickaxe(ToolMaterial myToolMaterial, CreativeTabs cTab) {
		super(myToolMaterial);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(cTab);
	}
}
