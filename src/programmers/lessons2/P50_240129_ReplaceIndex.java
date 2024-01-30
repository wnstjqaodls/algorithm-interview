package programmers.lessons2;

public class P50_240129_ReplaceIndex {
	/*
	 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 인덱스
	 * num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String param = "I love you";
		int param2 = 3;
		int param3 = 6;
		String result;

		result = solution(param, param2, param3);
		System.out.println(result);


	}
	
	
    public static String solution(String my_string, int num1, int num2) {
        //String answer = "";
        
        // 내풀이
        // string builder 이용 , 
    	// String 을 문자 배열로 변경 substring 으로 뽑아냄. 해당 index 에 붙임.
    	// my_string.toCharArray();
        // 또는 간단하게 replace 메소드이용
        
        // 도움풀이
        StringBuilder sb = new StringBuilder(my_string);
        char temp = sb.charAt(num1);
        sb.setCharAt(num1, sb.charAt(num2)); //새로 사용해본 API setCharAt
        sb.setCharAt(num2, temp);
        
        return sb.toString();
    }

}
