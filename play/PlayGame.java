package with.play;

import java.util.HashMap;
import java.util.Scanner;

public class PlayGame {
	static public void game(Scanner sc, HashMap<Integer, Integer> snake, HashMap<Integer, Integer> ladder) {
		User user1 = new User();
		User user2 = new User();
		int who = 0;
		while (user1.isWinner() || user2.isWinner()) {
			map(user1, user2);
			showSnakeAndLadder(snake, ladder);
		}
		if (user1.isWinner()) {
			System.out.println("user1 승리!!");
		} else if (user2.isWinner()) {
			System.out.println("user2 승리!!");
		}

	}

	private static void showSnakeAndLadder(HashMap<Integer, Integer> snake, HashMap<Integer, Integer> ladder) {

	}

	private static void map(User user1, User user2) {
		StringBuilder sb = new StringBuilder();
		int location = 1;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				// user1 은 x로
				if (user1.mark(i, j)) {
					sb.append("x");
				}
				// user2 은 o로
				else if (user2.mark(i, j)) {
					sb.append("o");
				}
				// 나머지는 그냥 숫자
				else {
					sb.append(location++);
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

	static class User {
		int y;
		int x;

		public User() {
			this.y = 1;
			this.x = 1;
		}

		boolean isWinner() {
			if (y == 9 && x == 9) {
				return true;
			}
			return false;
		}

		boolean mark(int y, int x) {
			if (this.y == y && this.x == x) {
				return true;
			}
			return false;
		}
	}
}
