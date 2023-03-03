package com.znarfmods.ultimatetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CustomAxe extends ItemAxe {
	public CustomAxe(ToolMaterial myToolMaterial, float speed) {
		super(myToolMaterial, myToolMaterial.getAttackDamage(), speed);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(CreativeTabs.TOOLS);
	}
	
	public CustomAxe(ToolMaterial myToolMaterial, float speed, CreativeTabs cTab) {
		super(myToolMaterial, myToolMaterial.getAttackDamage(), speed);
		this.setRegistryName(myToolMaterial.toString());
		this.setUnlocalizedName(myToolMaterial.toString());
		this.setCreativeTab(cTab);
	}
}
