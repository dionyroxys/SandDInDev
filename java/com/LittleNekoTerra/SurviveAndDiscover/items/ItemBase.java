package com.LittleNekoTerra.SurviveAndDiscover.items;

import com.LittleNekoTerra.SurviveAndDiscover.Main;
import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;
import com.LittleNekoTerra.SurviveAndDiscover.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.sditemstab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
