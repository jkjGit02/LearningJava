package june12ClassMethod;

public class AmusementRideEntry {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.height = 89;
		person1.weight = 70;
		
		person1.checkEligibility();
		
		Person person2= new Person();
		person2.height=91;
		person2.weight=16;
		
		person2.checkEligibility();
		
		Person person3=new Person();
		person3.height=200;
		person3.weight=95;
		
		person3.checkEligibility();

	}
}
