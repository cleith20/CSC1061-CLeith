
public class Car {
	
	private static final int MAX_WHEELS = 4;
	
	// Data Members
	private String color = "Grey";
	private double amountOfGas;
	private int mileage;
	private int grndClearanceFt;
	private int grndClearanceInch;
	private int id;
	private boolean isClean = false;
	
	//Static is used to prevent count from going to every instance
	static private int count = 0;
	
	//have radio but also need to make the new object
	private Radio radio = new Radio();
	private Wheel[] wheels = new Wheel[MAX_WHEELS];
	
	// Constructors
		//A constructor doesn't have a return type, return type comes after public for methods
		//if a method has the same name as a class, you know it's a constructor
		//Methods can have the same name so long as the signature(arguments) are different
		//How you want the user to use an object
	public Car(String rcolor){
		color = rcolor;
		amountOfGas = 1.0;
		mileage = 5;
		count++;
		id = count;
		assignWheels();
	}
	public Car() {
		count++;
		id = count;
		assignWheels();
	}
	//to refer to the object you're in use this.
	//deciding what you need to give to people/provide
	public Car(String color, double gas) {
		this.color = color;
		amountOfGas = gas;
		mileage = 0;
		count++;
		id = count;
		assignWheels();
	}
	
	// Getters and Setters (Accessors and Mutators)
		//getters provide a way to access the values of the properties
		//setters give way to set the information 
		//don't need getters and setters for everything
		//how the user access the object
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
	public int getId() {
		return id;
	}
	public static int getCount() {
		return count;
	}
	public boolean isClean() {
		return isClean;
	}
	
	public Radio getRadio() {
		return radio;
	}
	public Wheel[] getWheels() {
		return wheels;
	}
	
	// Methods
		//actions your object does
	
	public void drive(int numMiles) {
		for(int i = 0; i < numMiles; i++) {
			System.out.print("+");
		}
		mileage += numMiles;
		System.out.println();
	}
	
	public void selfCleanCar() {
		isClean = true;
	}
	//static doesn't auto know what to set, must give something
	public static void cleanCar(Car car) {
		car.isClean = true;
	}
	private void assignWheels() {
		for(int i = 0; i < wheels.length;i++) {
			wheels[i] = new Wheel("Alloy", 16);
		}
}
	//toString()
		//specific method
		//this overrides the original toString
		//describe the object in words
	@Override
	public String toString() {
		return "Car: \nColor: " + color + "\nAmount of Gas: "
				+ amountOfGas + "\nMileage: " + mileage;
	}
	
}
