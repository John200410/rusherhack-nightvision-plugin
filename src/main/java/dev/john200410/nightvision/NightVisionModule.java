package dev.john200410.nightvision;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;

/**
 * @author John200410
 */
public class NightVisionModule extends ToggleableModule {
	
	/**
	 * Constructor
	 */
	public NightVisionModule() {
		super("NightVision", "Enables night vision potion effect", ModuleCategory.CLIENT);
	}
	
	@Subscribe
	private void onUpdate(EventUpdate event) {
		
		if(mc.player == null || mc.player.hasEffect(MobEffects.NIGHT_VISION)) {
			return;
		}
		
		mc.player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, Integer.MAX_VALUE, 255));
	}
	
	@Override
	public void onEnable() {
	
	}
	
	@Override
	public void onDisable() {
		if(mc.player != null) {
			mc.player.removeEffect(MobEffects.NIGHT_VISION);
		}
	}
}
