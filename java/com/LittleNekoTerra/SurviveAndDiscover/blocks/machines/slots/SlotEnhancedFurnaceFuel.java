package com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.slots;

import com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.TileEntityEnhancedFurnace;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotEnhancedFurnaceFuel extends Slot
{
	public SlotEnhancedFurnaceFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}

	@Override
	public boolean isItemValid(ItemStack stack) 
	{
		
		return TileEntityEnhancedFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}
