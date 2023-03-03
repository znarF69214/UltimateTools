package com.znarfmods.ultimatetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CustomSword extends ItemSword {
	public CustomSword(ToolMaterial myToolMaterial) {
		super(myToolMaterial);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

	public CustomSword(ToolMaterial myToolMaterial, CreativeTabs cTab) {
		super(myToolMaterial);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(cTab);
	}
}
