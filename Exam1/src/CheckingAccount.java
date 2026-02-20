import java.time.LocalDate;

public class CheckingAccount extends Account {
	// Data Members
	private double overdraftLimit;

	//Constructors
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public CheckingAccount(int id, double balance, String name, double overdraftLimit) {
		super(id, balance, name);
		this.overdraftLimit = overdraftLimit;
	}
	// Accessors and Mutators
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	//Methods
	@Override
	public void deposit(double num) {
		double balance = getBalance() + num;
		setBalance(balance);
		transactions.add(new Transactions(LocalDate.now(), 'D',num, balance));
	}
	@Override
	public void withdraw(double num) {
		if(getBalance() - num < (0-overdraftLimit)) {
			System.out.println("Withdraw exceeds overdraft limit.");
		}
		else {
		double balance = getBalance() -num;
		setBalance(balance);
		transactions.add(new Transactions(LocalDate.now(), 'W',num, balance));
		}
	}

	@Override
	public String toString() {
		return "Checking " + super.toString();
	}

}
