package Eagle;

import java.util.ArrayList;

import org.lwjgl.opengl.Display;

import Eagle.event.Event;
import Eagle.gui.HUD;
import Eagle.module.ModuleManager;
import Eagle.module.combat.Sprint;
import Eagle.module.render.ClickGUI;
import Eagle.Hero.clickgui.clickGUI;
import Eagle.Hero.settings.SettingsManager;
import net.minecraft.client.Minecraft;
import Eagle.module.Module;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import Eagle.Hero.settings.Setting;

public class Client {
	
	public static String name = "Eagle", version = "v1 BETA";
	
	public static ModuleManager moduleManager;
	
	public static HUD hud = new HUD();
	
	public static clickGUI clickGUI;
	
	public static SettingsManager settingsManager;
	
	
	
	
	
		
	public static void startClient() {
		settingsManager = new SettingsManager();
		moduleManager = new ModuleManager();
		clickGUI = new clickGUI();
		
		Display.setTitle(name + " " + version );
	}
	
	public static void onEvent(Event e) {
		for(Module m : moduleManager.modules) {
			if(!m.isToggled())
				continue;
			
				m.onEvent(e);
			
		}
	}
	
	
}
