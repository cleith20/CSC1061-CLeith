
public class Circle extends GeometricObject {
	
	private double radius = 1.0;
	
	public Circle() {
	}
	
	public Circle(String color, boolean isFilled, double radius) {
		super(color, isFilled);
		this.radius = radius;
	}
	
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Methods
	public double getArea() {
		return Math.PI * radius*radius;
	}
	public double modifyRadius(int modifier) {
		radius = radius * modifier;
		return radius;
	}
	//Signature - name of the method, the parameter types, and number of parameters
	public static double getArea(int radius) {
		return Math.PI * radius * radius;
	}
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	@Override
	public String toString() {
		return "Circle \nRadius = " + radius + ", Color = " + getColor() + ", Filled = " + isFilled()
				+ ", Date Created = " + getDateCreated();
	}

	
	
	
}
