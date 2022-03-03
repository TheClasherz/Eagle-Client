package Eagle.gui.util;

public class Timer {
	
	public long lastMS = System.currentTimeMillis();
	
	public void reset() {
		lastMS = System.currentTimeMillis();
	}
	
	public boolean hasTimeElapsed(long time, boolean reset) {
		if(System.currentTimeMillis()-lastMS > time) {
			if(reset)
				reset();
			
			return true;
		}
		return false;
	}

	public boolean hasTimeElapsed(double time, boolean reset) {
		if(System.currentTimeMillis()-lastMS > time) {
			if(reset)
				reset();
			
			return true;
		}
		return false;
	}
}
