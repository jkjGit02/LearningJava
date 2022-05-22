package comparisonOperators;

public class TankExample {

	public static void main(String[] args) {

		int maxTankVolume = 100;
		int currentVolume = 80;
		int bucketCapacity = 10;

		while (currentVolume < (maxTankVolume - bucketCapacity)) {

			//if (currentVolume < 90)
				//break;
			currentVolume = currentVolume + bucketCapacity;

		}
		System.out.println(currentVolume);
	}
}
