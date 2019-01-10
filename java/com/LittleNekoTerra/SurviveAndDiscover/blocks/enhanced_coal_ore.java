package com.LittleNekoTerra.SurviveAndDiscover.blocks;

import java.util.Random;

import com.LittleNekoTerra.SurviveAndDiscover.Main;
import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class enhanced_coal_ore extends BlockBase
{
	public enhanced_coal_ore(String name, Material material, CreativeTabs tab) 
	{
		super(name, material, tab);
		setSoundType(SoundType.METAL);
		setHardness(4.0F);
		setResistance(35.0F);
		setHarvestLevel("pickaxe", 2);
		setCreativeTab(Main.sdblockstab);
	}

//remove below for drop oreblock
@Override
public Item getItemDropped(IBlockState state, Random rand, int fortune) {
	return ModItems.ENHANCED_COAL;
}
//to decide how many it drops do the below
//@Override
//public int quantityDropped(Random rand) {
	//return 3;
//}

//this is how too do a random drop count
@Override
public int quantityDropped(Random rand) {
	int max = 9;
	int min = 3;
	return rand.nextInt(max) + min;
}

}

