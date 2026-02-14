
public class SalariedEmployee extends Employee{
	private double weeklySalary;
	// Constructor
	public SalariedEmployee(String firstName, String lastName, long ssNum, double weeklySalary) {
		super(firstName, lastName, ssNum);
		this.weeklySalary = weeklySalary;
	}
	// Getters and setters
	public double getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	@Override
	public double getPaymentAmount() {
		return weeklySalary;
	}
	@Override
	public String toString() {
		return super.toString() + "\nWeekly Salary = " + getPaymentAmount();
	}
}
