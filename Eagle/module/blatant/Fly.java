package Eagle.module.blatant;

import org.lwjgl.input.Keyboard;

import Eagle.event.Event;
import Eagle.event.listeners.EventUpdate;
import Eagle.module.Category;
import Eagle.module.Module;
	
	public class Fly extends Module{

		public Fly() {
			super("Fly", Keyboard.KEY_G, Category.BLATANT);
			
		}
		public void onEnable() {
			
			
		}
		
		public void onDisable() {
			mc.thePlayer.capabilities.allowFlying = false;
			mc.thePlayer.capabilities.isFlying = false;
			
		}
		
		public void onEvent(Event e) {
			if(e instanceof EventUpdate) {
				if(e.isPre()) {
					mc.thePlayer.capabilities.allowFlying = true;
					mc.thePlayer.capabilities.isFlying = true;
					
				}
			}
		}

	}


