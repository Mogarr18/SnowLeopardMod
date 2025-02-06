package net.jacks.tutorialmod.event;

import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.entity.ModEntities;
import net.jacks.tutorialmod.entity.client.ModModelLayers;
import net.jacks.tutorialmod.entity.client.SnowLeopardModel;
import net.jacks.tutorialmod.entity.custom.SnowLeopardEntity;
import net.minecraft.world.entity.SpawnPlacementTypes;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
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

    @SubscribeEvent
    public static void registerSpawnPlacement(SpawnPlacementRegisterEvent event){
        event.register(ModEntities.SnowLeopard.get(), SpawnPlacementTypes.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
                SnowLeopardEntity::checkSnowLeopardSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }
}
