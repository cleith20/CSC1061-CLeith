
public class Horse extends Animal{
	private double speed = 0.0;

	public Horse(String name, double weight, double height, double speed) {
		super(name, weight, height);
		this.speed = speed;
	}
	
	 @Override
	 public String makesSound() {
			return "Neigh";
		}

	@Override
	public String toString() {
		return super.toString() + "Speed = " + speed;
	}
	
	
}
