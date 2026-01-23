
public class Car {
	// Data Members
	private String color;
	private double amountOfGas;
	private int mileage;
	private int grndClearanceFt;
	private int grndClearanceInch;
	
	// Constructors
		//A constructor doesn't have a return type, return type comes after public for methods
		//if a method has the same name as a class, you know it's a constructor
		//Methods can have the same name so long as the signature(arguments) are different
	public Car(String rcolor){
		color = rcolor;
		amountOfGas = 1.0;
		mileage = 5;
	}
	public Car() {
		
	}
	//to refer to the object you're in use this.
	//deciding what you need to give to people/provide
	public Car(String color, double gas) {
		this.color = color;
		amountOfGas = gas;
		mileage = 0;
	}
	
	// Getters and Setters (Accessors and Mutators)
		//getters provide a way to access the values of the properties
		//setters give way to set the information 
		//don't need getters and setters for everything
	public String getColor() {
		//returning the color value which is a String
		//RETURNS
		return color;
	}
	
	public void setColor(String color) {
		//takes argument
		this.color = color;
	}
	public double getAmountOfGas() {
		return amountOfGas;
	}
	public void setAmountOfGas(double amountOfGas) {
		this.amountOfGas = amountOfGas;
	}
	public int getMileage() {
		return mileage;
	}
	public void setGrndClearance(int grndClearance) {
		this.grndClearanceFt = grndClearance/12;
		this.grndClearanceInch = grndClearance % 12;
	}
	
	
	// Methods
	
	public void drive(int numMiles) {
		for(int i = 0; i < numMiles; i++) {
			System.out.print("+");
		}
		mileage += numMiles;
		amountOfGas -= numMiles;
		System.out.println();
	}
	
	//toString()
		//specific method
		//this overrides the original toString
	@Override
	public String toString() {
		return "Car: \nColor: " + color + "\nAmount of Gas: "
				+ amountOfGas + "\nMileage: " + mileage;
	}
	
}
