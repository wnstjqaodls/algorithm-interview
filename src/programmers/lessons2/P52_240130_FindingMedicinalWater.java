package programmers.lessons2;

import java.util.Arrays;

public class P52_240130_FindingMedicinalWater {
	/*
	 * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
	 */

	public static void main(String[] args) {
		int param = 24;
		int[] result;

		result = solution(param);
		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(int n) {
		int[] answer = {};
		
		int idx = 0;
		for (int i = 1; i <= n; i++) {
			
			if(n % i == 0){
				idx++;
			}
		}
		answer = new int [idx];
		
		idx = 0;
		for (int i = 1; i <= n; i++) {
			
			if(n % i == 0){
				answer[idx] = i;
				idx++;
			}
		}
		
		
		return answer;
	}

}
