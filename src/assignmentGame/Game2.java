package assignmentGame;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Game2 {
	int index = 0;

	// converting file to a list

	public String displayRandomLine(String path) {
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path));

		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

		// Picking a random line out of list

		Random random = new Random();
		String randomLine = lines.get(random.nextInt(lines.size()));
		return randomLine;
	}

	// masking the randomly picked line

	public String maskLine(String randomLine) {

		StringBuilder sb = new StringBuilder(randomLine.length());
		String newMaskedLine = null;
		for (int i = 0; i < randomLine.length(); i++) {
			newMaskedLine = (sb.append('_').toString()).replace("", " ");

		}
		return newMaskedLine;
	}

	public void fillBlanks(String randomLine, String newMaskedLine) {
		Scanner sc = new Scanner(System.in);
		StringBuilder enteredLine = new StringBuilder(newMaskedLine);
		for (int i = 0; i < 10; i++) {

			System.out.println("You are guessing:" + enteredLine + "\nYou have guessed (" + i
					+ ") wrong letters\nGuess a letter:");
			// int index = 0;
			char x = sc.next().charAt(0);
			index = randomLine.indexOf(x, index);

			if (index != -1) {
				if (index == 0) {
					enteredLine.setCharAt(index + 1, x);
					//System.out.println(enteredLine);
				}
				while (index != -1 && index < randomLine.length()) {

					if (index != -1 && index != 0) {
						enteredLine.setCharAt(2 * index + 1, x);
						//System.out.println(enteredLine);
					}
					index = randomLine.indexOf(x, index + 1);

				}
				i--;
			}
		}
		System.out.println("You have exhausted number of tries");

	}
}
