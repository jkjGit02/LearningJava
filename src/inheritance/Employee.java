package inheritance;

import java.text.DecimalFormat;

public class Employee {
	public String firstName;
	public String lastName;
	public long sinNumber;
	public double salary;
	public double biweeklyPay;

	DecimalFormat df = new DecimalFormat("#.##");

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getSinNumber() {
		return sinNumber;
	}

	public void setSinNumber(long sinNumber) {
		this.sinNumber = sinNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else
			System.out.println("Salary cannot be negative!");
	}

	public double calculatePay() {
		return biweeklyPay;
	}
}
