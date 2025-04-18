package com.tutorialmod.world.feature;

import com.tutorialmod.world.feature.ore.GenerateOres;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = "tutorialmod")
public class WorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        GenerateOres.generateOres(event);



    }
}

