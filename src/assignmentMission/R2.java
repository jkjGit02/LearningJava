package assignmentMission;

import java.util.Random;

public class R2 extends Rocket {

	R2() {
	}

	R2(int rockWeight, int maxCap, int cost) {
		this.rocketWeight = rockWeight;
		this.maxCapacity = maxCap;
		this.cost = cost;

	}

	Random random = new Random();

	@Override
	public boolean launch() {
		return .04 * (rocketWeight / maxCapacity) >= random.nextDouble();
	}

	@Override
	public boolean land() {
		return .08 * (rocketWeight / maxCapacity) >= random.nextDouble();
	}

}
