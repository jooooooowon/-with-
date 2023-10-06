package with.makeMap;

import java.util.HashMap;
import java.util.Map;

import with.algithm_game.main.Mark;

public class MakeMap {
	static public int[][] map() {
		int[][] result = new int[10][10];
		return result;
	}

	static public Map<Mark, Mark> snake() {
		HashMap<Mark, Mark> result = new HashMap<>();
		return result;
	}

	static public Map<Mark, Mark> ladder() {
		HashMap<Mark, Mark> result = new HashMap<>();
		return result;
	}
}
