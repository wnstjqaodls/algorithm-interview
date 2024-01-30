package programmers.lessons;

import java.util.Arrays;

public class P_BacterialGrowth {
	

    
    
	public static void main(String[] args) {
		int result;
		int num1 = 7; //7
		int num2 = 15; //15

		result = solution(num1,num2);
		System.out.println(result);

	}
	
	/*
	 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때 t시간 후 세균의
	 * 수를 return하도록 solution 함수를 완성해주세요. 
	 */
    public static int solution(int n, int t) {
        int answer = 1;
        
        for (int i = 0; i < t; i++) {
			answer = answer * 2;
		}
        
        return answer * n;
        // 입출력 예 #1
        //처음엔 2마리, 1시간 후엔 4마리, 2시간 후엔 8마리, ..., 10시간 후엔 2048마리가 됩니다. 따라서 2048을 return합니다.
    }
    

}
