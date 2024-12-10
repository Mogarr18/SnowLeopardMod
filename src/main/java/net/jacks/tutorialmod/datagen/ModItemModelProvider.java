package net.jacks.tutorialmod.datagen;

import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.Snow_Leopard_Spawn_Egg.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
