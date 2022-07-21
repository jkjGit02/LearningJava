package assignmentMission;

import assignmentMission.Simulation;

public class MissionToMoon {

	public static void main(String[] args) {
		Simulation sim = new Simulation();
		System.out.println(sim.loadItems().size());
		System.out.println(sim.loadItems().toString());

		R1 arrow = new R1(10000, 18000, 100);
		sim.loadU1(sim.loadItems(), arrow);
	}

}
