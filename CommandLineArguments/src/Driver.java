
public class Driver {

	/**
	 * Tests the conversion methods.
	 * @param args command-line arguments
	 */
	public static void main(String[] args) {
		double answer = 0.0;
		if(args.length < 2) {
			System.out.println("Usage: ");
			System.out.println("\t-f <temp> to convert to fahrenheit");
			System.out.println("\t-c <temp> to convert to celsius");
			System.exit(-1);
		}
		
		// convert to farhenheit from celsius
		if(args[0].equals("-f")) {
			answer = TempConvert.ConvertCelToFah(Double.parseDouble(args[1]));
			System.out.println("The fahrenheit value is " + answer);
		}
		else if(args[0].equals("-c")) {
			answer = TempConvert.ConvertFahToCel(Double.parseDouble(args[1]));
			System.out.println("The celsius value is " + answer);
		}
		else {
			System.out.println("Unrecognised option: " + args[0]);
		}

	}

}
