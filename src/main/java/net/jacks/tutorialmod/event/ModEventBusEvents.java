package net.jacks.tutorialmod.event;

import com.google.common.eventbus.Subscribe;
import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.entity.ModEntities;
import net.jacks.tutorialmod.entity.custom.SnowLeopardEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @Subscribe
    public static void registerAttribute(EntityAttributeCreationEvent event){
        event.put(ModEntities.SnowLeopard.get(), SnowLeopardEntity.createAttributes().build());
    }

}
