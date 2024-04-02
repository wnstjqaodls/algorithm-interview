package programmers.lessons2;

import java.util.Arrays;

public class P58_240131_SortingStrings {
	/*
	 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한
	 * 문자열을 return 하도록 solution 함수를 완성해보세요.
	 *
	 * 입출력 예
		my_string	result
		"Bcad"		"abcd"
		"heLLo"		"ehllo"
		"Python"	"hnopty"
	 *
	 * 입출력 예 #1
	 *
	 * "Bcad"를 모두 소문자로 바꾸면 "bcad"이고 이를 알파벳 순으로 정렬하면 "abcd"입니다. 입출력 예 #2
	 *
	 * "heLLo"를 모두 소문자로 바꾸면 "hello"이고 이를 알파벳 순으로 정렬하면 "ehllo"입니다. 입출력 예 #3
	 *
	 * "Python"를 모두 소문자로 바꾸면 "python"이고 이를 알파벳 순으로 정렬하면 "hnopty"입니다.
	 */

	public static void main(String[] args) {

		String param = "heLLo";
		String result;

		result = solution(param);
		System.out.println(result);

	}

	public static String solution(String my_string) {

		// 1. 조건검사 - ASCII 코드 대문자 영역사이라면 -> 해당 A -> a 로 아스키코드값 더함  or JAVA API 사용하여 lower 로 모두 치환
		// 2. 더한 문자열을 builder에 추가함
		// 3. 마지막에 Arrays.sort api 이용하여 알파벳순으로 정렬.

		my_string = my_string.toLowerCase();

		char [] answer = my_string.toCharArray();

		Arrays.sort(answer);

		return new String(answer);
	}

}
