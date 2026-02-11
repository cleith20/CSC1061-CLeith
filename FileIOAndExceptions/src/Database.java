import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Database {
	private File outFile = new File("database.csv");
	PrintWriter printer;
	Scanner reader;
	
	public Database() {
		try {
			if(!outFile.exists()) {
				outFile.createNewFile();
			}
		}
		catch (IOException e) {
			System.out.println("Could not create database.");
			System.exit(-1);
		}
		try {
			printer = new PrintWriter(outFile);
			reader = new Scanner(outFile);
		}
		catch(FileNotFoundException e) {
			System.out.println("Database could not be found");
			System.exit(-1);
		}
	}
	public void write(GeometricObject shape) {
		printer.print(shape.getClass().getName());
		printer.print("," + shape.getColor());
		printer.print("," + shape.isFilled());
		if(shape instanceof Circle) {
			printer.print("," + ((Circle)shape).getRadius());
		}
		if(shape instanceof Rectangle) {
			Rectangle rect = (Rectangle)shape;
			printer.print("," + rect.getHeight());
			printer.print("," + rect.getWidth());
		}
		printer.println();
		printer.flush();
	}
	public GeometricObject readObject() {
		String line;
		if(reader.hasNextLine()) {
			line = reader.nextLine();
		}
		else {
			return null;
		}
		//exclusive of what is in " "
		String[] tokens = line.split(",");
		
		GeometricObject obj = null;
		if(tokens[0].equals("Circle")) {
			obj = new Circle(tokens[1].trim(),
					Boolean.parseBoolean(tokens[2].trim()),
					Double.parseDouble(tokens[3].trim()));
			return obj;
		}
		if(tokens[0].equals("GeometricObject")) {
			obj = new GeometricObject(tokens[1].trim(),
					Boolean.parseBoolean(tokens[2].trim()));
			return obj;
		}
		else if(tokens[0].equals("Rectangle")) {
			obj = new Rectangle(tokens[1].trim(),
					Boolean.parseBoolean(tokens[2].trim()),
					Double.parseDouble(tokens[3].trim()),
					Double.parseDouble(tokens[4].trim()));
			return obj;
		}
		return null;
	}
}
