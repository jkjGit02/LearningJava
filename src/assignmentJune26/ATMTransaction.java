package assignmentJune26;

public class ATMTransaction {

	public static void main(String[] args) {

		Customer customer1 = new Customer("Liam Neeson", 123456789, 4175.62, 2255);

		ATM atmMalvern = new ATM();

		atmMalvern.atmProcess(customer1);
	}

}
