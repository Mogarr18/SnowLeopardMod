package net.jacks.tutorialmod.entity.client;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.jacks.tutorialmod.entity.client.animations.SnowLeopardAnimations;
import net.jacks.tutorialmod.entity.custom.SnowLeopardEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;

public class SnowLeopardModel extends HierarchicalModel<SnowLeopardEntity> {
	private final ModelPart SnowLeopard;
	private final ModelPart head;


	public SnowLeopardModel(ModelPart root) {
		this.SnowLeopard = root.getChild("SnowLeopard");
		this.head = this.SnowLeopard.getChild("head");

	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition SnowLeopard = partdefinition.addOrReplaceChild("SnowLeopard", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = SnowLeopard.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, -3.0F, -5.0F, 6.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(16, 14).addBox(-3.0F, -5.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 14).addBox(1.0F, -5.0F, -2.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(1, 11).addBox(-2.0F, 0.5F, -7.0F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(15, 18).addBox(-1.5F, -0.5F, -6.5F, 3.0F, 1.5F, 1.5F, new CubeDeformation(0.0F))
		.texOffs(25, 17).addBox(-1.0F, -0.25F, -6.99F, 2.0F, 1.75F, 1.5F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, -10.5F, -7.0F));

		PartDefinition body = SnowLeopard.addOrReplaceChild("body", CubeListBuilder.create().texOffs(34, 16).addBox(-5.0F, -4.0F, -4.0F, 8.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition upperBody = SnowLeopard.addOrReplaceChild("upperBody", CubeListBuilder.create().texOffs(28, 0).addBox(-5.0F, -10.0F, -4.0F, 10.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -10.0F, 2.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition leg0 = SnowLeopard.addOrReplaceChild("leg0", CubeListBuilder.create().texOffs(0, 22).addBox(-2.25F, 1.0F, -1.0F, 2.5F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, 7.0F));

		PartDefinition leg1 = SnowLeopard.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 22).addBox(-0.25F, 1.0F, -1.0F, 2.5F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -8.0F, 7.0F));

		PartDefinition leg2 = SnowLeopard.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(0, 22).addBox(-2.25F, 1.0F, -2.0F, 2.5F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, -8.0F, -4.0F));

		PartDefinition leg3 = SnowLeopard.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 22).addBox(-0.25F, 1.0F, -2.0F, 2.5F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -8.0F, -4.0F));

		PartDefinition tail = SnowLeopard.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(9, 22).addBox(-1.125F, 0.5736F, -1.8192F, 2.5F, 8.0F, 2.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-1.0F, -12.0F, 8.0F, 0.9599F, 0.0F, 0.0F));

		PartDefinition tail_r1 = tail.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(9, 22).addBox(-2.125F, -10.9564F, 6.001F, 2.5F, 6.0F, 2.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(1.0F, 21.0F, -1.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail_r2 = tail.addOrReplaceChild("tail_r2", CubeListBuilder.create().texOffs(19, 22).addBox(-1.3375F, -2.342F, -2.6464F, 2.75F, 6.0F, 2.5F, new CubeDeformation(0.25F)), PartPose.offsetAndRotation(0.0375F, 12.8234F, 4.7067F, 0.9599F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(SnowLeopardEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch);

		this.animate(entity.idleAnimationState, SnowLeopardAnimations.IDLE,ageInTicks, 1f);
	}

	private void applyHeadRotation(float headYaw, float headPitch) {
		headYaw = Mth.clamp(headYaw, -30f, 30f);
		headPitch = Mth.clamp(headPitch, -25f, 45f);

		this.head.xRot = headYaw * ((float)Math.PI / 180F);
		this.head.yRot = headPitch * ((float)Math.PI / 180F);
	}

	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
		SnowLeopard.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
	}

	@Override
	public ModelPart root() {
		return SnowLeopard;
	}
}