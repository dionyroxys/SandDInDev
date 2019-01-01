package com.LittleNekoTerra.SurviveAndDiscover;

//import com.LittleNekoTerra.MinecraftOverhaul.init.ModRecipes;
import com.LittleNekoTerra.SurviveAndDiscover.proxy.CommonProxy;
import com.LittleNekoTerra.SurviveAndDiscover.util.Reference;
import com.LittleNekoTerra.SurviveAndDiscover.world.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
	}
	
	public static void Init(FMLInitializationEvent event)
	{
		//ModRecipes.init();
	}
	
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}



}
