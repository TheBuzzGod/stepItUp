package local.stepitup.options;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.option.GameSettings;
import net.minecraft.client.option.OptionBoolean;

@Environment(EnvType.CLIENT)
public final class StepItUpGameSettingsHolder {
	public static final OptionBoolean ENABLED = GameSettings.register(
		new OptionBoolean("stepItUp.enabled", true)
	);

	private StepItUpGameSettingsHolder() {}
}
