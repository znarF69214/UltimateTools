package com.znarfmods.ultimatetools.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModItems.ultimateDust, new ItemStack(ModItems.ultimateIngot, 1), 10.0f);
	}
}
