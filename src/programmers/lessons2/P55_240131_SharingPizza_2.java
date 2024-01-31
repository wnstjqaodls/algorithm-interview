package programmers.lessons2;

public class P55_240131_SharingPizza_2 {
	/*
	 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지
	 * 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	 * 
	 * 입출력 예 #1
	 * 
	 * 6명이 모두 같은 양을 먹기 위해 한 판을 시켜야 피자가 6조각으로 모두 한 조각씩 먹을 수 있습니다. 입출력 예 #2
	 * 
	 * 10명이 모두 같은 양을 먹기 위해 최소 5판을 시켜야 피자가 30조각으로 모두 세 조각씩 먹을 수 있습니다. 입출력 예 #3
	 * 
	 * 4명이 모두 같은 양을 먹기 위해 최소 2판을 시키면 피자가 12조각으로 모두 세 조각씩 먹을 수 있습니다.
	 */

	public static void main(String[] args) {

		int param = 10;
		int result;
		
		result = solution(param);
		System.out.println(result);

	}

    public static int solution(int n) {
        int answer = 0;
        int sliceOfpizza = 6; // 한판에 6조각
        // 내풀이
        // 1. 피자 6조각 으로 인원수를 나누었을때 1보다 크면 1임. 1보다 크고 2보다 작으면 무조건 2 판시켜야함..
        // 2. 규칙 발견 : 피자판수 = 정수로 딱 나뉘어 떨어지는 수.
        // 3. 반복문을 순회하며 ,나머지가 없이 떨어지는 i 를 찾는다. 해당 i 를 return 함.
        
        for (int i = 1; i <= n; i++) {
			if( (i*sliceOfpizza) % n == 0){
				answer = i;
				break;
			}
		}
        
        
        
        
        return answer;
    }

}
