package Eagle.event.listeners;

import Eagle.event.Event;
import net.minecraft.network.Packet;

public class EventRecivePacket extends Event{
	
	private Packet packet;

	public EventRecivePacket(Packet packet) {
		this.packet = packet;
		
	}
	
	public Packet getPacket() { return packet; }
	public void setPacket(Packet packet) {this.packet = packet; }
}
