package assignmentMay29;

import java.util.Scanner;

public class NumberOfTimes {

	public static void main(String[] args) {

int i=0;
String number="";

Scanner sc=new Scanner(System.in);
while(i>=0) {
System.out.println("Enter number");
number=sc.next();
if (number.equals("end"))
	break;
i++;
}
System.out.println("Times number entered="+i);

	}

}
