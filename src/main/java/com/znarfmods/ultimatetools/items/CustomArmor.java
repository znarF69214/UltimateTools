package com.znarfmods.ultimatetools.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class CustomArmor extends ItemArmor {

	public CustomArmor(ArmorMaterial myArmorMaterial, EntityEquipmentSlot equipmentSlot, CreativeTabs cTab) {
		super(myArmorMaterial, 0, equipmentSlot);
		this.setRegistryName(myArmorMaterial.toString());
		this.setUnlocalizedName(myArmorMaterial.toString());
		this.setCreativeTab(cTab);
	}
	
	public CustomArmor(ArmorMaterial myArmorMaterial, EntityEquipmentSlot equipmentSlot) {
		super(myArmorMaterial, 0, equipmentSlot);
		this.setRegistryName(myArmorMaterial.toString());
		this.setUnlocalizedName(myArmorMaterial.toString());
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

}
