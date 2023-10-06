package with.makeMap;

import java.util.HashMap;
import java.util.Map;

import with.algithm_game.main.Mark;

public class MakeMap {

	static public Map<Mark, Mark> snake() {
		HashMap<Mark, Mark> result = new HashMap<>();
		for (int i = 0; i < 4; i++) {
			while (true) {
				int fromY = (int) (Math.random() * 10 + 1);
				int fromX = (int) (Math.random() * 10 + 1);

				int toY = (int) (Math.random() * 10 + 1);
				int toX = (int) (Math.random() * 10 + 1);
				if (fromY > toY || (fromY == toY && fromX > toX)) {
					result.put(new Mark(fromY, fromX), new Mark(toY, toX));
					break;
				}
			}
		}
		return result;
	}

	static public Map<Mark, Mark> ladder() {
		HashMap<Mark, Mark> result = new HashMap<>();
		for (int i = 0; i < 4; i++) {
			while (true) {
				int fromY = (int) (Math.random() * 10 + 1);
				int fromX = (int) (Math.random() * 10 + 1);

				int toY = (int) (Math.random() * 10 + 1);
				int toX = (int) (Math.random() * 10 + 1);
				if (fromY < toY || (fromY == toY && fromX < toX)) {
					result.put(new Mark(fromY, fromX), new Mark(toY, toX));
					break;
				}
			}
		}
		return result;
	}
}
