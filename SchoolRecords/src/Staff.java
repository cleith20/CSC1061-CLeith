public class Staff extends Employee {
	private String title = "Employee";

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
