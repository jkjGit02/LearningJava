package june12ClassMethod;

public class Employee {

	String firstName;
	String lastName;
	double hourlyRate;
	double weeklySalary;

	double calculateWeeklySalary(double hours) {
		weeklySalary = hourlyRate * hours;
		return weeklySalary;
	}
}
