package programmers.lessons;

import java.util.Arrays;

public class R_NumberOfOrderPairs {

	public static void main(String[] args) {
		int result;
		int num1 = 100;

		result = solution(num1);
		System.out.println(result);

	}

	/*
	 * 순서쌍이란 두 개의 숫자를 순서를 정하여 짝지어 나타낸 쌍으로 (a, b)로 표기합니다. 자연수 n이 매개변수로 주어질 때 두
	 * 숫자의 곱이 n인 자연수 순서쌍의 개수를 return하도록 solution 함수를 완성해주세요.
	 * 
	 * 
	 * n이 100 이므로 곱이 100인 순서쌍은 (1, 100), (2, 50), (4, 25), (5, 20), (10, 10),
	 * (20, 5), (25, 4), (50, 2), (100, 1) 이므로 9를 return합니다.
	 */

    public static int solution(int n) {
        int answer = 0;
        
        // 내 풀이 : 
        // n 을 우선 1부터 증가시킨다.
        // n에서 --i 감소하며 뒤에값부터 검사를한후 n * 뒤의값 검사를한다
        // 해당 값의 결과가 n 과 동일하다면 앖의 n 을 2로 증가시키고 , cnt 를 1 증가시킨다.        
        // n 과 뒤의값을 곱한값 검사를 또한다. .. 이렇게  1,2,3,4, 증가시키며 100 까지 검사를한다.
        
        // 정답 풀이 :
        // 순서쌍은 결국.. 약수의 갯수랑 동일하니까. 약수의 갯수만 카운팅하면되는문제임..
       
        for (int i = 1; i <= n; i++) {
			if(n % i == 0)
				answer++;  // 카운팅함
				//약수이면 
		}
        
        
        return answer;
    }
}
