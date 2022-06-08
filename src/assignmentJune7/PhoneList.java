package assignmentJune7;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneList {

	public static void main(String[] args) {
		// Part 1 : Write a program which when given a phone brand name, shows all the
		// available products present in that category. Please use the below table to
		// create list of products for each category.
		// Part 2: After displaying all the available products, ask user to enter one
		// product name.
		// Ensure user enters one of the displayed names.
//		 If user enters a name which is present in list, print  “product selected is : name of product “ 
//		 otherwise display an error message – “Please select a product from the list”
//
//		Samsung	     Google	                 Apple
//		S20	      Google Pixel 6	       Iphone12
//		S21	     Google Pixel 6 Pro 	  Iphone 12 mini
//		Flip3	  Google Pixel Pro	       Iphone 11
//		Fold3	   Google  Pixel 5	        Iphone 11

		String brandName = "";
		String productName = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brand name");
		brandName = sc.next();

		String[] samsung = new String[4];
		samsung[0] = "S20";
		samsung[1] = "S21";
		samsung[2] = "Flip3";
		samsung[3] = "SFold3";

		String[] google = new String[4];
		google[0] = "Google Pixel 6";
		google[1] = "Google Pixel 6 Pro";
		google[2] = "Google Pixel Pro";
		google[3] = "Google  Pixel 5";

		String[] apple = new String[4];
		apple[0] = "Iphone12";
		apple[1] = "Iphone 12 mini";
		apple[2] = "Iphone 11";
		apple[3] = "Iphone 11 mini";

		switch (brandName) {
		case "Samsung":
			System.out.println(Arrays.toString(samsung));
			
			System.out.println("Enter a product name");
			productName = sc.next();
			
			switch (productName) {
			case "S20":
				System.out.println("product selected is : S20");
				break;
			case "S21":
				System.out.println("product selected is : S21");
				break;
			case "Flip3":
				System.out.println("product selected is : Flip3");
				break;
			case "SFold3":
				System.out.println("product selected is : SFold3");
				break;
			default:
				System.out.println("Please select a product from the list");
			}
			break;
		
		case "Google":
			System.out.println(Arrays.toString(google));
			
			System.out.println("Enter a product name");
			productName = sc.next();
			
			switch (productName) {
			case "Google Pixel 6":
				System.out.println("product selected is : Google Pixel 6");
				break;
			case "Google Pixel 6 Pro":
				System.out.println("product selected is : Google Pixel 6 Pro");
				break;
			case "Google Pixel Pro":
				System.out.println("product selected is : Google Pixel Pro");
				break;
			case "Google  Pixel 5":
				System.out.println("product selected is : Google  Pixel 5");
				break;
			default:
				System.out.println("Please select a product from the list");
			}
			break;
		
		case "Apple":
			System.out.println(Arrays.toString(apple));
			
			System.out.println("Enter a product name");
			productName = sc.next();
			
			switch (productName) {
			case "Iphone12":
				System.out.println("product selected is : Iphone12");
				break;
			case "Iphone 12 mini":
				System.out.println("product selected is : Iphone 12 mini");
				break;
			case "Iphone 11":
				System.out.println("product selected is : Iphone 11");
				break;
			case "Iphone 11 mini":
				System.out.println("product selected is : Iphone 11 mini");
				break;
			default:
				System.out.println("Please select a product from the list");
			}
			break;
		}

	}

}
