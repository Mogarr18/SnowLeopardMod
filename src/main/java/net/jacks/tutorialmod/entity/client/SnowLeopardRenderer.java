package net.jacks.tutorialmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.jacks.tutorialmod.TutorialMod;
import net.jacks.tutorialmod.entity.custom.SnowLeopardEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SnowLeopardRenderer extends MobRenderer<SnowLeopardEntity, SnowLeopardModel> {
    public SnowLeopardRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SnowLeopardModel(pContext.bakeLayer(ModModelLayers.SNOW_LEOPARD_LAYER)), .5f);
    }

    @Override
    public ResourceLocation getTextureLocation(SnowLeopardEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(TutorialMod.MOD_ID, "textures/entity/snowleopard/snowleopard.png");
    }

    @Override
    public void render(SnowLeopardEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {

        if (pEntity.isBaby()){
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
