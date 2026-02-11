
public class Car extends Vehicle {
	private int tankSize;
	private int carBodyType;

	public Car(String color, int id) {
		super(color, id);
	}

	public int getTankSize() {
		return tankSize;
	}

	public void setTankSize(int tankSize) {
		this.tankSize = tankSize;
	}

	public int getCarBodyType() {
		return carBodyType;
	}

	public void setCarBodyType(int carBodyType) {
		this.carBodyType = carBodyType;
	}

	public String getCar(int carBodyType){
		String car = null;
		if (carBodyType == 1) {
			car = "Sedan";
			tankSize = 12;
		} else if (carBodyType == 2) {
			car = "Hatchback";
			tankSize = 13;
		} else if (carBodyType == 3) {
			car = "SUV";
			tankSize = 18;
		}
		return car;
	}

	@Override
	public void drive() {

	}

	@Override
	public void feed(int numGallons) {
	}

}
