package com.LittleNekoTerra.SurviveAndDiscover.proxy.tabs;

import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SDNatureTab extends CreativeTabs
{
	public SDNatureTab(String label) {super("sdnaturetab");}
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.MUSHROOM_STEEL);}

}
