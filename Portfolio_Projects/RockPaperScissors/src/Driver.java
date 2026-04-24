import java.util.Scanner;

public class Driver {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to Rock, Paper, Scissors!\nPress Enter to Begin...");
		scan.nextLine();
		
		String a = "y";
		while(a.equals("y")) {
		Play game = new Play();
		game.play();
		System.out.println("Do you want to play Again? y/n");
		 a = scan.next();
		}
		System.out.println("Goodbye.");
	}

}
