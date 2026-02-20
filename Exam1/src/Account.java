import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Account implements Withdrawable, Depositable{
	// Data members
	private int id = 0;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private LocalDate dateCreated = LocalDate.now();
	private String name;
	protected List<Transactions> transactions = new ArrayList<>();
	
	// Constructors
	public Account() {
	
	}
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	public Account(int id, double balance, String name) {
		this.id = id;
		this.balance = balance;
		this.name = name;
	}

	// Accessors and Mutators
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public LocalDate getDateCreated() {
		return dateCreated;
	}
	public String getName() {
		return name;
	}
	public List<Transactions> getTransactions() {
		return transactions;
	}
	
	// Methods
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	public double getMonthlyInterest() {
		return balance *(getMonthlyInterestRate() / 100);
	}
	
	@Override
	public String toString() {
		return "Account \n	Id = " + id + ", Date Created = " + dateCreated + ", Balance = " + balance 
				+ ", Monthly Interest Rate = " + getMonthlyInterestRate();
	}
	
	
	
}
