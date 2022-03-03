package Eagle.module.combat;

import org.lwjgl.input.Keyboard;

import java.util.Collection;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.server.S0CPacketSpawnPlayer;
import Eagle.Client;
import Eagle.event.Event;
import Eagle.event.listeners.EventRecivePacket;
import Eagle.event.listeners.EventUpdate;
import Eagle.module.Category;
import Eagle.module.Module;

public class AntiBot extends Module{

	public AntiBot() {
		super("AntiBot", Keyboard.KEY_NONE, Category.COMBAT);
		
	}
	public void onEnable() {
		for(Object entity : mc.theWorld.loadedEntityList) {
			
		}
		
	}
	
	public void onDisable() {
		
		
	}
	

		
		

	public void onEvent(Event e, EventRecivePacket event) {
		if(e instanceof EventUpdate) {
			if(e.isPre()) {
				for(Object entity : mc.theWorld.loadedEntityList) {
					for(Module m : Client.moduleManager.getModules()) {
					if(((EventRecivePacket)event).getPacket() instanceof S0CPacketSpawnPlayer) {
						m.setToggled(false);
							
						}
					
					}
					
			}
}
		}
	}
}