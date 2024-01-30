package programmers.lessons;

import java.util.Arrays;

public class R_HateEvenNumbers {

	public static void main(String[] args) {
		int[] result;
		int num1 = 15;

		result = solution(num1);
		System.out.println(result.toString());

	}

	/*
	 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
	 * 
	 * 입출력 예 n result 
	 * 		10 [1, 3, 5, 7, 9] 
	 * 		15 [1, 3, 5, 7, 9, 11, 13, 15]
	 */

    public static int[] solution(int n) {

        int size = (n+1) /2;
        int[] answer = new int[size];
        int initValue = 1;
        for(int i = 0; i < size; i++) {
            answer[i] = initValue;
            initValue += 2;
        }
        
        return answer;
    }
}
