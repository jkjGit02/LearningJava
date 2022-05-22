package comparisonOperators;

public class MobileInternetSpeed {

	public static void main(String[] args) {
		
		double speedThrottleDataLimit= 20480;
				double usedData=24380;
				boolean isDataOverLimit= usedData>speedThrottleDataLimit;
				
				int throttledSpeed=256;
				int actualSpeed=1024;
				int currentSpeed=0;
				
				if(usedData<speedThrottleDataLimit) {
				//if(isDataOverLimit=false) {
					currentSpeed=actualSpeed;
					System.out.println("Downloading at max speed");
				}else {
					currentSpeed=throttledSpeed;
					System.out.println("Downloading at throttled speed");
				}

	}

}
