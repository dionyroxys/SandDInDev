package com.LittleNekoTerra.SurviveAndDiscover.proxy.tabs;

import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class SDItemsTab extends CreativeTabs
{
	public SDItemsTab(String label) {super("sditemstab");}
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.MUSHROOM_STEEL);}
	}