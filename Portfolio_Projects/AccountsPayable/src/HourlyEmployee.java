
public class HourlyEmployee extends Employee{
	private double hourlyWage;
	private double hours;
	// Constructor
	public HourlyEmployee(String firstName, String lastName, long ssNum, double hourlyWage, double hours) {
		super(firstName, lastName, ssNum);
		this.hourlyWage = hourlyWage;
		this.hours = hours;
	}
	//Getters and setters
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}
	@Override
	public double getPaymentAmount() {
		return (hourlyWage*hours);
	}
	@Override
	public String toString() {
		return super.toString() + "\nHourly Pay = " + getPaymentAmount();
	}
}
