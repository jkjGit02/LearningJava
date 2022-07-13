package assignmentGame;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Game3 {

	List<String> list;
	String line;

	public List<String> displayList(String path) {
		// List<String> list;
		try {
			list = Files.readAllLines(Paths.get(path));

		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

		return list;
	}

	public String getRandomLine() {
		Random random = new Random();
		line = list.get(random.nextInt(list.size()));
		return line;
	}
	
	public void startGame(String path) {
		displayList(path);
		getRandomLine();
		System.out.println(line);
	}

}
