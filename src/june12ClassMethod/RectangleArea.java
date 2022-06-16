package june12ClassMethod;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Rectangle rectangle1 = new Rectangle();

		System.out.println("Enter length of first rectangle");
		rectangle1.length = sc.nextDouble();
		System.out.println("Enter breadth of first rectangle");
		rectangle1.breadth = sc.nextDouble();

		System.out.println("Area of first rectangle=" + rectangle1.area());

		Rectangle rectangle2 = new Rectangle();

		System.out.println("\nEnter length of second rectangle");
		rectangle2.length = sc.nextDouble();
		System.out.println("Enter breadth of second rectangle");
		rectangle2.breadth = sc.nextDouble();

		System.out.println("Area of second rectangle=" + rectangle2.area());
	}

}
