package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employee = new Employee(89795);

		System.out.println("Sin num :" + employee.getSinNumber());

		CRA[] cra = new CRA[4];
		cra[0] = new CRA(11111);
		cra[1] = new CRA(22222);
		cra[2] = new CRA(33333);
		cra[3] = new CRA(44444);

		employee.setSinNumber(23456, cra[0], 6666);

		System.out.println("Sin num :" + employee.getSinNumber());

		employee.setSinNumber(342432, cra[1], 1234);

		System.out.println("Sin num :" + employee.getSinNumber());

		// only CRA can change the SIN Number

		employee.setSinNumber(23456, cra[2], 1234);

		System.out.println("Sin num :" + employee.getSinNumber());

	}

}