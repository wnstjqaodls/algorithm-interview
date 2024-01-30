package programmers.lessons;

import java.util.Arrays;


public class V_CreatingMaximum_2 {

	public static void main(String[] args) {
		
		int [] param = {0, -31, 24, 10, 1, 9};
		
		int result;
		
		result = solution(param);
		System.out.println(result);

	}

	/*
	 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록
	 * solution 함수를 완성해주세요.
	 *
	 *
	 * 입출력 예
		numbers						result
		[1, 2, -3, 4, -5]			15
		[0, -31, 24, 10, 1, 9]		240
		[10, 20, 30, 5, 5, 20, 5]	600
	 * 
	 입출력 예 #1

		두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.
	입출력 예 #2

		두 수의 곱중 최댓값은 10 * 24 = 240 입니다.
	 * 
	 */
    public static int solution(int[] numbers) {
        int answer = 0;
        // 1.정렬
        // 2.최대값 계산 (음수x음수 , 양수x양수)
        // 3.둘중 큰값 비교
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        int positiveMax;
        int negativeMax;
        
        positiveMax = numbers[0] * numbers[1];
        negativeMax = numbers[numbers.length-1] * numbers[numbers.length-2];
        
        answer = (positiveMax > negativeMax) ? positiveMax : negativeMax;
        return answer;	
        
    }
}
