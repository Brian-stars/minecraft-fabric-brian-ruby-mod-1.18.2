package net.Brian_stars.brian_ruby_mod.mixin;

import net.Brian_stars.brian_ruby_mod.BrianRubyMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class ExampleMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		BrianRubyMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}
