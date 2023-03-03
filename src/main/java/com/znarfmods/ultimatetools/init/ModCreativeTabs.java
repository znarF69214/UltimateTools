package com.znarfmods.ultimatetools.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ModCreativeTabs {

	static final CreativeTabs ULTIMATETOOLS = (new CreativeTabs("ultimateToolsTab") {
		
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.ultimateDust);
		}
	});
}
