package com.LittleNekoTerra.SurviveAndDiscover.proxy.tabs;

import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SDBlocksTab extends CreativeTabs
{
	public SDBlocksTab(String label) {super("sdblockstab");}
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.MUSHROOM_STEEL);}
}
