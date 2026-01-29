
public class Dog extends Animal{
	private int barkVol = 0;

	public Dog(String name, double weight, double height, int barkVol) {
		super(name, weight, height);
		this.barkVol = barkVol;
	}
	
	 @Override
	 public String makesSound() {
			return "Woof";
		}
	
	public String toString() {
		return super.toString() + " Bark Volume = " + barkVol;
	}
}
