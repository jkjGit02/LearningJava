package assignmentJune26;

public class Customer {

	String nameOfAccHolder;
	//String typeOfAcc;
	int bankAccNum;
	double totalFunds;
	int pin;

	Customer() {
	}

	Customer(String nameOfAccHolder, int bankAccNum, double totalFunds, int pin) {
		this.nameOfAccHolder = nameOfAccHolder;
		//this.typeOfAcc = typeOfAcc;
		this.bankAccNum = bankAccNum;
		this.totalFunds = totalFunds;
		this.pin = pin;
	}

}
