package net.rayanfox.fenrisevo;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.rayanfox.fenrisevo.block.ModBlocks;
import net.rayanfox.fenrisevo.entity.ModEntities;
import net.rayanfox.fenrisevo.entity.custom.FennecEntity;
import net.rayanfox.fenrisevo.item.ModItemGroups;
import net.rayanfox.fenrisevo.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fenrisevolution implements ModInitializer {
	public static final String MOD_ID = "fenrisevolution";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		LOGGER.info("Evolving Fennecs Scree");
		FabricDefaultAttributeRegistry.register(ModEntities.FENNEC, FennecEntity.createFennecAttributes());
	}
}