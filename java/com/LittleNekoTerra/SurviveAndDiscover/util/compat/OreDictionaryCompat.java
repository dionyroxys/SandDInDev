package com.LittleNekoTerra.SurviveAndDiscover.util.compat;

import com.LittleNekoTerra.SurviveAndDiscover.init.ModBlocks;
import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;

import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat 
{
	public static void registerOres() 
	{
		OreDictionary.registerOre("oreCompressedCoal", ModBlocks.ENHANCED_COAL_ORE);
		OreDictionary.registerOre("nuggetCompressedCoal", ModItems.ENHANCED_COAL);
	}
}
