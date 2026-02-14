
public class CommissionEmployee extends Employee {
	private double grossSales;
	private double commissionRate;
	// Constructor
	public CommissionEmployee(String firstName, String lastName, long ssNum, double grossSales, double commissionRate) {
		super(firstName, lastName, ssNum);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	//Getters and setters
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getCommissionRate() {
		return commissionRate;
	}
	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	@Override
	public double getPaymentAmount() {
		return (grossSales*commissionRate);
	}
	@Override
	public String toString() {
		return super.toString() + "\nCommission Pay = " + getPaymentAmount();
	}
}
