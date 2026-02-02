import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite{
	//the method main throws IOException to the parent
	public static void main(String[] args) throws IOException {
		
			//File is a class, this is a relative file in FileIOAndExceptions
			//C:\Users\camer\CSC1061-CLeith\FileIOAndExceptions\fileWriteTest this is the absolute path
		File myFile = new File("fileWriteTest");
		
//		File myFile1 = new File("C:\\Users");
		
//		if(myFile1.canWrite()) {
//			System.out.println("I can write to " + myFile.getAbsolutePath());
//		}
		
		if(!myFile.exists()) {
			//throws IOException
			myFile.createNewFile();
		}
		
			// new FileOutputStream(myFile.getName(), append(true or false) 
			// true = append/add to it, false = replace)
		FileOutputStream fileOut = new FileOutputStream(myFile.getName(), false);
		PrintWriter printer = new PrintWriter(fileOut);
			//Standard out is buffered, to unbuffer call the flush function
			//this line is buffered
		printer.println("The moon is full today!");
		printer.println("It is an auspicious day");
		
//		printer.flush();
			//don't close unless you are done writing, flushes buffer out completely and closes it
		printer.close();
		
		
	}

}
