package net.rayanfox.fenrisevo.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.rayanfox.fenrisevo.Fenrisevolution;
import net.rayanfox.fenrisevo.entity.custom.FennecEntity;

public class FennecRenderer extends MobEntityRenderer<FennecEntity, FennecModel<FennecEntity>> {
private static final Identifier TEXTURE = new Identifier(Fenrisevolution.MOD_ID, "textures/entity/fennec.png");
    public FennecRenderer(EntityRendererFactory.Context context) {
        super(context, new FennecModel<>(context.getPart(ModModelLayers.FENNEC)), 0.7f );
    }

    @Override
    public Identifier getTexture(FennecEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(FennecEntity mobEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if(mobEntity.isBaby()){
            matrixStack.scale(0.5f,0.5f,0.5f);

        }else {
            matrixStack.scale(0.7f,0.7f,0.7f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
