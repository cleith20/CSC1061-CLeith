import java.util.ArrayList;
import java.util.List;

public class BreakStatement {

	public static void main(String[] args) {
		int[] intArr = new int[4]; // 8 bits = 1 byte, memory addresses are in hex
		// int = 4 bytes, char = 1 byte
		// int ans = intArr[3]; 100 + (3 *4)
		// array at memory 100 (base 10) +(array location)*primitive type size
		// rows then columns
		// make me 4 arrays of 3
		int[][] intArray = { { 1, 2, 3 }, { 4, 8, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		// how you want it to behave what you want
		// list is an interface, it's a behavior
		List<Integer> intList = new ArrayList<>();

		intList.add(Integer.valueOf(1));
		// Auto boxing, wrapping the 2 in the Integer class,
		// java takes the int and wraps in the Integer class
		// works with all primitive types when using
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(3);

		for (int i = 0; i < intList.size(); i++) {
			System.out.print(intList.get(i));
		}
		System.out.println();

		for (Integer x : intList) {
			System.out.print(x);
		}
		System.out.println();

		// Same loop, auto un-boxing
		for (int x : intList) {
			System.out.print(x);
		}
		System.out.println();

		int index = findIndex(intList, 3);
		System.out.println("Found at index: " + index);

		int rowIndex = -1;
		int columnIndex = -1;
		boolean found = false;

		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray[i].length; j++) {
				if (intArray[i][j] == 8) {
					rowIndex = i;
					columnIndex = j;
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		System.out.print("Row = " + rowIndex + " Column = " + columnIndex);

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// each pass through a loop = iteration
		for(int i = 0; i < arr.length; i++) {
			System.out.println("\nStart");
			if(arr[i] % 2 > 0) {
				System.out.print("negative");
				continue;      //continue takes you back to the top of the loop, continue on to the next iteration
			}
				System.out.println("print something...");
		}

	} // main ends

	public static int findIndex(List<Integer> ints, int num) {
		int index = -1;
		for (int i = 0; i < ints.size(); i++) {
			if (num == ints.get(i)) {
				index = i;
				break;  // stops the for loop once it finds the first instance of num
			} 			// applies to inner most loop
		}
		return index;
	}

}
