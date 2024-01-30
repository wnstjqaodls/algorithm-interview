package programmers.lessons;

public class K_ClothedSale {

	public static void main(String[] args) {

		int i = solution(100010);
		System.out.println(i);
		
	}

	public static int solution(int price) {
		int answer = 0;
		//int useValue = (int) Math.floor(price);
		
		if (price >= 100000 && price >= 500000) {
			answer = (int) (price * 0.80);
		} else if (price >= 300000) {
			answer = (int) (price * 0.90);
		} else if (price >= 100000) {
			answer = (int) (price * 0.95);
		} else {
			answer = price;
		}

		return (int) Math.floor(answer);
	}
}
