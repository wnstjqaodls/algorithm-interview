package programmers.lessons2;

import java.util.Iterator;

public class P57_240131_369Games {
	/*
	 * 머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6,
	 * 9의 개수만큼 박수를 치는 게임입니다. 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를
	 * return 하도록 solution 함수를 완성해보세요.
	 * 
	 * 입출력 예 설명 입출력 예 #1
	 * 
	 * 3은 3이 1개 있으므로 1을 출력합니다. 
	 * 
	 * 입출력 예 #2
	 * 
	 * 29423은 3이 1개, 9가 1개 있으므로 2를 출력합니다.
	 */

	public static void main(String[] args) {

		int param = 29423;
		int result;

		result = solution(param);
		System.out.println(result);

	}

    public static int solution(int order) {
        int answer = 0;
        String tmp = Integer.toString(order);
        int[] intArr = new int[tmp.length()];
        
        for (int i = 0; i < intArr.length; i++) {
			intArr[i] = tmp.charAt(i) - '0'; // 숫자가되기위해 ASCII 코드 '0' 값인 48을 빼주는것임. 숫자 1은 49 ,2는 50임
		}
        
        int idx =0;
        while(idx < tmp.length()) {
        	
        	if(intArr[idx] == 3 || intArr[idx] == 6 || intArr[idx] == 9) {
        		answer += 1;
        	}
        	
        	idx += 1;
        }
        
        
        return answer;
    }

}
