package com.LittleNekoTerra.SurviveAndDiscover.util.handlers;

import com.LittleNekoTerra.SurviveAndDiscover.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class SoundsHandler
{
	public static SoundEvent ENTITY_SHROOMAL_AMBIENT, ENTITY_SHROOMAL_HURT, ENTITY_SHROOMAL_DEATH;
	
	public static void registerSounds() 
	{
		ENTITY_SHROOMAL_AMBIENT = registerSound("entity.shroomalvillager.idle1");
		ENTITY_SHROOMAL_AMBIENT = registerSound("entity.shroomalvillager.idle2");
		ENTITY_SHROOMAL_AMBIENT = registerSound("entity.shroomalvillager.idle3");
		ENTITY_SHROOMAL_HURT = registerSound("entity.shroomalvillager.hit1");
		ENTITY_SHROOMAL_HURT = registerSound("entity.shroomalvillager.hit2");
		ENTITY_SHROOMAL_HURT = registerSound("entity.shroomalvillager.hit3");
		ENTITY_SHROOMAL_DEATH = registerSound("entity.shroomalvillager.death1");
		ENTITY_SHROOMAL_DEATH = registerSound("entity.shroomalvillager.death2");
		ENTITY_SHROOMAL_DEATH = registerSound("entity.shroomalvillager.death3");
	}
	
	private static SoundEvent registerSound(String name) 
	{
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}
}
