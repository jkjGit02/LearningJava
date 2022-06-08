package assignmentJune7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First method

		int[] numbers1 = new int[5];

		numbers1[0] = 1;
		numbers1[1] = 2;
		numbers1[2] = 3;
		numbers1[3] = 4;
		numbers1[4] = 5;

		System.out.println(Arrays.toString(numbers1));
		
		//Second method

		int[] numbers2 = new int[5];
		for (int i = 0; i < 5; i++) {
			numbers2[i] = i + 1;
		}
		System.out.println(Arrays.toString(numbers2));

		int[] numbers3 = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number");
			numbers3[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(numbers3));
	}

}
