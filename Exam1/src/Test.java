
public class Test {

	public static void main(String[] args) {
		
		Account c1 = new CheckingAccount(1111, 2000, 200);
		c1.setAnnualInterestRate(0.5);
		c1.withdraw(2100);
		c1.deposit(3000);
		System.out.println(c1);
		
		Account s1 = new SavingsAccount(1100, 500, 200);
		s1.setAnnualInterestRate(1.0);
		s1.withdraw(300);
		System.out.println(s1);
		
		Account c2 = new CheckingAccount(2222, 1000, "George", 200);
		c2.setAnnualInterestRate(1.5);
		System.out.println(c2);
		
		c2.deposit(30);
		c2.deposit(40);
		c2.deposit(50);
		c2.withdraw(5);
		c2.withdraw(4);
		c2.withdraw(2);
		
		accountSum(c2);
	}

	// Method to print Account Summary with Transaction Details
	public static void accountSum(Account account) {
		System.out.println("Account ID: " + account.getId() + "\n	Account Holder Name: " + account.getName() 
		+ "\n	Annual Interest Rate: " + account.getAnnualInterestRate() + "\n	Balance: " + account.getBalance()
		+ "\nTransactions for Account " + account.getId() + account.getTransactions());
	}
}
