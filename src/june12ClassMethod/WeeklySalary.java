package june12ClassMethod;

import java.util.Scanner;

public class WeeklySalary {

	public static void main(String[] args) {
		Employee employee1 = new Employee();
		employee1.firstName = "George";
		employee1.lastName = "Mathew";
		employee1.hourlyRate = 24.48;

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Enter number of hours " + employee1.firstName + " " + employee1.lastName + " works in a week");

		double hours1 = sc.nextDouble();

		System.out.println("Weekly salary of " + employee1.firstName + " " + employee1.lastName + "=$"
				+ employee1.calculateWeeklySalary(hours1));

		Employee employee2 = new Employee();
		employee2.firstName = "Ralph";
		employee2.lastName = "Martin";
		employee2.hourlyRate = 21.38;

		System.out.println(
				"\nEnter number of hours " + employee2.firstName + " " + employee2.lastName + " works in a week");
		double hours2 = sc.nextDouble();
		System.out.println("Weekly salary of " + employee2.firstName + " " + employee1.lastName + "=$"
				+ employee2.calculateWeeklySalary(hours2));

		sc.close();
	}

}
