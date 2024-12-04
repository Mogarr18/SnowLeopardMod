package net.jacks.tutorialmod.entity.client;

import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.entity.custom.SnowLeopardEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SnowLeopardRenderer extends MobRenderer<SnowLeopardEntity, SnowLeopardModel> {
    public SnowLeopardRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SnowLeopardModel(pContext.bakeLayer(ModModelLayers.SNOW_LEOPARD_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(SnowLeopardEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "texture/entity/SnowLeopard.png");
    }
}
