package com.LittleNekoTerra.SurviveAndDiscover.util.handlers;

import com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.ContainerEnhancedFurnace;
import com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.GuiEnhancedFurnace;
import com.LittleNekoTerra.SurviveAndDiscover.blocks.machines.TileEntityEnhancedFurnace;
import com.LittleNekoTerra.SurviveAndDiscover.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler 
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ENHANCED_FURNACE) return new ContainerEnhancedFurnace(player.inventory, (TileEntityEnhancedFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_ENHANCED_FURNACE) return new GuiEnhancedFurnace(player.inventory, (TileEntityEnhancedFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

}
