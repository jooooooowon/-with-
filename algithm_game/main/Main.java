package with.algithm_game.main;

import java.util.HashMap;
import java.util.Scanner;

import with.makeMap.MakeMap;
import with.play.PlayGame;

public class Main {
	public Main() {
		Scanner sc = new Scanner(System.in);
		int[][] map = MakeMap.map();
		HashMap<Integer, Integer> snakeAndLadder = (HashMap<Integer, Integer>) MakeMap.snakeAndLadder();
		PlayGame.game(sc,map,snakeAndLadder);
	}
}
