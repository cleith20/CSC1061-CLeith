import java.time.LocalDate;

public class SavingsAccount extends Account{
	// Data Members
	private double minAmount;

	// Constructors
	public SavingsAccount(int id, double balance, double minAmount) {
		super(id, balance);
		this.minAmount = minAmount;
	}
	// Accessors and Mutators
	public double getMinAmount() {
		return minAmount;
	}

	public void setMinAmount(double minAmount) {
		this.minAmount = minAmount;
	}
	
	// Methods
	@Override
	public void deposit(double num) {
		double balance = getBalance() + num;
		setBalance(balance);
		transactions.add(new Transaction(LocalDate.now(), 'D',num, balance));
		
	}
	@Override
	public void withdraw(double num) {
		if(num > getBalance()) {
			System.out.println("Withdraw will cause overdraft.");
		}
		else {
			if(num > minAmount) {
				System.out.println("Warning: Withdraw drops account below minimum amount.");
			}
		double balance = getBalance() -num;
		setBalance(balance);
		transactions.add(new Transaction(LocalDate.now(), 'W',num, balance));
		}
	}

	@Override
	public String toString() {
		return "Savings " + super.toString();
	}

}
