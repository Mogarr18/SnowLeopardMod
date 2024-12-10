package net.jacks.tutorialmod.datagen;

import net.jacks.tutorialmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModReciperProvider extends RecipeProvider implements IConditionBuilder {


    public ModReciperProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput RecipeOutput) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.Snow_Leopard_Spawn_Egg.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A',ModItems.Snow_Leopard_Spawn_Egg.get())
                .unlockedBy("has_snow_leopard_spawn_egg", has(ModItems.Snow_Leopard_Spawn_Egg.get())).save(RecipeOutput);

    }
}
