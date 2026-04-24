/**
 * Defines Faculty, a subclass of Employee
 * 
 * 
 */
public class Faculty extends Employee{
	private String officeHrs;
	private String rank;
	
	/**
	 * Creates a new Faculty
	 * @param name - first name
	 * @param address - street address
	 * @param phoneNum - phone number
	 * @param email - email address
	 * @param office - office faculty works with
	 * @param salary - yearly salary
	 * @param officeHours - faculty submitted office hours
	 * @param rank - junior or senior
	 * 
	 */
	public Faculty(String name, String address, long phoneNum, 
			String email, String office, double salary,
			String officeHours, String rank) {
		super(name, address, phoneNum, email, office, salary);
		this.officeHrs = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHrs;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHrs = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return super.toString() + "\n	Office Hours= " + officeHrs + ", Rank= " + rank + "\n";
	}
	
	
}
