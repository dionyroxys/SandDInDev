package com.LittleNekoTerra.SurviveAndDiscover.blocks;

import java.util.Random;

import com.LittleNekoTerra.SurviveAndDiscover.Main;
import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class enhanced_coal_block extends BlockBase
{

	public enhanced_coal_block(String name, Material material, CreativeTabs tab) 
	{
		
		super(name, material, tab);
		
		setSoundType(SoundType.STONE);
		setHardness(4.0F);
		setResistance(35.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Main.sdblockstab);
		//setLightLevel(0.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
}
	