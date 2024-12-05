package net.jacks.tutorialmod.event;

import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.entity.ModEntities;
import net.jacks.tutorialmod.entity.client.ModModelLayers;
import net.jacks.tutorialmod.entity.client.SnowLeopardModel;
import net.jacks.tutorialmod.entity.custom.SnowLeopardEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.SNOW_LEOPARD_LAYER, SnowLeopardModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(ModEntities.SnowLeopard.get(), SnowLeopardEntity.createAttributes().build());
    }

}
