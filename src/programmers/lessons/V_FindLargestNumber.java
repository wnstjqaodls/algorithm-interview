package programmers.lessons;

import java.util.Arrays;

public class V_FindLargestNumber {

	public static void main(String[] args) {

		int [] param = {9, 10, 11, 8};
		int [] result;

		result = solution(param);
		System.out.println(Arrays.toString(result));

	}

	/*
	 * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution
	 * 함수를 완성해보세요.
	 *
	 *
		입출력 예
		array		result
		[1, 8, 3]	[8, 1]
		[9, 10, 11, 8]	[11, 2]
	 * 
	 * 
	 * 입출력 예 설명 입출력 예 #1
	 * 
	 * 1, 8, 3 중 가장 큰 수는 8이고 인덱스 1에 있습니다. 입출력 예 #2
	 * 
	 * 9, 10, 11, 8 중 가장 큰 수는 11이고 인덱스 2에 있습니다.
	 * 
	 */
    public static int[] solution(int[] array) {
        //int[] answer = new int[2];
        /*Arrays.sort(array);
        answer[0] = array[array.length-1];
        answer[1] = array.length-1;
        */
        
        // 왜이렇게 문제를.. 복잡하게 풀려고했지..?
        /*for (int i = 0; i < array.length; i++) {
        	// 만약 마지막값이 가장큰값이라면...?
			if(i == array.length-1 &&  array[i] > answer[0]){
				answer[0] = array[i];
				answer[1] = i;
				return answer ; 
			}
				
        	
        	int curVal = array[i];
			int nextVal = array[i+1];
			
			
			answer[0] = curVal;
			answer[1] = i;
			
        	if(curVal > nextVal){
				answer[0] = curVal;
				answer[1] = i;
			}
        	
		}
        */
        
        // GPT 도움받은 간단한 코드
        int max = array[0];
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
			
        	if (max < array[i]) {
				max = array[i];
				index = i;
			}
		}
        

        return new int[]{max,index};
    }
}
