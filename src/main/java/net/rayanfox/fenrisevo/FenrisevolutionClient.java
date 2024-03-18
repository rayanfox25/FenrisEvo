package net.rayanfox.fenrisevo;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.rayanfox.fenrisevo.entity.ModEntities;
import net.rayanfox.fenrisevo.entity.client.FennecModel;
import net.rayanfox.fenrisevo.entity.client.FennecRenderer;
import net.rayanfox.fenrisevo.entity.client.ModModelLayers;

public class FenrisevolutionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.FENNEC, FennecRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.FENNEC, FennecModel::getTexturedModelData);
    }
}
