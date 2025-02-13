package net.jacks.tutorialmod.entity;

import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.entity.custom.SnowLeopardEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TutorialMod.MOD_ID);

    public static final RegistryObject<EntityType<SnowLeopardEntity>> SnowLeopard =
            ENTITY_TYPES.register("snowleopard", () -> EntityType.Builder.of(SnowLeopardEntity::new, MobCategory.CREATURE)
                    .sized(1.0f,1.0f).build("snowleopard"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
