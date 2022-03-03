package Eagle.module.render;

	import org.lwjgl.input.Keyboard;

	import Eagle.event.Event;
	import Eagle.event.listeners.EventUpdate;
	import Eagle.module.Category;
	import Eagle.module.Module;

	public class Fullbright extends Module{

		public Fullbright() {
			super("Fullbright", Keyboard.KEY_0, Category.RENDER);
			
		}
		public void onEnable() {
			
			
		}
		
		public void onDisable() {
			
			mc.gameSettings.gammaSetting = 1;
			
		}
		
		public void onEvent(Event e) {
			if(e instanceof EventUpdate) {
				if(e.isPre()) {
					mc.gameSettings.gammaSetting = 9999;
				}
			}
		}

	}
