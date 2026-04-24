import java.util.ArrayList;
import java.util.List;
/**
 * Tests each Class for School Records, creates a list of each object that is created,
 * writes list to database, reads data from the database into an ArrayList
 * 
 * @author Cameron Leith
 * @version 1
 * 
 */
public class TestSchoolRecords {

	public static void main(String[] args) {
		Person stu1 = new Student("George", "111 Way Dr", 9702735999L, "g.jones@frcc.edu",
						"Freshman");
		Person stu2 = new Student("Jess", "222 Plaza Rd", 9702678910L, "j.hughes@frcc.edu",
						"Sophmore");
		Person fac1 = new Faculty("Leigh", "333 Park Pkwy", 9708987654L, "l.smith@frcc.edu",
						"Math", 60000, "1 - 3 PM", "Senior");
		Person fac2 = new Faculty("Jim", "444 City Ln", 9704123568L, "j.halpert@frcc.edu",
						"Social Sciences", 45000, "2 - 5 PM", "Junior");
		Person sta1 = new Staff("Hal", "555 Town Cv", 9709856431L, "h.eve@frcc.edu",
						"Sanitation", 40000, "Janitor");
		Person sta2 = new Staff("Aki", "666 Country St", 9704673823L, "a.hayakawa@frcc.edu",
						"Admissions", 38000, "Receptionist");
		List<Person> people = new ArrayList<>();
		people.add(stu1);
		people.add(stu2);
		people.add(fac1);
		people.add(fac2);
		people.add(sta1);
		people.add(sta2);
		
		Database db = new Database();
		for(Person person : people ) {
			db.writePerson(person);
		}
		List<Person> allPeople = new ArrayList<>();
		allPeople = db.readDatabase();
		System.out.println(allPeople);
	}

}
