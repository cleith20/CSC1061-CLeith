
public class Apple implements Comparable<Apple> {

	private String color = "Red";
	private int dia = 1;
	
	
	// need compareTo method to make the class Comparable
	@Override
	public int compareTo(Apple other) {
		if(dia < other.dia)
			return -1;
		if(dia > other.dia)
			return 1;
		return 0;
	}


}
