package programmers.lessons2;

import java.util.Arrays;

public class P51_240129_SortingStrings_1 {
	/*
	 * 문자열 my_string이 매개변수로 주어질 때, 
	 * my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return하도록 
	 * solution 함수를 작성해보세요.
	 */

	public static void main(String[] args) {
		String param = "p2o4i8gj2";
		int[] result;

		result = solution(param);
		System.out.println(Arrays.toString(result));
	}

	public static int[] solution(String my_string) {

		int[] answer = {};
		
		// 내풀이 
		// 1. myString 을 우선 정규표현식으로 필터링해서 숫자만 뽑아낸다. 
		// 2. 숫자를 배열을 길이만큼 초기화시킴
		// 3. 숫자배열을 sort 메소드로 정렬시킨다.
		
		// 도움풀이
		String regExp = "[^0-9]"; //숫자 제외한것들 필터
		String filteredString;
		filteredString = my_string.replaceAll(regExp,"");		
		
		// 4. 담아둔 String 을 숫자 배열로 변경한다.
		answer = new int[filteredString.length()];
		
		//	int [] tmpArr = Integer.parseInt(ttmp);
		// ttmp 에 string 형태로 들어있다. 이걸 하나씩 배열형태로 casting 해야한다.
		
		for (int i = 0; i < answer.length; i++) {
			answer[i] = Character.getNumericValue(filteredString.charAt(i)); //GPT 도움받은 getNumeric 메서드 			
			
	         // answer[i] = my_string.charAt(i) - '0';
			// char 타입을 숫자로 연산할 경우 char 타입 '0'을 빼줘야 의도한 정수숫자가 나와요.
		}
		
		
		Arrays.sort(answer);
		
		return answer;
	}

}
