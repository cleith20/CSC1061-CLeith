import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a number.");
		int num = scan.nextInt();
		System.out.println("The factorical of " + num + " is " + factorial(num));

	}

	private static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
}
