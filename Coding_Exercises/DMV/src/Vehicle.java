
public abstract class Vehicle implements Feedable {
	private String color;
	private int id;

	public Vehicle(String color, int id) {
		this.color = color;
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public abstract void drive();

	@Override
	public String toString() {
		return "Vehicle [color=" + color + ", id=" + id + "]";
	}

}
