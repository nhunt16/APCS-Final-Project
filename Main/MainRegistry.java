package com.black.Main;

import com.black.item.ObsidianStick;
import com.black.lib.refStrings;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

@Mod(modid = refStrings.MODID, name = refStrings.NAME, version = refStrings.VERSION)
public class MainRegistry {
	
	@SidedProxy(clientSide = refStrings.CLIENTSIDE,serverSide = refStrings.SERVERSIDE)
	public static ServerProxy proxy;
	
	@EventHandler
	public static void PreLoad(FMLPreInitializationEvent PreEvent){
		ObsidianStick.mainRegistry();
		proxy.registerRenderInfo();
	}
	
	// items
	public static Item BlackSword = new BlackSword(4999);
	
	public MainRegistry(){
		Object item;
		GameRegistry.registerItem(BlackSword, "BlackSword");
		LanguageRegistry.addName(BlackSword, "BlackSword");
	}
	@EventHandler
	public static void load(FMLInitializationEvent event){
		
	}
	@EventHandler
	public static void PostLoad(FMLPostInitializationEvent PostEvent){
	
	}
}
