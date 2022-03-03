package Eagle.module.combat;

import org.lwjgl.input.Keyboard;

import Eagle.event.Event;
import Eagle.event.listeners.EventUpdate;
import Eagle.module.Category;
import Eagle.module.Module;
	
	public class Velocity extends Module{

		public Velocity() {
			super("Velocity", Keyboard.KEY_G, Category.BLATANT);
			
		}
		public void onEnable() {
			
			
		}
		
		public void onDisable() {
			
			
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


