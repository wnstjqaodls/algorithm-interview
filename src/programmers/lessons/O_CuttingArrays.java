package programmers.lessons;

import java.util.Arrays;

public class O_CuttingArrays {
	
	public static void main(String[] args) {

		int [] numbers = {1, 2, 7, 10, 11,18};
		int num1 = 3;
		int num2 = 5;
		int [] result;
		Integer num = 14900;
		
		result = solution(numbers, num1, num2);
		System.out.println(Arrays.toString(result));

	}
	
	/*
	 * 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
	 * numbers의 num1번 째 인덱스부터 num2번째
	 * 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
	 */
    public static int[] solution(int[] numbers, int num1, int num2) {
/*        int numDiff = (num2-num1) +1;
    	int[] answer = new int [numDiff];
        
    	int num1Pointer = num1;
    	
        for (int i = 0; i < numDiff; i++) {
			answer[i] = numbers[num1Pointer];
			num1Pointer += 1;
		}
        */
    	
        int[] answer = new int[num2 - num1 + 1];

        for (int i = num1; i <= num2; i++) {
            answer[i -num1] = numbers[i];
            // 여기서 answer [i-num1] 하게되면 0 이되니까 0번째 인덱스부터 집어넣을수 있게된다, 그리고
            // 3-3 = 0 번째부터넣고 .. 4-3 해서 1번쨰인덱스에 추가하고 .... 5-3해서 2번째 인덱스에 추가하고 ..
            // 반복되면서 새로운 배열만들어준다.
        }
        return answer;
    }

}
