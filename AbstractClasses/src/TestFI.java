import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestFI {

	public static void main(String[] args) throws CloneNotSupportedException{

		// cannot work because FinancialInstitution is abstract
		// FinancialInstitution fi = new FinancialInstitution("People's Bank");

		// List is a Collection of things
		List<FinancialInstitution> fiList = new LinkedList<>();

		Bank b1 = new Bank("Bank of America");
		int one = 1;
		
		fiList.add(b1);
		System.out.println("Bank of America's interest rate is " + b1.getInterestRate() * 100 + "%");
		fiList.add(new CreditUnion("MyCU"));
		fiList.add(new NonLender("Useless FI"));

		fiList.get(0).setFiId(10);
		fiList.get(1).setFiId(2);
		fiList.get(2).setFiId(4);
		
		

		for (int i = 0; i < fiList.size(); i++) {
			System.out.println(fiList.get(i));
			if (fiList.get(i) instanceof Bank) {
				((Bank) fiList.get(i)).setSavings(4);
			}
		}
		theEnd();
		System.out.println();

		// sorting is about comparing
		// uses Comparable<T> interface then compareTo() method from comparable
		Collections.sort(fiList);
		for (FinancialInstitution list : fiList) {
			System.out.println(list);
		}
		theEnd();
		System.out.println();
		// reverse sort
		Collections.sort(fiList, Collections.reverseOrder());
		for (FinancialInstitution list : fiList) {
			System.out.println(list);
		}
		theEnd();
		
		
		b1.setAddress(new Address());
		b1.getAddress().street = "123 Main St";
		
		FinancialInstitution b2 = null;
		if(b1 instanceof Cloneable) {
			b2 = b1.clone();
		}
		
		b2 = b1.clone();
		b2.setFiId(4);
		b2.setFiName("Clone Bank");
		fiList.add(b2);
		
		
		for (FinancialInstitution list : fiList) {
			System.out.println(list);
		}
		theEnd();
		
	}
	
	
	public static void theEnd() {
		System.out.println("End of list");
	}
}
