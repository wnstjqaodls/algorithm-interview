package programmers.lessons2;

public class P48_240129_NumberOfDice {

	public static void main(String[] args) {

		int[] param = { 10, 8, 6 };
		int param2 = 3;
		int result;

		result = solution(param, param2);
		System.out.println(result);

	}

	/*
	 * 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 상자의
	 * 가로,세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 상자에 들어갈 수 있는
	 * 주사위의최대 개수를 return 하도록 solution 함수를 완성해주세요.
	 *
	 ** 제한사항 box의 길이는 3입니다. box[0] = 상자의 가로 길이 box[1] = 상자의 세로 길이 box[2] = 상자의 높이
	 * 길이 1 ≤ box의 원소 ≤ 100 1 ≤ n ≤ 50 n ≤ box의 원소 주사위는 상자와 평행하게 넣습니다.
	 * 
	 * box n result [1, 1, 1] 1 1 [10, 8, 6] 3 12
	 * 
	 * 입출력 예 #1
	 * 
	 * 상자의 크기가 가로 1, 세로 1, 높이 1이므로 모서리의 길이가 1인 주사위는 1개 들어갈 수 있습니다. 입출력 예 #2
	 * 
	 * 상자의 크기가 가로 10, 세로 8, 높이 6이므로 모서리의 길이가 3인 주사위는 12개 들어갈 수 있습니다.
	 ***
	 * 
	 * 
	 */
	public static int solution(int[] box, int n) {
		int answer = 0;

		// 내풀이
		// 직육면체의 상자 계산하는 공식이 필요함. 가X세X높 = 부피 , 상자의 모서리 길이로 가세높 추출가능?
		// 어떤 수학 공식으로 답을 도출해야할까??

		// 직육면체의 겉넓이 구한후 , 주사위의 겉넓이로 나누고, 나머지는 버리면되지않을까?
		int x = box[0];
		int y = box[1];
		int z = box[2];

/*		int baseWidth = x * y;
		int sideWidth = 2 * x + 2 * y;
		int totalWidth;
		// 직육면체 겉넓이 계산
		totalWidth = baseWidth * 2 + sideWidth * 5; // 옆넓이는 면이 5개임

		answer = totalWidth / n;
*/
		// GPT 도움 풀이.

		// 주사위가 정육면체 형태로 규칙적으로 배열되어야 하기 때문에, 간단하게 전체 부피를 계산해서 푸는 방식은 적절하지 않습니다.
		// 이는 상자의 각 차원(가로, 세로, 높이)이 주사위의 모서리 길이의 정수 배가 되어야 주사위를 규칙적으로 배열할 수 있기
		// 때문입니다.

		// 이렇게 하는 이유는 각 차원별로 들어갈 수 있는 주사위의 최대 수를 계산하기 위함입니다.
		
		// 상자의 크기가 가로 10, 세로 8, 높이 6이고, 주사위의 모서리 길이가 3인 경우, 각 차원에서 들어갈 수 있는 주사위의
		// 개수는 다음과 같습니다
		
		// 가로(10)에서 들어갈 수 있는 주사위의 수: 10 / 3 = 3 (소수점 이하 버림)
		// 세로(8)에서 들어갈 수 있는 주사위의 수: 8 / 3 = 2 (소수점 이하 버림)
		// 높이(6)에서 들어갈 수 있는 주사위의 수: 6 / 3 = 2
		// 이제 이 세 값(가로, 세로, 높이에서의 주사위 개수)을 곱합니다:

		// 3 (가로) * 2 (세로) * 2 (높이) = 12
		
		int baseWidth = x / n;
		int sideWidth = y / n;
		int height = z / n;
		// 직육면체 겉넓이 계산
		answer = baseWidth * sideWidth * height ;



		return answer;
	}
}
