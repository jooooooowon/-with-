package with.algithm_game.main;

import java.util.HashMap;
import java.util.Scanner;

import with.makeMap.MakeMap;
import with.play.PlayGame;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Mark, Mark> ladder = (HashMap<Mark, Mark>) MakeMap.ladder();
		HashMap<Mark, Mark> snake = (HashMap<Mark, Mark>) MakeMap.snake();
		PlayGame.game(sc, snake, ladder);
	}
}
