package com.jakob.item;

import com.jakob.references.InitRef;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PigItem extends Item {
	
	public PigItem(){
		setMaxStackSize(16);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("pigGem");
		setTextureName(InitRef.MODID + ":" + "pigGem");
	}
}
