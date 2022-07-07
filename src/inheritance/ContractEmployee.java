package inheritance;

public class ContractEmployee extends Employee {
	double hoursWorked;

	public ContractEmployee(String firstName, String lastName, long sinNumber, double salary, double hoursWorked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		if (hoursWorked > 2080) {
			biweeklyPay = ((salary * 2080) + ((salary * 1.5) * (hoursWorked - 2080))) / 26;
		} else
			biweeklyPay = (salary * hoursWorked) / 26;
		return super.calculatePay();
	}

}
