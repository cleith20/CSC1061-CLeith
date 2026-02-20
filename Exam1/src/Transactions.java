import java.time.LocalDate;

public class Transactions {
	
	private LocalDate transDate = LocalDate.now();
	private char transType;
	private double amount;
	private double newBalance;
	
	public Transactions(LocalDate transDate, char transType, double amount, double newBalance) {
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
