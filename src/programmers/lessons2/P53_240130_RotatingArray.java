package programmers.lessons2;

import java.util.Arrays;

public class P53_240130_RotatingArray {
	/*
	 * 정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다. 배열 numbers의 원소를
	 * direction방향으로 한 칸씩 회전시킨 배열을 return하도록 solution 함수를 완성해주세요.
	 * 
	 * 
	 * 입출력 예 #1
	 * 
	 * numbers 가 [1, 2, 3]이고 direction이 "right" 이므로 오른쪽으로 한 칸씩 회전시킨 [3, 1, 2]를
	 * return합니다. 입출력 예 #2
	 * 
	 * numbers 가 [4, 455, 6, 4, -1, 45, 6]이고 direction이 "left" 이므로 왼쪽으로 한 칸씩
	 * 회전시킨 [455, 6, 4, -1, 45, 6, 4]를 return합니다.
	 */

	public static void main(String[] args) {
		int [] param = {4, 455, 6, 4, -1, 45, 6};
//		int [] param = {1,2,3};
//		String param2 = "right";
		String param2 = "left";
		
		int[] result;

		result = solution(param,param2);
		System.out.println(Arrays.toString(result));
	}

    public static int[] solution(int[] numbers, String direction) {
        int[] answer = new int [numbers.length];
        
        // 내풀이
        
        int tmp;
        
        if("left".equals(direction)){
//        	배열의 첫번째 값이 가장 마지막으로 이동
//        	그후 인덱스 1번부터 마지막 인덱스 이전까지
        	tmp = numbers[numbers.length-1];
        	answer[numbers.length-1] = numbers[0];
        	
        	// 새 배열의 값은 기존 배열 N 의 값이 N-1 번째에 들어가면됨 
        	for (int i = 0; i < answer.length-1; i++) {
        		answer[i] = numbers[i+1]; 
			}
        	
        	
        }else if("right".equals(direction)) {
//        	배열의 마지막 값이 가장 첫번째로 이동
        	tmp = numbers[0];
        	answer[0] = numbers[numbers.length-1];
        	
        	// 배열을 오른쪽으로 밀었으니 i = 1 부터 시작해야함
        	for (int i = 1; i < answer.length; i++) {
				answer[i] = numbers[i-1]; // 이전값이 새로운 배열에 들어가야하니.. i-1
			}
        	
        }
        
        
        
        return answer;
    }

}
