
public class FullRemoteCourse extends OnlineCourse{
	private String email = "N/A";

	public FullRemoteCourse(String email) {
		super();
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString() + "\nFull Remote Course\nEmail = " + email;
	}
	
	
}
