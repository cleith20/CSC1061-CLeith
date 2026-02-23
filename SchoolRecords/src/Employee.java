import java.time.LocalDate;

public class Employee extends Person {
	private String office;
	private double salary;
	private LocalDate dateHired;
	
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
