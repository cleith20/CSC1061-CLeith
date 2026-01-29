import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		InPersonCourse course1 = new InPersonCourse();
		FullRemoteCourse course2 = new FullRemoteCourse("donald.duck@frontrange.edu");
		RealTimeRemoteCourse course3 = new RealTimeRemoteCourse("zoom.com");

		ArrayList<Course> courseList = new ArrayList<>();
		
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		
		for(Course course : courseList) {
			printCourse(course);
		}
	
	}

	public static void printCourse(Course course) {
		System.out.println(course);
		System.out.println();
	}
}
