
public class Course {
	private String courseName = "null";
	private int numStudents = 0;
	private int maxStudents = 0;
	private int credits = 0;
	
	public Course() {
		
	}
	
	public Course(String courseName, int numStudents, int maxStudents, int credits) {
		this.courseName = courseName;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course\nCourse Name = " + courseName + "\nNumber of Students = " + numStudents 
				+ "\nMax Number of Students = " + maxStudents + "\nCredits = " + credits;
	}
	
	
	
}
