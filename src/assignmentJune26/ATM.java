package assignmentJune26;

import java.util.Scanner;

public class ATM {

	int enteredPin;
	double dailyCashLimit = 3000;
	boolean isThereMore;
	boolean isPinValid;

	Scanner sc = new Scanner(System.in);

	boolean validatePin(Customer customer) {
		for (int i = 1; i <= 3; i++) {
			isPinValid=false;
			System.out.println("Enter PIN");
			enteredPin = sc.nextInt();
			if (customer.pin == enteredPin) {
				isPinValid = true;
				break;
			} else if (i < 3) {
				System.out.println("Invalid PIN, please try again");
			} else
				System.out.println("3 invalid attempts, card blocked! Contact branch.");

		}
		return isPinValid;
	}

	void depositCash(Customer customer) {

		System.out.println("Enter the amount to be deposited");
		customer.totalFunds = customer.totalFunds + sc.nextInt();
		System.out.println("Deposit successful! Current balance= $" + customer.totalFunds);

	}

	void withdrawCash(Customer customer) {

		System.out.println("Enter the amount to be withdrawn(multiples of 10)");
		double withdrawal = sc.nextDouble();
		if (withdrawal < customer.totalFunds && withdrawal < dailyCashLimit) {
			customer.totalFunds = customer.totalFunds - withdrawal;
			System.out.println("Please collect cash. Current balance= $" + customer.totalFunds);
		} else if (withdrawal < customer.totalFunds && withdrawal > dailyCashLimit) {
			System.out.println("Daily cash limit is $3000, please choose $3000 or lower.");
		} else
			System.out.println("Insufficient balance! Current balance= $" + customer.totalFunds);
	}

	void atmProcess(Customer customer) {
		do {
			if (validatePin(customer))
				System.out.println(
						"What would you like to do?\n Select the number corresponding to the options below\n 1)Deposit cash\n 2)Withdraw cash\n 3)Balance enquiry");
			int selection = sc.nextInt();
			switch (selection) {
			case 1: {
				depositCash(customer);
			}

				break;
			case 2: {
				withdrawCash(customer);
			}
				break;
			case 3: {
				System.out.println("Available balance= $" + customer.totalFunds);
			}
				break;
			default:
				System.out.println("Invalid entry!");
				break;
			}

			System.out.println("Do you have another transaction?\nEnter 'true' or 'false'");
			isThereMore = sc.nextBoolean();

		} while (isThereMore);

	}
}
