package Eagle.Hero.settings;

import java.util.ArrayList;

import Eagle.Client;
import Eagle.module.Module;
import Eagle.Hero.settings.Setting;
import Eagle.Hero.clickgui.clickGUI;
import Eagle.Hero.clickgui.Panel;


public class SettingsManager {
	
	private ArrayList<Setting> settings;
	
	public SettingsManager(){
		this.settings = new ArrayList<Setting>();
	}
	
	public void rSetting(Setting in){
		this.settings.add(in);
	}
	
	public ArrayList<Setting> getSettings(){
		return this.settings;
	}
	
	public ArrayList<Setting> getSettingsByMod(Module module){
		ArrayList<Setting> out = new ArrayList<Setting>();
		for(Setting s : getSettings()){
			if(s.getParentMod().equals(module)) {
				out.add(s);
			}
		}
		if(out.isEmpty()){
			return null;
		}
		return out;
	}
	
	public Setting getSettingByName(String name){
		for(Setting set : getSettings()){
			if(set.getName().equalsIgnoreCase(name)){
				return set;
			}
			
			
		}
	
		System.err.println("["+ Client.name + "] Error Setting NOT found: '" + name +"'!");
		return null;
	}
}