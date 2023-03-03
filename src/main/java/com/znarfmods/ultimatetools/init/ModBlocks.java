package com.znarfmods.ultimatetools.init;

import com.znarfmods.ultimatetools.blocks.CustomBasicBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block ultimateBlock;
	public static Block compressedstoneBlock;
	
	public static void init() {
		ultimateBlock = new CustomBasicBlock("ultimate_block", Material.ROCK).setHardness(5F).setCreativeTab(ModCreativeTabs.ULTIMATETOOLS).setLightLevel(1.0F);
		ultimateBlock.setHarvestLevel("pickaxe", 3);
		compressedstoneBlock = new CustomBasicBlock("compressedstone_block", Material.ROCK).setHardness(4F).setCreativeTab(ModCreativeTabs.ULTIMATETOOLS).setLightLevel(8F/15F);
		compressedstoneBlock.setHarvestLevel("pickaxe", 2);
	}
}
