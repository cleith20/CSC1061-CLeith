
public class Driver {

	public static void main(String[] args) {
		//Car() is the constructor and it is the same name as the class
		//Java by default provides a no argument constructor
		//Once a constructor is provided, the default goes away
		Car myCar = new Car("Pink");

		Car car2 = new Car("Blue", 6.7);
		
		car2.setGrndClearance(16);
		car2.drive(8);
		
		//always calls the toString method
		//assumes you have the toString method
		System.out.println(car2);
		
		
	}

}
