package assignmentGame;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class Game1 {

	public static String getRandomLine() {
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get("C:\\Users\\Jithin\\Desktop\\Software\\Guess the movie\\movies.txt"));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}

		Random random = new Random();
		return lines.get(random.nextInt(lines.size()));
	}
}

//public void readFile() {
//
//		try {
//			File obj = new File("C:\\Users\\Jithin\\Desktop\\Software\\Guess the movie\\movies.txt");
//			Scanner sc = new Scanner(obj);
//			while (sc.hasNextLine()) {
//				List<String> data = sc.nextLine();
//				System.out.println(data);
//			}
//			sc.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}