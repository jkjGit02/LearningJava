package assignmentJune7;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		// Create a calculator which takes 3 inputs from user
		// and based on those input gives you the result.

		double number1 = 0;// declaring first number as a double variable and initializing to 0
		double number2 = 0;// declaring second number as a double variable and initializing to 0
		String operation = "";// declaring the operation to be completed as a String variable and initializing
								// to null.

		Scanner sc = new Scanner(System.in);// declaring and initializing the Scanner class variable to read the input
											// data.

		System.out.println("Enter first number");// displaying the prompt to enter first number on console
		number1 = sc.nextDouble();// storing the value of input

		System.out.println("Enter operation");// displaying the prompt to enter the desired operation on console, valid
												// inputs limited to +,-,* and /
		operation = sc.next();// storing the value of input

		System.out.println("Enter second number");// displaying the prompt to enter second number on console
		number2 = sc.nextDouble();// storing the value of input

		switch (operation) {// using switch case statement to execute different mathematical operations.
		case "+": {

			System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
			break;
		}
		case "-": {
			System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
			break;
		}
		case "x": {
			System.out.println(number1 + "x" + number2 + "=" + (number1 * number2));
			break;
		}
		case "/": {
			System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
			break;
		}
		default:// statement to be executed if the operation entered is invalid
			System.out.println("Enter a valid operation");
		}
		sc.close();
	}

}
