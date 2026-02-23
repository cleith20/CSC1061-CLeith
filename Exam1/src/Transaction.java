import java.time.LocalDate;

public class Transaction {
	
	private LocalDate transDate = LocalDate.now();
	private char transType;
	private double amount;
	private double newBalance;
	
	public Transaction(LocalDate transDate, char transType, double amount, double newBalance) {
		this.transDate = transDate;
		this.transType = transType;
		this.amount = amount;
		this.newBalance = newBalance;
	}

	@Override
	public String toString() {
		return "\nDate = " + transDate + ", Type = " + transType + ", Amount = " + amount
				+ ", New Balance = " + newBalance;
	}
	
	
}
