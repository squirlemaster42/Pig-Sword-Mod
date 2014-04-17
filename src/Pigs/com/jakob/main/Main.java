package com.jakob.main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import sun.net.www.content.text.Generic;

import com.jakob.common.CommonProxy;
import com.jakob.item.PigItem;
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

public class Main{
		
	 @Instance(value="pigs")
     public static Generic instance;
     
     @SidedProxy(clientSide="com.jakob.client.ClientProxy", serverSide="com.jakob.common.CommonProxy")
     public static CommonProxy proxy;
     
	 public static Item PIG_GEM;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		PIG_GEM = new PigItem();
		GameRegistry.registerItem(PIG_GEM, PIG_GEM.getUnlocalizedName());
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
}
