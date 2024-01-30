package programmers.lessons;

import java.util.Arrays;

public class T_PickMultipleofN {

	public static void main(String[] args) {
		int num1 [] = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int num2 = 3;

		int [] result;
		
		result = solution(num2, num1);
		System.out.println(Arrays.toString(result));

	}

	/*
	 * 정수 n과 정수 배열 numlist가 매개변수로 주어질 때, numlist에서 n의 배수가 아닌 수들을 제거한 배열을
	 * return하도록 solution 함수를 완성해주세요.
	 * 
	 * 제한사항 1 ≤ n ≤ 10,000 1 ≤ numlist의 크기 ≤ 100 1 ≤ numlist의 원소 ≤ 100,000
	 * 
	 * 
	 * 입출력 예 #1
	 * 
	 * numlist에서 3의 배수만을 남긴 [6, 9, 12]를 return합니다. 입출력 예 #2
	 * 
	 * numlist에서 5의 배수만을 남긴 [10, 5]를 return합니다.
	 * 
	 */
    public static int[] solution(int n, int[] numlist) {
        int[] answer;
        // 내 풀이
        // n의 배수란.. n으로 나누었을때 나머지가 0인것이지않을까 
        int index = 0;
        for (int i = 0; i < numlist.length; i++) {
        	if(numlist[i] % n == 0){
        		index += 1;
        	}
		}
       
        answer = new int[index];
      
        int cnt = 0;
        for (int i = 0; i < numlist.length; i++) {
        	
        	if(numlist[i] % n == 0){
        		answer[cnt] = numlist[i];
        		cnt ++;
        	}
			
		}
        
        
        return answer;
    }
}
