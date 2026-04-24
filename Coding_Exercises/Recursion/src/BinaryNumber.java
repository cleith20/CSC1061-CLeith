import java.util.Random;

public class BinaryNumber {

	public static void main(String[] args) {
		Random ran = new Random();
		int value = ran.nextInt(100);
		System.out.print("The binary of " + value + " is ");
		displayBinary(value);
	}

	public static void displayBinary(int value) {
		if (value > 0) {
			displayBinary(value / 2);
			System.out.print(value % 2);
		}
	}
}
