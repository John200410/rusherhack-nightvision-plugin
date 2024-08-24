package dev.john200410.nightvision;

import org.rusherhack.client.api.RusherHackAPI;

/**
 * Example rusherhack plugin
 *
 * @author John200410
 */
public class Plugin extends org.rusherhack.client.api.plugin.Plugin {
	
	@Override
	public void onLoad() {
		
		//logger
		this.getLogger().info("Loading NightVision plugin");
		
		final NightVisionModule exampleModule = new NightVisionModule();
		RusherHackAPI.getModuleManager().registerFeature(exampleModule);
	}
	
	@Override
	public void onUnload() {
		this.getLogger().info("NightVision plugin unloaded!");
	}
	
}