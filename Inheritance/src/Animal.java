
public class Animal {
	//Data Members
	protected String name = "null"; //protected is project wide access, can't access outside project/package
	private double weight = 0.0;	//private is class specific, private is better
	private double height = 0.0;
	
	//Constructors
	public Animal(String name, double weight, double height) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		}
	public Animal() {
//		name = "null";
//		weight = 0.0;
//		height = 0.0;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//Methods
	public String makesSound() {
		return "Blah blah";
	}
	
	
	@Override
	public String toString() {
		return "Animal name = " + name + ", weight = " + weight + ", height = " + height;
	}
	
	
}
