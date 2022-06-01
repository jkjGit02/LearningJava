package assignmentMay29;

import java.util.Scanner;

public class TempConverter {

	public static void main(String[] args) {
		// 
		double celsius=0;
		double fahrenheit=0;
		double value=0;
		String unit="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to be converted");
		value=sc.nextDouble();
		System.out.println("Enter unit to be converted");
		unit=sc.next();
		
		if(unit.equals("F")){
			celsius=(value-32)*.555;
			System.out.println("Temperature="+celsius+"°C");
			}else
		if(unit.equals("C")) {
			fahrenheit=(value*1.8)+32;
			System.out.println("Temperature="+fahrenheit+"°F");
		}else {
			System.out.println("Invalid entry!");
		}

	}

}
