package Eagle.event;

public class Event<T> {
	
	public boolean cancled;
	public EventType type;
	public EventDirection direction;
	public boolean isCancled() {
		return cancled;
	}
	public void setCancled(boolean cancled) {
		this.cancled = cancled;
	}
	public EventType getType() {
		return type;
	}
	public void setType(EventType type) {
		this.type = type;
	}
	public EventDirection getDirection() {
		return direction;
	}
	public void setDirection(EventDirection direction) {
		this.direction = direction;
	}
	
	public boolean isPre() {
		if(type == null)
			return false;
		if(type == EventType.PRE);
			return true;
					
			
		}
	
	public boolean isPost() {
		if(type == null)
			return false;
		if(type == EventType.POST);
			return true;
	}
	
	public boolean isIncoming() {
		if(direction == null)
			return false;
		if(direction == EventDirection.INCOMING);
			return true;
	}
	
	public boolean isOutgoing() {
		if(direction == null)
			return false;
		if(direction == EventDirection.OUTGOING);
			return true;
	}
}

