package com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.slots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class SlotEnhancedFurnaceOutput extends Slot 
{
	private final EntityPlayer player;
	private int removeCount;
	
	SlotEnhancedFurnaceOutput(EntityPlayer player, IInventory inventory, int index, int x, int y)
	{
		super(inventory, index, x, y);
		this.player = player;
	}
	

}
