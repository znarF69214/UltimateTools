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
	
	/** A function to initialize the "ultimate armor" with default specs.
	 *
	 */
	public static void init() {
		/**	default specs:
		 *	String[] names = {"ultimate_helmet", "ultimate_chestplate", "ultimate_leggings", "ultimate_boots"};
		 *	int maxUses = 20000;
		 *	int enchantability = 30;
		 *	int[] reductionAmounts = {7,12,14,10};
		 *	float toughness = 5F;
		 *	SoundEvent equipSound = SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
		 */
		
		// initialize the armor with the created specs
		init(20000);
	}
	
	/**
	 * A function to initialize the "ultimate armor" with custom maxUses provided by the parameter.
	 * @param maxUses	(int)	determines the maximal amount of uses on the item.
	 */
	public static void init(int maxUses) {
		init(maxUses, 5F);
	}
	
	/**
	 * A function to initialize the "ultimate armor" with custom maxUses and toughness provided by the parameters.
	 * @param maxUses	(int)	determines the maximal amount of uses on the item. 
	 * @param toughness	(float)	determines the toughness of the armor.
	 */
	public static void init(int maxUses, float toughness) {
		int[] reductionAmounts = {7,12,14,10};
		init(maxUses, 30, reductionAmounts, toughness);
	}
	
	/**
	 * A function to initialize the "ultimate armor" with default names and sound and custom specs provided by the parameters.
	 * @param maxUses			(int)	determines the maximal amount of uses on the item.
	 * @param enchantability	(int)	determines the level of enchantability.
	 * @param reductionAmounts	(int[])	determines the amount which this piece of armor reduces. 
	 * @param toughness			(float)	determines the toughness of the armor.
	 */
	public static void init(int maxUses, int enchantability, int[] reductionAmounts, float toughness) {
		init(maxUses, enchantability, reductionAmounts, toughness, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC);
	}
	
	/**
	 * A function to initialize the "ultimate armor" with default names and custom specs provided by the parameters.
	 * @param maxUses			(int)			determines the maximal amount of uses on the item.
	 * @param enchantability	(int)			determines the level of enchantability.
	 * @param reductionAmounts	(int[])			determines the amount which this piece of armor reduces. 
	 * @param toughness			(float)			determines the toughness of the armor.
	 * @param equipSound		(SoundEvent)	determines the sound that can be heard on equipping.
	 */
	public static void init(int maxUses, int enchantability, int[] reductionAmounts, float toughness, SoundEvent equipSound) {
		String[] names = {"ultimate_helmet", "ultimate_chestplate", "ultimate_leggings", "ultimate_boots"};
		init(names, maxUses, enchantability, reductionAmounts, toughness, equipSound);
	}
	
	/**
	 * A function to initialize the "ultimate armor" with specs provided by the parameters.
	 * @param names				(String[]) 		determines the names for the four parts of the "ultimate armor".
	 * @param maxUses			(int)			determines the maximal amount of uses on the item.
	 * @param enchantability	(int)			determines the level of enchantability.
	 * @param reductionAmounts	(int[])			determines the amount which this piece of armor reduces.
	 * @param toughness			(float)			determines the toughness of the armor.
	 * @param equipSound		(SoundEvent)	determines the sound that can be heard on equipping.
	 */
	public static void init(String[] names, int maxUses, int enchantability, int[] reductionAmounts, float toughness, SoundEvent equipSound) {
		for (int i = 0; i < 4; i++) {
			ultimateArmorMaterial[i] = EnumHelper.addArmorMaterial(names[i], References.MODID + ":ultimate", maxUses, reductionAmounts, enchantability, equipSound, toughness);
		}
		ultimateHelmet = new CustomArmor(ultimateArmorMaterial[0], EntityEquipmentSlot.HEAD, ModCreativeTabs.ULTIMATETOOLS);
		ultimateChestplate = new CustomArmor(ultimateArmorMaterial[1], EntityEquipmentSlot.CHEST, ModCreativeTabs.ULTIMATETOOLS);
		ultimateLeggings = new CustomArmor(ultimateArmorMaterial[2], EntityEquipmentSlot.LEGS, ModCreativeTabs.ULTIMATETOOLS);
		ultimateBoots = new CustomArmor(ultimateArmorMaterial[3], EntityEquipmentSlot.FEET, ModCreativeTabs.ULTIMATETOOLS);
	}
}
