package net.rayanfox.fenrisevo.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.rayanfox.fenrisevo.entity.custom.FennecEntity;

public class FennecModel< T extends FennecEntity> extends SinglePartEntityModel<T> {
	private final ModelPart root;
	public FennecModel(ModelPart root) {
		this.root = root.getChild("root");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 16.0F, 2.5F));

		ModelPartData body = root.addChild("body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, -2.5F));

		ModelPartData body_r1 = body.addChild("body_r1", ModelPartBuilder.create().uv(30, 15).cuboid(-3.0F, -3.0F, -3.0F, 6.0F, 11.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -2.0F, -6.0F, 8.0F, 6.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 24).cuboid(-2.0F, 2.0F, -9.0F, 4.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, -3.0F));

		ModelPartData right_ear_r1 = head.addChild("right_ear_r1", ModelPartBuilder.create().uv(46, 7).cuboid(0.0F, -7.0F, -0.5F, 4.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, -2.5F, -0.7854F, 0.2618F, 0.3054F));

		ModelPartData left_ear_r1 = head.addChild("left_ear_r1", ModelPartBuilder.create().uv(46, 0).cuboid(-4.0F, -7.0F, -0.5F, 4.0F, 6.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -2.0F, -2.5F, -0.7854F, -0.2618F, -0.3054F));

		ModelPartData head_sleeping = head.addChild("head_sleeping", ModelPartBuilder.create().uv(0, 12).cuboid(-4.0F, -2.0F, -6.0F, 8.0F, 6.0F, 6.0F, new Dilation(0.0F))
		.uv(0, 24).cuboid(-2.0F, 2.0F, -9.0F, 4.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData leg0 = body.addChild("leg0", ModelPartBuilder.create().uv(14, 24).cuboid(-0.005F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 2.0F, 6.0F));

		ModelPartData leg1 = body.addChild("leg1", ModelPartBuilder.create().uv(22, 24).cuboid(0.005F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 2.0F, 6.0F));

		ModelPartData leg2 = body.addChild("leg2", ModelPartBuilder.create().uv(14, 24).cuboid(-0.005F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, 2.0F, -1.0F));

		ModelPartData leg3 = body.addChild("leg3", ModelPartBuilder.create().uv(22, 24).cuboid(0.005F, 0.0F, -1.0F, 2.0F, 6.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 2.0F, -1.0F));

		ModelPartData tail = body.addChild("tail", ModelPartBuilder.create(), ModelTransform.of(0.0F, 0.0F, 7.0F, 1.5708F, 0.0F, 0.0F));

		ModelPartData bone = tail.addChild("bone", ModelPartBuilder.create().uv(49, 14).cuboid(-1.5F, 1.0F, -1.0F, 3.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData bone2 = bone.addChild("bone2", ModelPartBuilder.create().uv(28, 0).cuboid(-2.0F, 2.5F, -2.25F, 4.0F, 9.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData world = modelPartData.addChild("world", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 64, 32);
	}
	@Override
	public void setAngles(FennecEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);

	}

	@Override
	public ModelPart getPart() {
		return root;
	}
}