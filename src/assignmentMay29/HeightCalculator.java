package assignmentMay29;

import java.util.Scanner;

public class HeightCalculator {

	public static void main(String[] args) {
//		1.	Write a program with which you can convert a human height 
//		given in feet and inches to centimeters. 
//		The program should ask the user to type in his or her height in two parts: 
//		first the height in feet and then the inches part for the height. 
//		(A person can say that his or her height is, for example, 5 feet and
//				9 inches. That would be 30.48 * 5 + 2.54 * 9 centimeters.

		int feetPartOfHeight=0;
		int inchPartOfHeight=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter feet part of height");
		feetPartOfHeight=sc.nextInt();
		System.out.println("Enter inch part of height");
		inchPartOfHeight=sc.nextInt();
		
		double heightInCm=30.48*feetPartOfHeight+2.54*inchPartOfHeight;
		System.out.println("Height in Centimeters="+heightInCm);
		
	}

}
