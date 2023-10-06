package with.algithm_game.main;

public class Mark {
	public int y;
	public int x;

	public Mark() {
		this.y = 1;
		this.x = 1;
	}

	public Mark(int y, int x) {
		this.y = y;
		this.x = x;
	}

	// 현재 마크에 있는 사람이 winner인 지 확인하는 메서드
	public boolean isWinner() {
		if (y >= 10 || (y == 10 && x == 10)) {
			return true;
		}
		return false;
	}

	// 현재 사람이 마크와 같은 지 확인하는 메서드.
	public boolean mark(int y, int x) {
		if (this.y == y && this.x == x) {
			return true;
		}
		return false;
	}

	// equals override
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Mark) {
			Mark temp = (Mark) obj;
			if (this.y == temp.y && this.x == temp.x) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Mark [y=" + y + ", x=" + x + "]";
	}

}
