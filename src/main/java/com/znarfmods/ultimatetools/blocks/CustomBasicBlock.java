package com.znarfmods.ultimatetools.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBasicBlock extends Block {

	public CustomBasicBlock(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}
}
