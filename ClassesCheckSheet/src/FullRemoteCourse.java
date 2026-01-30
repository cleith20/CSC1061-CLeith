
public class FullRemoteCourse extends OnlineCourse{
	private String email = "N/A";

	public FullRemoteCourse(String courseName, int numOfStu, int maxStu, int creds, String email) {
		super(courseName, numOfStu, maxStu, creds);
		this.email = email;
	}

	@Override
	public String toString() {
		return "Full Remote Course: " + super.toString() + "\nEmail = " + email;
	}
	
	
}
