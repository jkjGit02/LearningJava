package inheritance;

public class PermanentEmployee extends Employee {

	public PermanentEmployee() {
	}

	public PermanentEmployee(String firstName, String lastName, long sinNumber, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
		this.salary = salary;

	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		biweeklyPay = salary / 26;
		return super.calculatePay();
	}

}
