package programmers.lessons;

import java.util.Arrays;

public class PlayGround {

	/*
	 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
	 * solution 함수를 완성해주세요.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numbers[] = { 0, 31, 24, 10, 1, 9, 49 };
		

		int temp = 10;
		int size = (temp + 1 ) / 2; // 소수점이하는 버림
		/*
		 * (n + 1) / 2; 이 코드 부분은 n 이하의 홀수의 개수를 계산하기 위해 사용됩니다. 이 계산 방법은 n이 홀수인지
		 * 짝수인지에 따라 홀수의 개수를 올바르게 계산하기 위함입니다.
		 * 
		 * 짝수인 경우 (n이 짝수일 때): 예를 들어, n이 10일 경우, 10 이하의 홀수는 1, 3, 5, 7, 9 이므로 총
		 * 5개입니다. 이 경우 n / 2는 10 / 2 = 5로, 홀수의 개수와 일치합니다. 
		 * 
		 * 홀수인 경우 (n이 홀수일 때):
		 * 이번에는 n이 11이라고 가정해봅시다. 11 이하의 홀수는 1, 3, 5, 7, 9, 11로 총 6개입니다. 단순히 n /
		 * 2를 하면 11 / 2 = 5 (소수점 이하를 버림)가 되어 정확한 개수를 얻을 수 없습니다. 따라서 n에 1을 더해 12
		 * / 2 = 6으로 계산하면 정확한 홀수의 개수를 얻을 수 있습니다.
		 * 
		 * 즉, n + 1을 2로 나누는 것은 n이 짝수이든 홀수이든 상관없이 올바른 홀수의 개수를 계산하기 위한 방법입니다.
		 */
		int result [] = new int[size];
		int initNum = 1;
		for (int i = 0; i < size; i++) {
			
				result[i] = initNum;
				initNum +=2; //다음 홀수 저장
			
		}
		
		System.out.format("result is %s",Arrays.toString(result));
		System.out.format("result is %d",1/2); //0
		
		
		
	}

	public static void solution(int[] dot) {

		int answer = 0;

		System.out.println(answer);

	}

}
