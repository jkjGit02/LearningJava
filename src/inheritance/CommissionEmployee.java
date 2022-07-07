package inheritance;

public class CommissionEmployee extends Employee {
	double salesMade;

	public CommissionEmployee(String firstName, String lastName, long sinNumber, double salary, double salesMade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.sinNumber = sinNumber;
		this.salary = salary;
		this.salesMade = salesMade;
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		biweeklyPay = (salary + (.15 * salesMade)) / 26;
		return super.calculatePay();
	}

}
