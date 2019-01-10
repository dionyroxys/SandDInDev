package com.LittleNekoTerra.SurviveAndDiscover.proxy.tabs;

	import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;

	import net.minecraft.creativetab.CreativeTabs;
	import net.minecraft.item.ItemStack;

	public class SDMachineTab extends CreativeTabs
	{
		public SDMachineTab(String label) {super("sdmachinetab");}
		public ItemStack getTabIconItem() { return new ItemStack(ModItems.MUSHROOM_STEEL);}
		}
