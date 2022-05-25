package assignmentMay22;

public class CovidNumberRestriction {

	public static void main(String[] args) {
		int maxCount = 50;
		int currentCount = 0;
		int enterCount = 1;

		while (currentCount < maxCount) {

			if (currentCount == maxCount)
				break;

			if ((maxCount - currentCount) < enterCount) {
				System.out.println("only " + (maxCount - currentCount) + " people can enter");
				currentCount = currentCount + (maxCount - currentCount);

			} else {
				currentCount = currentCount + enterCount;
			}
			System.out.println("Number of people inside shop=" + currentCount);
		}
		System.out.println("Maximum capacity reached");
	}

}
