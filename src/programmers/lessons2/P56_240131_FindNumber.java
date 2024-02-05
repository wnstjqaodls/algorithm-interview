package programmers.lessons2;

public class P56_240131_FindNumber {
	/*
	 * 정수 num과 k가 매개변수로 주어질 때, num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
	 * 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
	 * 
	 * 제한사항 0 < num < 1,000,000 
	 * 0 ≤ k < 10 
	 * num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return합니다. 
	 * 
	 * 입출력 예 
	 * num k result 
	 * 29183 1 3 
	 * 232443 4 4 
	 * 123456 7 -1 
	 * 
	 * 입출력 예 설명 입출력 예 #1
	 * 
	 * 29183에서 1은 3번째에 있습니다. 
	 * 입출력 예 #2
	 * 
	 * 232443에서 4는 4번째에 처음 등장합니다. 
	 * 입출력 예 #3
	 * 
	 * 123456에 7은 없으므로 -1을 return 합니다.
	 */

	public static void main(String[] args) {

		int param = 232443;
		int param2 = 4;
		int result;

		result = solution(param,param2);
		System.out.println(result);

	}

    public static int solution(int num, int k) {
        int answer = -1;
        // 내풀이
        // 1. 먼저 num 을 배열 또는 string 으로 변환한다.
        // 2. 자바 api 사용하여 찾은 인덱스 +1 하여 리턴한다.
        String temp = Integer.toString(num);
        int Arrtmp [] = new int[temp.length()];
        
        for (int i = 0; i < Arrtmp.length; i++) {
			if(Arrtmp[i] == k){
				answer = i+1;
				break;
			}
		}
        
        return answer;
    }

}
