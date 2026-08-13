package local.stepitup.mixin.entity;

import local.stepitup.options.StepItUpGameSettingsHolder;
import net.minecraft.client.Minecraft;
import net.minecraft.core.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = Entity.class, remap = false)
public abstract class EntityMixin {

	@Shadow
	public float footSize;

	@Shadow
	public abstract boolean isSneaking();

	@Shadow
	public int id;

	@Inject(method = "move", at = @At("HEAD"))
	private void onMove(double xd, double yd, double zd, CallbackInfo ci) {
		if (id != Minecraft.getMinecraft().thePlayer.id) {
			return;
		}

		if (isSneaking() || !StepItUpGameSettingsHolder.ENABLED.value) {
			footSize = 0.5F;
		} else {
			footSize = 1.0F;
		}
	}
}

