package programmers.lessons;

import java.util.Arrays;

public class P_PizzaShare3 {
	

    
    
	public static void main(String[] args) {
		int result;
		int num1 = 7; //4
		int num2 = 10; //12
		
		result = solution(num1,num2);
		System.out.println(result);

	}
	
	/*
	 * 머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다. 피자 조각 수 slice와 피자를 먹는 사람의 수
	 * n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면 최소 몇 판의 피자를 시켜야 하는지를 return
	 * 하도록 solution 함수를 완성해보세요.
	 */
    public static int solution(int slice, int n) {
    	  // 필요한 피자 판 수를 계산합니다.
        int pizzaPans = n / slice;  

        // 모든 사람에게 피자를 제공하기 위해 추가 판이 필요한 경우 하나를 더 추가합니다.
        if (n % slice > 0) {
        	if(n % slice == 0){        		
        		return pizzaPans;
        	}
            pizzaPans++;
        }

        return pizzaPans;
    }

}
