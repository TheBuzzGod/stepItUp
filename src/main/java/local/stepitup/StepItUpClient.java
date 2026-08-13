package local.stepitup;

import local.stepitup.option.StepItUpGameSettings;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import turniplabs.halplibe.event.defs.ClientEvents;
import turniplabs.halplibe.util.dependency.Key;

@Environment(EnvType.CLIENT)

public class StepItUpClient implements ClientModInitializer {
	private static final Logger LOGGER = LogManager.getLogger("stepitup-cient");

	public void onInitializeClient() {
		StepItUpClient.LOGGER.info("[StepItUp] InitializeClient");
		ClientEvents.AFTER_CLIENT_START.listen(Key.of(StepItUp.MOD_ID), StepItUpGameSettings::init);
	}
}
