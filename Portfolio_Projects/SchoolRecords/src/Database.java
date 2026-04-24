import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Creates new databases and contains methods to read and write to files
 * 
 * 
 */

public class Database {
	private File personDatabase = new File("PersonDatabase.csv");
	PrintWriter printer;
	Scanner reader;
	
	public Database() {
		try {
			if(!personDatabase.exists()) {
				personDatabase.createNewFile();
			}
		}
		catch (IOException e) {
			System.out.println("Could not create database.");
			System.exit(-1);
		}
		try {
			printer = new PrintWriter(personDatabase);
			reader = new Scanner(personDatabase);
		}
		catch(FileNotFoundException e) {
			System.out.println("Database could not be found");
			System.exit(-1);
		}
	}
	/**
	 * Converts Person objects into a .csv file
	 * @param a Person and any of its subclasses
	 */
	public void writePerson(Person person) {
		printer.print(person.getClass().getName());
		printer.print("," + person.getFirstName());
		printer.print("," + person.getAddress());
		printer.print("," + person.getPhoneNum());
		printer.print("," + person.getEmail());
		if(person instanceof Student) {
			printer.print("," + ((Student)person).getStatus());
		}
		if(person instanceof Employee) {
			Employee emp = (Employee)person;
			printer.print("," + emp.getOffice());
			printer.print("," + emp.getSalary());
			printer.print("," + emp.getDateHired());
			if(emp instanceof Faculty) {
				Faculty fac = (Faculty)emp;
				printer.print("," + fac.getOfficeHours());
				printer.print("," + fac.getRank());
			}
			if(emp instanceof Staff) {
				printer.print("," + ((Staff)emp).getTitle());
			}
		}
		printer.println();
		printer.flush();
	}
	/**
	 * Converts elements of a .csv file into an ArrayList
	 * @return List of all each Person in the Database
	 */
	public List<Person> readDatabase() {
		String line;
		List<Person> people = new ArrayList<>();
		while(reader.hasNextLine()) {
			line = reader.nextLine();
		String[] tokens = line.split(",");
		Person person = null;
		if(tokens[0].equals("Student")) {
			person = new Student(tokens[1].trim(),
					tokens[2].trim(),
					Long.parseLong(tokens[3].trim()),
					tokens[4].trim(),
					tokens[5].trim());
			people.add(person);
		}
		if(tokens[0].equals("Staff")) {
			person = new Staff(tokens[1].trim(),
					tokens[2].trim(),
					Long.parseLong(tokens[3].trim()),
					tokens[4].trim(),
					tokens[5].trim(),
					Double.parseDouble(tokens[6].trim()),
					tokens[8].trim());
			people.add(person);
		}
		else if(tokens[0].equals("Faculty")) {
			person = new Faculty(tokens[1].trim(),
					tokens[2].trim(),
					Long.parseLong(tokens[3].trim()),
					tokens[4].trim(),
					tokens[5].trim(),
					Double.parseDouble(tokens[6].trim()),
					tokens[8].trim(),
					tokens[9].trim());
			people.add(person);
			}
		}
		return people;
	}
}
