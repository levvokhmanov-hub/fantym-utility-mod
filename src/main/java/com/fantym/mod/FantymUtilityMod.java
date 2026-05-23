package com.fantym.mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FantymUtilityMod implements ModInitializer {
	public static final String MOD_ID = "fantym_utility_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Fantym Utility Mod инициализирован!");
	}
}
