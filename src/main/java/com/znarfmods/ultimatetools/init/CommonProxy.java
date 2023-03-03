package com.znarfmods.ultimatetools.init;

import com.znarfmods.ultimatetools.References;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

//this class registers all items of the mod

@Mod.EventBusSubscriber(modid=References.MODID)
public class CommonProxy {
	
	//for all packages
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		//from package.file: items.UltimateToolsInit.java
		registerRender(UltimateToolsInit.ultimateSword);
		registerRender(UltimateToolsInit.ultimatePickaxe);
		registerRender(UltimateToolsInit.ultimateShovel);
		registerRender(UltimateToolsInit.ultimateAxe);
		registerRender(UltimateToolsInit.ultimateHoe);
		//from package.file: items.ModItems.java
		registerRender(ModItems.ultimateIngot);
		registerRender(ModItems.ultimateDust);
		//from package.file: blocks.ModBlocks.java
		registerRender(Item.getItemFromBlock(ModBlocks.ultimateBlock));
		registerRender(Item.getItemFromBlock(ModBlocks.compressedstoneBlock));
		
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation( item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
		
	}
	
	//for package: items
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		//from file: UltimateToolsInit.java
		event.getRegistry().registerAll(UltimateToolsInit.ultimateSword);
		event.getRegistry().registerAll(UltimateToolsInit.ultimatePickaxe);
		event.getRegistry().registerAll(UltimateToolsInit.ultimateShovel);
		event.getRegistry().registerAll(UltimateToolsInit.ultimateAxe);
		event.getRegistry().registerAll(UltimateToolsInit.ultimateHoe);
		//from file: ModItems.java
		event.getRegistry().registerAll(ModItems.ultimateIngot);
		event.getRegistry().registerAll(ModItems.ultimateDust);
	}
	
	//for package: blocks
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		//from file: ModBlocks.java
		event.getRegistry().registerAll(ModBlocks.ultimateBlock);
		event.getRegistry().registerAll(ModBlocks.compressedstoneBlock);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		//from file: ModBlocks.java
		event.getRegistry().registerAll(new ItemBlock(ModBlocks.ultimateBlock).setRegistryName(ModBlocks.ultimateBlock.getRegistryName()));
		event.getRegistry().registerAll(new ItemBlock(ModBlocks.compressedstoneBlock).setRegistryName(ModBlocks.compressedstoneBlock.getRegistryName()));
	}
}
