package programmers.lessons;

public class E_PizzaShare {
	public static void main(String[] args) {
		
		int n = (int) Math.random();
		n =1 ;
		int answer = 0;
        int pizzaMax = 7;
        
        // 필요한 최소한의 피자 수 계산
        answer = n / pizzaMax;

        // 나머지가 있으면 한 판 더 필요
        if (n % pizzaMax > 0) {
            answer += 1;
        }
        
        System.out.println(answer);
	        
		
	}

}
