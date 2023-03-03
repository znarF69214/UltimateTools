package com.znarfmods.ultimatetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class CustomHoe extends ItemHoe {
	public CustomHoe(ToolMaterial myToolMaterial) {
		super(myToolMaterial);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public CustomHoe(ToolMaterial myToolMaterial, CreativeTabs cTab) {
		super(myToolMaterial);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(cTab);
	}
}
