package with.taja;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long start = System.currentTimeMillis();
		String[] arr = { "때론 기회를 놓치는 것이 기회일 수 있다.", "영원히 살 것처럼 꿈꾸고 오늘 죽을 것처럼 살아라",
				"우리가 꿈꿀 수 있다면, 이룰수도 있습니다. 지금 내가 이룬 이 모든 것이 지난 날의 나의 꿈과 쥐 한마리로 시작했다는 사실을 잊지 마십시오.",
				"만족할 줄 아는 사람은 진정한 부자이고, 탐욕스러운 사람은 진실로 가난한 사람이다.", "미래를 계획하는 일도 필요하지만 가장 중요한 것은 오늘을 후회없이 사는 겁니다.",
				"인생에서 원하는 것을 얻기 위한 첫 번째 단계는 내가 무엇을 원하는 지 결정하는 것이다.", "\"지금이 최악\"이라고 말 할 힘이 있다면 아직은 최악이 아니다.",
				"긴 인생은 충분히 좋지 않을 수도 있다. 그러나 좋은 인생은 충분히 길다.", "인생은 자전거를 타는 것과 같다. 계속 페달을 밟는 한 넘어질 염려는 없다.",
				"당신을 가로막는 장애때문에 포기할 것인가, 반대로 그 장애를 넘어서기 위해 노력할 것인가는 당신의 선택할 문제이다.",
				"나 자신에게 더욱 집중하라. 언제나 나를 1순위에 두어라. 다른 이의 삶에 한 눈팔며 살기엔 내 인생이 너무 소중하다.",
				"남의 말에 흔들리지 않는 자신감을 가진 당당한 여자가 되어라.", "나는 신발이 없음을 한탄했는데 거리에서 발이 없는 사람을 만났다." };

		for (int i = 0; i < 5; i++) {
			String str = "";
			int idx = (int) (Math.random() * arr.length);
			System.out.println((i + 1) + "번째 문제 ");
			System.out.println(arr[idx]);
			while (!str.equals(arr[idx])) {
				str = br.readLine();
				if (!str.equals(arr[idx])) {
					System.out.println("틀렸습니다. 다시 시도하세요.");
				}
			}
			System.out.println();
		}
		long end = System.currentTimeMillis();
		double result = (end - start) / 1000;
		System.out.println("종료");
		System.out.println(result + "초가 걸렸습니다.");
	}
}
