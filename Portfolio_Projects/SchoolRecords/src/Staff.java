/**
 * Defines Staff, a subclass of Employee
 * 
 * 
 */
public class Staff extends Employee {
	private String title = "Employee";
	/**
	 * Creates a new Staff
	 * @param name - first name
	 * @param address - street address
	 * @param phoneNum - phone number
	 * @param email - email address
	 * @param office - office faculty works with
	 * @param salary - yearly salary
	 * @param officeHours - faculty submitted office hours
	 * @param title - employee job title
	 * 
	 */
	public Staff(String name, String address, long phoneNum, String email, 
			String office, double salary, String title) {
		super(name, address, phoneNum, email, office, salary);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	@Override
	public String toString() {
		return super.toString() + "\n	Staff Title= " + title + "\n";
	}
	
	
}
