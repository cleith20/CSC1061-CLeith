/**
 * Defines Student, a subclass of Person
 * 
 * 
 */
public class Student extends Person{
	private String status;
	/**
	 * Creates a new Student
	 * @param name - first name
	 * @param address - street address
	 * @param phoneNum - phone number
	 * @param email - email address
	 * @param statues - class level of the student
	 * 
	 */
	public Student(String name, String address, long phoneNum, String email, String status) {
		super(name, address, phoneNum, email);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return super.toString() + "\n	Student Status= " + status + "\n";
	}
	
	
}
