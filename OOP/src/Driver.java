
public class Driver {

	public static void main(String[] args) {
		//Car() is the constructor and it is the same name as the class
		//Java by default provides a no argument constructor
		//Once a constructor is provided, the default goes away
		
		System.out.println("Number of cars: " + Car.getCount());
		
		Car myCar = new Car("Pink");
		Car car1 = new Car();
		
		System.out.println("Number of cars: " + Car.getCount());
		
		System.out.println("Is the car clean? " + car1.isClean());
		car1.selfCleanCar();
		System.out.println("Is the car clean after cleaning? " + car1.isClean());
		Car.cleanCar(myCar);
		
		System.out.println("ID of car: " + myCar.getId());
		
		//Chaining
		myCar.getRadio().setVolume(11);
		System.out.println(myCar.getRadio());
		Wheel[] wheels = myCar.getWheels();
		System.out.println(wheels[0]);
		
		//always calls the toString method
		//assumes you have the toString method
		//System.out.println(car2);
		
		
	}

}
