package Eagle.module;

import java.util.ArrayList;
import java.util.List;

import Eagle.Client;
import Eagle.Hero.settings.Setting;
import Eagle.event.listeners.EventKey;
import Eagle.module.blatant.Fly;
import Eagle.module.combat.AntiBot;
import Eagle.module.combat.Killaura;
import Eagle.module.combat.Sprint;
import Eagle.module.render.ClickGUI;
import Eagle.module.render.Fullbright;

public class ModuleManager {

	public static ArrayList<Module> modules;
	
	public ModuleManager() {
		modules = new ArrayList<Module>();
		//BLATANT
		modules.add(new Fly());
		//COMBAT
		modules.add(new Sprint());
		modules.add(new Killaura());
		modules.add(new AntiBot());
		
		//RENDER
		modules.add(new Fullbright());
		modules.add(new ClickGUI());
		
		//MISC
		
			
		}
		
	
	public void newModule(Module m) {
		modules.add(m);
	}
	
	public static ArrayList<Module> getModules(){
		return modules;
	}
	
	public static void onUpdate() {
		for(Module m : modules) {
			m.onUpdate();
		}
	}
	
	public void onRender() {
		for(Module m : modules) {
			m.onRender();
		}
	}
	
	public static void onKey(int k) {
		Client.onEvent(new EventKey(k));
		
		for(Module m : modules) {
			if(m.getKey() == k) {
				m.toggle();
			}
		}
		
	
	}
}
