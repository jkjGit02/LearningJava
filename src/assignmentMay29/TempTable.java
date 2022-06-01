package assignmentMay29;

import java.util.Scanner;

public class TempTable {

	public static void main(String[] args) {
		double celsius = 0;
		double fahrenheit = 0;
		double value = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value to be converted");
		value = sc.nextDouble();
if (value==0){
		System.out.println("Celsius      Fahrenheit");
		celsius=-20;
			while (celsius <= 25) {

			fahrenheit = (celsius * 1.8) + 32;
			System.out.println(celsius + "         " + fahrenheit);
			celsius += 5;
			}

		}
	}

}
