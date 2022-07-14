package assignmentGame;

import java.io.File;

public class GuessTheMovie {

	public static void main(String[] args) {

		// Game game = new Game();

		// game.readFile();

		// Game1 game1 = new Game1();

		Game2 game2 = new Game2();

		String path = new File("C:\\Users\\Jithin\\Desktop\\Software\\Guess the movie\\movies.txt").getAbsolutePath();
		String randomLine = game2.displayRandomLine(path);
		String newMaskedLine = game2.maskLine(randomLine);
		game2.fillBlanks(randomLine, newMaskedLine);

//		File movies = new File("C:\\Users\\Jithin\\Desktop\\Software\\Guess the movie\\movies.txt");
//		String path = movies.getAbsolutePath();
//		game.startGame(path);
	}

}
