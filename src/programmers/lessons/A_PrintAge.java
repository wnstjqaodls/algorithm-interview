package programmers.lessons;

public class A_PrintAge {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		int answer;
		
		Double Dnum1 = Double.valueOf(num1);
		Double Dnum2 = Double.valueOf(num2);
		
		answer = (int) Math.floor(Dnum1 /Dnum2 * 1000);
		
		System.out.println(answer);
		
	}

}
