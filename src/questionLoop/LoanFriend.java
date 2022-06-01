package questionLoop;

import java.util.Scanner;

public class LoanFriend {

	public static void main(String[] args) {

		int numberOfMonths = 0;// variable to keep count of months
		int monthToBePaid = 0;// dynamic variable to break the loop
		double remainingAmount = 20000;// initial value

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of month to see the remaining amount after that month");
		monthToBePaid = sc.nextInt();

		while (remainingAmount > 0) {

			remainingAmount = .9 * remainingAmount;
			numberOfMonths = numberOfMonths += 1;// incrementing number of months by 1

			if (numberOfMonths == monthToBePaid - 1)
				System.out.println("Scheduled payment for entered month=" + .1 * remainingAmount);

			if (numberOfMonths == monthToBePaid)
				break;// breaks the loop at the entered month number

		}
		System.out.println("Reamaining Amount=" + remainingAmount);

	}

}
