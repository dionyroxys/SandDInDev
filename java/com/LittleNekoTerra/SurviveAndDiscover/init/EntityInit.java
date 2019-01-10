package com.LittleNekoTerra.SurviveAndDiscover.init;

import com.LittleNekoTerra.SurviveAndDiscover.Main;
import com.LittleNekoTerra.SurviveAndDiscover.entity.EntityShroomalVillager;
import com.LittleNekoTerra.SurviveAndDiscover.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities() 
	{
		registerEntity("shroomal_villager", EntityShroomalVillager.class, Reference.ENTITY_SHROOMAL_VILLAGER, 20, 8149045, 000000);
	}
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) 
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, 60, 1, true, color1, color2);
	}

}
