package net.jacks.tutorialmod.event;

import com.google.common.eventbus.Subscribe;
import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.entity.client.ModModelLayers;
import net.jacks.tutorialmod.entity.client.SnowLeopardModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.SNOW_LEOPARD_LAYER, SnowLeopardModel::createBodyLayer);
    }
}
