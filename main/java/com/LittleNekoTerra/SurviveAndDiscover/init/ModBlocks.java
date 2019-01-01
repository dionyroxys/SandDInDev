package com.LittleNekoTerra.SurviveAndDiscover.init;

import java.util.ArrayList;
import java.util.List;

import com.LittleNekoTerra.SurviveAndDiscover.blocks.BlockBase;
import com.LittleNekoTerra.SurviveAndDiscover.blocks.enhanced_coal_block;
import com.LittleNekoTerra.SurviveAndDiscover.blocks.enhanced_coal_ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block>BLOCKS = new ArrayList<Block>();
	//blocks consumable
	public static final Block ENHANCED_COAL_BLOCK = new enhanced_coal_block("enhanced_coal_block", Material.IRON, null);
	
	//ores
	public static final Block ENHANCED_COAL_ORE = new enhanced_coal_ore("enhanced_coal_ore", Material.ROCK, null);
	
	//blocks functional
	//public static final Block ENHANCED_FURNACE = new block_enhanced_furnace("enhanced_furnace", Material.ROCK)
	
	//blocks trees
	

}
