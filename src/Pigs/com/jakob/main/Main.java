package com.jakob.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sun.net.www.content.text.Generic;

import com.jakob.common.CommonProxy;
import com.jakob.references.InitRef;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = InitRef.MODID, name = InitRef.NAME, version = InitRef.VERSION)
public class Main extends Item{
		
	 @Instance(value="pigs")
     public static Generic instance;
     
     @SidedProxy(clientSide="com.jakob.ClientProxy", serverSide="com.jakob.CommonProxy")
     public static CommonProxy proxy;
     
	 public static Item pigGem;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		pigGem = new Item();
		GameRegistry.registerItem(pigGem, pigGem.getUnlocalizedName());
		pigGem.setUnlocalizedName("pigGem");
		pigGem.setMaxStackSize(16);
		pigGem.setCreativeTab(CreativeTabs.tabAllSearch);
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
