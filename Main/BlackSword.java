package com.black.Main;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlackSword extends Item {
	
	public BlackSword(int i){
		this.setUnlocalizedName("BlackSword");
		this.setTextureName("apcsmod:blacksword");
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
	
}