
public class InPersonCourse extends Course{

	

	public InPersonCourse(String courseName, int numOfStu, int maxStu, int creds) {
		super(courseName, numOfStu, maxStu, creds);
	}

	@Override
	public String toString() {
		return "In Person Class: " + super.toString();
	}

	
}

