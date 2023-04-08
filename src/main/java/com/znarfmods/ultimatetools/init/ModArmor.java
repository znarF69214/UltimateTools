package com.znarfmods.ultimatetools.init;

import com.znarfmods.ultimatetools.References;
import com.znarfmods.ultimatetools.items.CustomArmor;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class ModArmor {
	
	public static ArmorMaterial[] ultimateArmorMaterial = new ArmorMaterial[4];
	public static Item ultimateHelmet;
	public static Item ultimateChestplate;
	public static Item ultimateLeggings;
	public static Item ultimateBoots;
	
	public static void init() {
		// create the armor specs
		String[] names = {"ultimate_helmet", "ultimate_chestplate", "ultimate_leggings", "ultimate_boots"};
		int maxUses = 20000;
		int enchantability = 30;
		int[] reductionAmounts = {7,12,14,10};
		float toughness = 5F;
		SoundEvent equipSound = SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
		
		for (int i = 0; i < 4; i++) {
			ultimateArmorMaterial[i] = EnumHelper.addArmorMaterial(names[i], References.MODID + ":ultimate", maxUses, reductionAmounts, enchantability, equipSound, toughness);
		}
		ultimateHelmet = new CustomArmor(ultimateArmorMaterial[0], EntityEquipmentSlot.HEAD, ModCreativeTabs.ULTIMATETOOLS);
		ultimateChestplate = new CustomArmor(ultimateArmorMaterial[1], EntityEquipmentSlot.CHEST, ModCreativeTabs.ULTIMATETOOLS);
		ultimateLeggings = new CustomArmor(ultimateArmorMaterial[2], EntityEquipmentSlot.LEGS, ModCreativeTabs.ULTIMATETOOLS);
		ultimateBoots = new CustomArmor(ultimateArmorMaterial[3], EntityEquipmentSlot.FEET, ModCreativeTabs.ULTIMATETOOLS);
	}
}
