package assignments;

public class WeeklySalary {

	public static void main(String[] args) {

		int hourlyRate = 14;
		int dailyHours = 8;
		int daysPerWeek = 5;

		int weeklyPay = hourlyRate * dailyHours * daysPerWeek;

		System.out.println("Weekly pay including tax=" + weeklyPay);

		double weeklyTakeHomeSalary =( weeklyPay * 90) / 100;

		System.out.println("Weekly take home salary=" + weeklyTakeHomeSalary);

	}

}
