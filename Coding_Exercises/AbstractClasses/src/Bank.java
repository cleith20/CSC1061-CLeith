
public class Bank extends FinancialInstitution {

	public Bank(String name) {
		super(name);
	}
	
	public void setSavings(int num) {
		
	}

	@Override
	public double getInterestRate() {
		return 0.06;
	}

	@Override
	public int compareTo(FinancialInstitution o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
