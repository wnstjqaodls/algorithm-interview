package programmers.lessons;

import java.util.Arrays;

public class S_DeterminingSquareNumbers {

	public static void main(String[] args) {
		int result;
		int num1 = 144;

		result = solution(num1);
		System.out.println(result);

	}

	/*
	 * 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다. 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를
	 * return하도록 solution 함수를 완성해주세요.
	 * 
	 * 입출력 예 설명
		입출력 예 #1
		144는 12의 제곱이므로 제곱수입니다. 따라서 1을 return합니다.
		
		
		입출력 예 #2
		976은 제곱수가 아닙니다. 따라서 2를 return합니다.
	 */

    public static int solution(int n) {
        int answer = 0;
        
        
        // QUESTION : 조건식의 조건을 어떻게 설정해야하지..? > 입력값의 n 범위가 1~1,000,000 까지이므로 
        // 1000 * 1000 = 1,000,000 이므로 최대값까지 를 조건으로함
        /*
         * 제곱수의 성질
         * 
         * */
        
        for (int i = 1; i <= 1000; i++) {			
        	if(i*i == n){
        		answer = 1;
        		break;
        	}else{
        		answer = 2;
        	}
		}
        
        return answer;
    }
}
