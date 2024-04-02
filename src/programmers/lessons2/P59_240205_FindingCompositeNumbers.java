package programmers.lessons2;

public class P59_240205_FindingCompositeNumbers {
	/*
	 * 약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 자연수 n이 매개변수로 주어질 때
	 * n이하의 합성수의 개수를 return하도록
	 * solution 함수를 완성해주세요.
	 * 
	 * 
	 * 입출력 예 #1
	 * 
	 * 10 이하 합성수는 4, 6, 8, 9, 10 로 5개입니다. 따라서 5를 return합니다. 입출력 예 #1
	 * 
	 * 15 이하 합성수는 4, 6, 8, 9, 10, 12, 14, 15 로 8개입니다. 따라서 8을 return합니다.
	 */

	public static void main(String[] args) {

		int param = 15;
		int result;

		result = solution(param);
		System.out.println(result);

	}

    public static int solution(int n) {
		// 1 : n 의 모든 약수를 구하고 ->
		// 2 : 소수가 아닌 수를 먼저 판별 , 소수(1과 자기자신밖에 약수가 없는 수)
		// 3 : 그런수가 있다면 합성수라고 하고 count +1 한다.
		int totcnt = 0;
			for (int i = 1; i <= n ; i++) {
			int tmpcount = 0;

				for (int j = 1; j <= i ; j++) {

					if (i%j == 0) {
						tmpcount += 1;
					}
					if (j == i && tmpcount >= 3) {
						totcnt ++;
					}

				}

			}
        return totcnt;
    }

}
