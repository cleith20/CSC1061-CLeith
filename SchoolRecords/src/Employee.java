import java.time.LocalDate;

/**
 * Defines Employee, a subclass of Person
 * 
 */
public class Employee extends Person {
	private String office;
	private double salary;
	private LocalDate dateHired;
	
	/**
	 * Creates a new Employee with date hired
	 * @param name - first name
	 * @param address - street address
	 * @param phoneNum - phone number
	 * @param email - email address
	 * @param office - office faculty works with
	 * 
	 */
	public Employee(String name, String address, long phoneNum, String email, String office, double salary) {
		super(name, address, phoneNum, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = LocalDate.now();
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDateHired() {
		return dateHired;
	}

	public void setDateHired(LocalDate dateHired) {
		this.dateHired = dateHired;
	}

	
	@Override
	public String toString() {
		return super.toString()+ "\n	Office= " + office + ", Salary= " + salary + ", Date Hired= " + dateHired;
	}
	
	
}
