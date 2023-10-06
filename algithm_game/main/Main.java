package with.algithm_game.main;

import java.util.HashMap;
import java.util.Scanner;

import with.makeMap.MakeMap;
import with.play.PlayGame;

public class Main {
	public Main() {
		Scanner sc = new Scanner(System.in);
		int[][] map = MakeMap.map();
		HashMap<Integer, Integer> ladder = (HashMap<Integer, Integer>) MakeMap.ladder();
		HashMap<Integer, Integer> snake = (HashMap<Integer, Integer>) MakeMap.snake();
		PlayGame.game(sc, map, snake, ladder);
	}
}
