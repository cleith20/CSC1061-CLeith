import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		InPersonCourse course1 = new InPersonCourse("CSC1061", 20, 20, 3);
		FullRemoteCourse course2 = new FullRemoteCourse("CSC1061", 20, 20, 3,"donald.duck@frontrange.edu");
		RealTimeRemoteCourse course3 = new RealTimeRemoteCourse("CSC1061", 20, 20, 3,"zoom.com");

		List<Course> courseList = new ArrayList<>();
		
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
