package comparisonOperators;

public class RemitlyTransactions {

	public static void main(String[] args) {

		double dailyTranscationOne = 200;
		double dailyTransactionTwo = 700;

		int dailyTransactionLimit = 3;
		int numberOfTransactions = 4;

		double totalAmount = dailyTranscationOne + dailyTransactionTwo;
		double dailyAmount = 1000;

		boolean isOverDailyAmount = totalAmount > dailyAmount;

		if (isOverDailyAmount) {

			System.out.println("Daily amount has gone over $1000");

		} else {

			System.out.println("Daily amount under limit");
		}

		boolean isNumberOfTransactionsOverLimit = numberOfTransactions > dailyTransactionLimit;

		if (isNumberOfTransactionsOverLimit) {

			// if(numberOfTransactions<dailyTransactionLimit) {

			System.out.println("Over daily transaction limit");

		} else {

			System.out.println("Under daily transaction limit");
		}

		boolean isThereATransactionFee = isOverDailyAmount || isNumberOfTransactionsOverLimit;

		if (isThereATransactionFee) {

			System.out.println("Transaction fee=$10");

		} else {

			System.out.println("No transaction fee");
		}

	}

}
