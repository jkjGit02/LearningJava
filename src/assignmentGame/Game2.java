package assignmentGame;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game2 {

	public String displayRandomLine(String path) {
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path));

		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		Random random = new Random();
		String randomLine = lines.get(random.nextInt(lines.size()));
		return randomLine;
	}
	// System.out.println(randomLine);

	public String maskLine(String randomLine) {

		StringBuilder sb = new StringBuilder(randomLine.length());
		String newMaskedLine = null;
		for (int i = 0; i < randomLine.length(); i++) {
			newMaskedLine = sb.append('_').toString();

		}
		return newMaskedLine;
	}

	public void fillBlanks(String randomLine, String newMaskedLine) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= 10; i++) {
			System.out.println("You are guessing:" + (newMaskedLine.replace("", " ")) + "\nYou have guessed (" + i
					+ ") wrong letters\nGuess a letter:");
			int index = 0;
			index = randomLine.indexOf(sc.next());
			System.out.println(index);
		}

	}
}
