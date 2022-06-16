package june12ClassMethod;

public class Person {
	double height;
	double weight;

	void checkEligibility() {
		if (height >= 90 && height <= 200 && weight >= 15 && weight <= 200) {
			System.out.println("Acess granted");
		} else
			System.out.println("Access denied");

	}
}
