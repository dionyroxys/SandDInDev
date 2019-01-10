package com.LittleNekoTerra.SurviveAndDiscover.entity.render;

import com.LittleNekoTerra.SurviveAndDiscover.entity.EntityShroomalVillager;
import com.LittleNekoTerra.SurviveAndDiscover.entity.model.ModelShroomalVillager;
import com.LittleNekoTerra.SurviveAndDiscover.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderShroomalVillager extends RenderLiving<EntityShroomalVillager> 
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID, "textures/entity/shroomalvillager.png");
	
	public RenderShroomalVillager(RenderManager manager) 
	{
		super(manager, new ModelShroomalVillager(), 0.5F);
	}
	
		@Override
		protected ResourceLocation getEntityTexture(EntityShroomalVillager entity)
		{
			return TEXTURES;
		}
		@Override
		protected void applyRotations(EntityShroomalVillager entityLiving, float p_77043_2, float rotationYaw, float partialTicks ) 
		{
			super.applyRotations(entityLiving, p_77043_2, rotationYaw, partialTicks);
		}
}
