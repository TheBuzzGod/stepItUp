package local.stepitup.options;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.options.components.BooleanOptionComponent;
import net.minecraft.client.gui.options.data.OptionsPage;
import net.minecraft.client.gui.options.data.OptionsPages;
import net.minecraft.core.block.Blocks;

@Environment(EnvType.CLIENT)
public class StepItUpGameSettings {

	private StepItUpGameSettings() {}

	private static boolean hasInit = false;

	public static void init() {
		if (hasInit) return;
		hasInit = true;

		OptionsPage StepItUp = OptionsPages.register(new OptionsPage("stepitup.options.title", Blocks.STAIRS_BRICK_DIAMOND.getDefaultStack()))
			.withComponent(new BooleanOptionComponent(StepItUpGameSettingsHolder.ENABLED));
		OptionsPages.register(StepItUp);

	}
}
