package com.znarfmods.ultimatetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CustomShovel extends ItemSpade {
	public CustomShovel(ToolMaterial myToolMaterial) {
		super(myToolMaterial);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public CustomShovel(ToolMaterial myToolMaterial, CreativeTabs cTab) {
		super(myToolMaterial);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(cTab);
	}
}
