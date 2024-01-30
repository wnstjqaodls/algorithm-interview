package programmers.lessons;

import java.util.Arrays;

public class S_TriangleCompletionConditions_1 {

	public static void main(String[] args) {
		int result;
		int num1 [] = {199, 72, 222};

		result = solution(num1);
		System.out.println(result);

	}

	/*
	 * 선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
	 * 
	 * 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다. 
	 * 삼각형의 세 변의 길이가 담긴 배열 sides이 매개변수로
	 * 주어집니다. 
	 * 세 변으로 삼각형을 만들 수 있다면 1, 만들 수 없다면 2를 return하도록 solution 함수를 완성해주세요.
	 * 
	 * sides의 원소는 자연수입니다. 
	 * sides의 길이는 3입니다. 
	 * 1 ≤ sides의 원소 ≤ 1,000
	 * 
	 * 입출력 예 #3 
	 * 가장 큰 변인 222가 나머지 두 변의 합 271보다 작으므로 삼각형을 완성할 수 있습니다. 
	 * 따라서 1을 return합니다.
	 */
	 public static int solution(int[] sides) {
	        int answer = 0;
	        // 내 풀이... 실패함
/*	        int partionValue = sides[0];
	        int secondValue = sides[1];
	        int threeValue = sides[2];
	        int maxValue;
	        
	        int otherValue [] = new int[2];
	        int cnt = 0;
	        
	        for (int i = 1; i < sides.length; i++) {
	        	if(sides[i] > partionValue) {
	        		maxValue = sides[i];	        		
	        	} else {
	        		maxValue = partionValue;		
	        	}
			}
	        
	        	        // maxValue 가 아닌 나머지들은 ..? 어떻게?
	        // TODO : 24-01-23 문제풀이중..
	        if(maxValue < ){
	        	answer = 1; 
	        } else{
	        	answer = 2; 
	        	
	        }*/
	        
	        
	        // 정답풀이 from GPT
	        Arrays.sort(sides);
	        
	        if(sides[2] < sides[0] + sides[1]){
	        	answer = 1;
	        } else {
	        	answer = 2;
	        }
	        
	        return answer;
	    }
}
