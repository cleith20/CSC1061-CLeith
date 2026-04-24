import java.util.Scanner;

public class User {
	public static Scanner scan = new Scanner(System.in);
	private int userChoice;
	
	public User() {
		userChoice = 0;
	}
	public int getUserChoice() {
		return userChoice;
	}
	public void selection() {
		userChoice = scan.nextInt();
	}
	
	
}
