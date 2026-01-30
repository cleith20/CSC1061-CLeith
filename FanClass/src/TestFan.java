
public class TestFan {

	public static void main(String[] args) {
		//Create array for fans
		Fan[] fans = new Fan[2];
		
		//Create fans
		Fan fan1 = new Fan(3, true, 10.0, "yellow");
		Fan fan2 = new Fan(2, false, 5.0, "blue");
		
		//Add fans to Fan array
		fans[0] = fan1;
		fans[1] = fan2;
		
		//Traverse Fan array to print fans
		for(Fan test : fans) {
			printFan(test);
			
		}

	}
	//Method to print fans
	public static void printFan(Fan test) {
		System.out.println(test);
	}

}
