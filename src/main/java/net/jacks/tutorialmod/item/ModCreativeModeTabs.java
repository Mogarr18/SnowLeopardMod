package net.jacks.tutorialmod.item;

import net.jacks.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SNOW_LEOPARD_ITEMS_TAB = CREATIVE_MODE_TAB.register("snow_leopard_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.Snow_Leopard_Spawn_Egg.get()))
                    .title(Component.translatable("creativetab.snow_leopard_items"))
                    .displayItems((itemDisplayParameters, output) ->{

                        output.accept(ModItems.Snow_Leopard_Spawn_Egg.get());

                    }).build());


}
