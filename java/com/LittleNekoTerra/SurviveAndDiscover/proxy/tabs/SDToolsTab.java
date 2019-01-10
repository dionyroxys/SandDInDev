package com.LittleNekoTerra.SurviveAndDiscover.proxy.tabs;

	import com.LittleNekoTerra.SurviveAndDiscover.init.ModItems;

	import net.minecraft.creativetab.CreativeTabs;
	import net.minecraft.item.ItemStack;

	public class SDToolsTab extends CreativeTabs
	{
		public SDToolsTab(String label) {super("sdtoolstab");}
		public ItemStack getTabIconItem() { return new ItemStack(ModItems.MUSHROOM_STEEL);}
		}
