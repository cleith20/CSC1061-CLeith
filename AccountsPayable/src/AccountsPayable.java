import java.util.ArrayList;
import java.util.List;

public class AccountsPayable {
	public static void main(String[] args) {
	
		List<Employee> payableEmployees = new ArrayList<>(6);
		
		Employee e1 = new SalariedEmployee("Caitlin", "Tate", 123456789, 8000.00);
		Employee e2 = new CommissionEmployee("Katie", "Lalime", 123456789, 700000.00, 0.20);
		Employee e3 = new HourlyEmployee("Mei", "Flowers", 123456789, 22.50, 40);
		Employee e4 = new HourlyEmployee("Paris", "Francine", 123456789, 22.50, 25);
		Employee e5 = new BasePlusCommissionEmployee("Maya", "Morris", 123456789, 450000.00, 0.07, 100000);
		Employee e6 = new BasePlusCommissionEmployee("Sydney", "Keefer", 123456789, 360000.00, 0.07, 100000);
		
		// adds each employee to the payableEmployees list
		payableEmployees.add(e1);
		payableEmployees.add(e2);
		payableEmployees.add(e3);
		payableEmployees.add(e4);
		payableEmployees.add(e5);
		payableEmployees.add(e6);
		
		// traverses the payableEmployees ArrayList to print all details
		for(Employee employee : payableEmployees) {
			printEmployee(employee);
		}
		// traverses the payableEmployees ArrayList to print all details
		for(Employee employee : payableEmployees) {
			printEmployee2(employee);
		}
		// traverses the payableEmployees ArrayList to print first name, last name, and pay
		for(Employee employee : payableEmployees) {
			printPay(employee);
		}
		// traverses the payableEmployees to add 10% to basePay to any BasePlusComissionEmployee
		for(Employee employee : payableEmployees) {
			if(employee instanceof BasePlusCommissionEmployee) {
				((BasePlusCommissionEmployee) employee).setBasePay
				(((BasePlusCommissionEmployee) employee).getBasePay()*1.10);
			}
		}
		// traverses the payableEmployees ArrayList to print first name, last name, and pay
		for(Employee employee : payableEmployees) {
			printPay(employee);
		}
	}
	// methods
	// prints all employee details by calling Employee.toString()
	private static void printEmployee(Employee employee) {
		System.out.println(employee + "\n");
	}
	// prints all employee details by calling the getter for each detail
	private static void printEmployee2(Employee employee) {
		System.out.println(employee.getFirstName() + " " + employee.getLastName() 
			+ "\nPay: " + employee.getPaymentAmount() + "\nSocial Security Number: " + employee.getSsNum() + "\n");
	}
	// prints employee first name, last name, and pay
	private static void printPay(Employee employee) {
		System.out.println(employee.getFirstName() + " " + employee.getLastName() 
		+ "\nPay: " + employee.getPaymentAmount());
		System.out.println();
	}
}
