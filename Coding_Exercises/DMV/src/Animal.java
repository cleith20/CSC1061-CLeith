
public class Animal implements Feedable{
	private String name;
	private double weight;
	
	public Animal(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	@Override
	public void feed(int numGallons) {
	}
	
	
}
