
public class Radio {
	
	//define constant with static and final
	private static final int MAX_VOLUME = 10;
	private int volume = 0;
	private boolean hasAntenna = false;
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		}
		else {
			this.volume = volume;
		}
	}
	public boolean hasAntenna() {
		return hasAntenna;
	}
	public void setHasAntenna(boolean hasAntenna) {
		this.hasAntenna = hasAntenna;
	}
	@Override
	public String toString() {
		return "Radio:\nVolume: " + volume + "\nAntenna: " + hasAntenna;
	}
	
}
