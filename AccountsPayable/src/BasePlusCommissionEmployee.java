
public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double basePay;
	// Constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, long ssNum, double grossSales,
			double commissionRate, double basePay) {
		super(firstName, lastName, ssNum, grossSales, commissionRate);
		this.basePay = basePay;
	}
	//Getters and setters
	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	@Override
	public double getPaymentAmount() {
		return basePay + (getCommissionRate()*getGrossSales());
	}
	@Override
	public String toString() {
		return super.toString() + "\nBase Pay + Commission = " + getPaymentAmount();
	}
	
}
