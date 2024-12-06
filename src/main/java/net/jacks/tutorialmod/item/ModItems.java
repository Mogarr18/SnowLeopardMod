package net.jacks.tutorialmod.item;

import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);


    public static final RegistryObject<Item> Snow_Leopard_Spawn_Egg = ITEMS.register("snow_leopard_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SnowLeopard, 0x664216, 0xdeab1f,
                    new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
