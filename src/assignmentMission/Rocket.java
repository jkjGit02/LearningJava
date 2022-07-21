package assignmentMission;

public class Rocket implements Spaceship {

	int rocketWeight;
	int maxCapacity;
	int cost;

	public boolean launch() {
		boolean didRocketLaunch = true;
		return didRocketLaunch;
	}

	public boolean land() {
		boolean didRocketLand = true;
		return didRocketLand;
	}

	public int carry(Item item, Rocket rocket) {
		return rocket.rocketWeight + item.weight;
	}

	public boolean canCarry(Item item, Rocket rocket) {
		if (rocket.rocketWeight > rocket.maxCapacity) {
			return false;
		} else
			return true;
	}

}
