package assignmentMission;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Simulation {

	public ArrayList<String> loadItems() {
		List<String> lines = null;
		try {
			lines = Files.readAllLines(Paths.get("C:\\Users\\Jithin\\Desktop\\Software\\Rocket Project\\phase-1.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ArrayList<String> itemList = new ArrayList<String>(lines);
		return itemList;
	}

	public ArrayList<R1> loadU1(ArrayList itemList, R1 arrow) {
		int counter = 1;
		int loadedWeight = 0;
		for (int i = 0; i < itemList.size(); i++) {
			loadedWeight = loadedWeight + Integer
					.valueOf(itemList.get(i).toString().substring(itemList.get(i).toString().indexOf("=") + 1));
			if (loadedWeight >= (arrow.maxCapacity - arrow.rocketWeight)) {
				counter++;
				loadedWeight = loadedWeight - (arrow.maxCapacity - arrow.rocketWeight);
			}

//			if (i == (itemList.size() - 1) && loadedWeight < (arrow.maxCapacity - arrow.rocketWeight)) {
//				counter++;
//			}
		}
		ArrayList<R1> arrowList = new ArrayList(counter);

		return arrowList;
	}

}
