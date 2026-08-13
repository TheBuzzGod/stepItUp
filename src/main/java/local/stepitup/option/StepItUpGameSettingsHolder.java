package local.stepitup.option;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.input.InputDevice;
import net.minecraft.client.option.GameSettings;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.OptionBoolean;
import org.lwjgl.input.Keyboard;

@Environment(EnvType.CLIENT)
public final class StepItUpGameSettingsHolder {

	public static boolean stepitupKeyPressed = false;

	public static final KeyBinding TOGGLE = GameSettings.register(
		new KeyBinding("stepItUp.toggle").setDefault(InputDevice.keyboard, Keyboard.KEY_B));

	public static final OptionBoolean ENABLED = GameSettings.register(
		new OptionBoolean("stepItUp.enabled", true));

	private StepItUpGameSettingsHolder() {}
}
