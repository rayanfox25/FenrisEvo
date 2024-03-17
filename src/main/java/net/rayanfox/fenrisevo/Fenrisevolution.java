package net.rayanfox.fenrisevo;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fenrisevolution implements ModInitializer {
	public static final String MOD_ID = "fenrisevolution";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {


		LOGGER.info("Evolving Fennecs Scree");
	}
}