package with.play;

import java.util.HashMap;
import java.util.Scanner;

import with.algithm_game.main.Mark;

public class PlayGame {
	static public void game(Scanner sc, HashMap<Mark, Mark> snake, HashMap<Mark, Mark> ladder) {
		Mark user1 = new Mark();
		Mark user2 = new Mark();
		System.out.println("game?");
		// 0은 user1, 1은 user2
		int who = 0;
		while (!user1.isWinner() && !user2.isWinner()) {
			map(user1, user2);
			showSnakeAndLadder(snake, ladder);
			System.out.println("아무 버튼이나 눌러 주사위를 굴리세요. (0을 누르면 게임 종료)");
			String str = sc.next();
			if (str.equals("0")) {
				System.out.println("게임 종료.");
				System.exit(0);
			}
			int dice = (int) (Math.random() * 6 + 1);
			System.out.println("주사위 숫자 : " + dice);
			if (who % 2 == 0) {
				move(user1, dice, snake, ladder);
			}
			if (who % 2 == 1) {
				move(user2, dice, snake, ladder);
			}
			who++;
		}
		if (user1.isWinner()) {
			System.out.println("user1 승리!!");
		} else if (user2.isWinner()) {
			System.out.println("user2 승리!!");
		}

	}

	private static void move(Mark user, int dice, HashMap<Mark, Mark> snake, HashMap<Mark, Mark> ladder) {
		user.x += dice;
		if (user.x > 10) {
			user.y++;
			user.x -= 10;
		}
		boolean tf = true;
		while (tf) {
			tf = false;
			// 사다리의 좌표와 같다면 이동
			for (Mark key : ladder.keySet()) {
				if (user.equals(key)) {
					Mark value = ladder.get(key);
					key.y = value.y;
					key.x = value.x;
					// 또 이동 가능할 수 있으므로 ture
					tf = true;
				}
			}
			// 뱀의 좌표와 같다면 이동
			for (Mark key : snake.keySet()) {
				if (user.equals(key)) {
					Mark value = ladder.get(key);
					key.y = value.y;
					key.x = value.x;
					// 또 이동 가능할 수 있으므로 ture
					tf = true;
				}
			}
		}
	}

	private static void showSnakeAndLadder(HashMap<Mark, Mark> snake, HashMap<Mark, Mark> ladder) {
		System.out.println("사다리");
		for (Mark key : ladder.keySet()) {
			System.out.println(key + " : -> " + ladder.get(key));
		}
		System.out.println("뱀");
		for (Mark key : snake.keySet()) {
			System.out.println(key + " : -> " + snake.get(key));
		}
	}

	private static void map(Mark user1, Mark user2) {
		StringBuilder sb = new StringBuilder();
		int location = 1;
		System.out.println("user1 : " + user1);
		System.out.println("user2 : " + user2);
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				boolean tf = true;
				// user1 은 x로
				if (user1.mark(i, j)) {
					sb.append("x");
					tf = false;
				}
				// user2 은 o로
				if (user2.mark(i, j)) {
					sb.append("o");
					tf = false;
				}
				// 나머지는 그냥 숫자
				if (tf) {
					sb.append(location++);
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}

}
