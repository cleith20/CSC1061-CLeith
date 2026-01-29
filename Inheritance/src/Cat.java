
public class Cat extends Animal {
	private int lengthOfWhiskers = 0;
	
	public Cat(int lengthOfWhiskers) {
		//super(); //needs no arg constructor
		//super("Mochi", 11.0, 1.0); //don't need no arg constructor, args included
		this.setHeight(1.1);		//use set.DataMember if not super
		this.setName("Mochi");
		this.setWeight(11.1);
		this.lengthOfWhiskers = lengthOfWhiskers;
	}
	 public Cat(String name, double weight, double height, int lengthOfWhiskers) {
		 super(name, weight, height);
		 this.lengthOfWhiskers = lengthOfWhiskers;
	 }
	 
	 @Override
	 public String makesSound() {
			return "Meow";
		}
	 
	 @Override
	 public String toString() {
		return super.toString() + " Whiskers = " + lengthOfWhiskers;
	 }
	 
	 
}
