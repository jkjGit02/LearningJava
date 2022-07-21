package assignmentMission;

import java.util.Random;

public class R1 extends Rocket {

	R1() {
	}

	R1(int rockWeight, int maxCap, int cost) {
		this.rocketWeight = rockWeight;
		this.maxCapacity = maxCap;
		this.cost = cost;

	}

	Random random = new Random();

	@Override
	public boolean launch() {
		return .05 * (rocketWeight / maxCapacity) >= random.nextDouble();
	}

	@Override
	public boolean land() {
		return .01 * (rocketWeight / maxCapacity) >= random.nextDouble();
	}

}
