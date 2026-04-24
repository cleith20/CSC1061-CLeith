import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args){
			//to read from a file use scanner
		File myFile = new File("fileWriteTest");
			//must declare outside of the try block so it is visible to other methods
		Scanner input = null;
		
		try {
		input = new Scanner(myFile);
		}
			//FileNotFoundException is a class, extends IOException, extends Exception
		catch (FileNotFoundException e){
			//System.out.println("Got File Not Found Exception");
			System.out.println(e.getMessage());
			//e.printStackTrace();
			System.exit(-1); // -1 means something went wrong, 0 means all good, The Graceful Exit
		}
		
		while(input.hasNextLine()) {
			String line = input.nextLine();
			System.out.println(line);
		}
		
		int [] numbers = {1,2,3};
		try {
		addOne(numbers, 4);
		}
			//make your catch specific
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
			System.exit(-1);
		}
	}
	
	public static void addOne(int[]nums, int index) throws ArrayIndexOutOfBoundsException{
		if(index >= nums.length) {
			throw new ArrayIndexOutOfBoundsException("Index " + index + " exceeds length of array " + nums.length);
		}
		nums[index]++;
	}

}
