package programmers.lessons;

public class N_DoublingArray {

	public static void main(String[] args) {
		int [] i;
		int [] iarry = {1,2,100,-99,1,2,3};

		i = solution(iarry);


	}

	public static int[] solution(int[] numbers) {
		int[] answer = new int [numbers.length];

		for (int i = 0; i < answer.length; i++) {			
			answer[i] = numbers[i] * 2;
		}
		return answer;
	}
}
