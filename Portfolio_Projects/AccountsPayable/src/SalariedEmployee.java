
public class SalariedEmployee extends Employee{
	private double wkSalary;
	// Constructor
	public SalariedEmployee(String firstName, String lastName, long ssNum, double weeklySalary) {
		super(firstName, lastName, ssNum);
		this.wkSalary = weeklySalary;
	}
	// Getters and setters
	public double getWeeklySalary() {
		return wkSalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.wkSalary = weeklySalary;
	}
	@Override
	public double getPaymentAmount() {
		return wkSalary;
	}
	@Override
	public String toString() {
		return super.toString() + "\nWeekly Salary = " + getPaymentAmount();
	}
}
