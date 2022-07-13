package assignmentGame;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Game {
	
	public String getRandomLine(String path) {
		List<String> list;
		try {
			list=Files.readAllLines(Paths.get(path));
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
		Random random=new Random();
		String randomLine=list.get(random.nextInt(list.size()));
		return randomLine;
	}

}
