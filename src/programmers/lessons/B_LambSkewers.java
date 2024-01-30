package programmers.lessons;

public class B_LambSkewers {


	public static void main(String[] args) {

		solution(10,3);
	}

/*	머쓱이네 양꼬치 가게는 10
	인분을 먹으면
	음료수 하나를
	서비스로 줍니다.양꼬치는 1 인분에 12,000 원,음료수는 2,000
	원입니다.정수 n과
	k가 매개변수로
	주어졌을 때, 양꼬치
	n인분과 음료수
	k개를 먹었다면
	총얼마를 지불해야 하는지 return
	하도록 solution
	함수를 완성해보세요.
*/	
	public static int solution(int n, int k) {
		int lamSkewerPrice = 12000; // 양꼬치 가격
        int drinkPrice = 2000;      // 음료수 가격
        int freeDrink = n/10;
        int answer = 0;

        answer = (lamSkewerPrice * n) + (drinkPrice *(k - freeDrink));
        return answer;
	       
	}

}
