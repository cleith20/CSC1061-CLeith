//classes should be the singular form
public class Wheel {
	private String material = "Steel";
	private int radius;
	
	public Wheel(String material, int radius) {
		super(); //parent is super, explicitly called, invokes the parent object any time an object is created
		this.material = material;
		this.radius = radius;
	}

	public String getMaterial() {
		return material;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "Wheel:\nMaterial: " + material + "\nRadius: " + radius;
	}

	
	
	
	
}
