package com.LittleNekoTerra.SurviveAndDiscover.util.handlers;

import com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.TileEntityEnhancedFurnace;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityEnhancedFurnace.class, "enhanced_furnace");
	}
}