package com.LittleNekoTerra.SurviveAndDiscover.util.handlers;

import com.LittleNekoTerra.SurviveAndDiscover.entity.EntityShroomalVillager;
import com.LittleNekoTerra.SurviveAndDiscover.entity.render.RenderShroomalVillager;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler 
{
	public static void registerEntityRenders() 
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityShroomalVillager.class, new IRenderFactory<EntityShroomalVillager>() 
		{
			@Override
			public Render<? super EntityShroomalVillager> createRenderFor(RenderManager manager)
			{
				return new RenderShroomalVillager(manager);
			}
		});
	}
}
