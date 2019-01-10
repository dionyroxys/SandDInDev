package com.LittleNekoTerra.SurviveAndDiscover.blocks.machines;

import com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.slots.SlotEnhancedFurnaceFuel;
import com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.slots.SlotEnhancedFurnaceOutput;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerEnhancedFurnace extends Container
{
	private final ContainerEnhancedFurnace tileentity;
	private int cookTime, totalCookTime, burnTime, currentBurnTime;
	
	public ContainerEnhancedFurnace(InventoryPlayer player, TileEntityEnhancedFurnace tileentity)
	{
	this.tileentity = tileentity;
	
	this.addSlotToContainer(new Slot(tileentity, 0, 26, 11));
	this.addSlotToContainer(new Slot(tileentity, 1, 26, 59));
	this.addSlotToContainer(new SlotEnhancedFurnaceFuel(tileentity, 2, 7, 35));
	this.addSlotToContainer(new SlotEnhancedFurnaceOutput(tileentity, 2, 7, 35));
	}
	
}
