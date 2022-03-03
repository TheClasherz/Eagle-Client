package Eagle.module;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import Eagle.Hero.settings.Setting;
import Eagle.event.Event;
import net.minecraft.client.Minecraft;

public class Module {
	
	protected Minecraft mc = Minecraft.getMinecraft();
	public String name;
	public int key;
	public boolean toggled;
	public Category category;
	public boolean expanded;
	
	
	
	public Module(String nm, int k, Category c) {
		name = nm;
		key = k;
		category = c;
		toggled = false;
		setup();

}
	

	
	public void onEvent(Event e) {
		
	}
	
	public void toggle() {
		toggled = !toggled;
		if(toggled) {
			onEnable();
		}else {
			onDisable();
			
			
		}
	}

	public void onEnable() {}
	public void onDisable() {}
	public void onUpdate() {}
	public void onRender() {}
	public void setup() {}
	
	public List<Setting> settings = new ArrayList<Setting>();
	
	public void addSetting(Setting... setting) {
		this.settings.add((Setting) Arrays.asList(settings));
	
	}
	
	public Minecraft getMc() {
		return mc;
	}

	public void setMc(Minecraft mc) {
		this.mc = mc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public boolean isToggled() {
		return toggled;
	}

	public void setToggled(boolean toggled) {
		this.toggled = toggled;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	}