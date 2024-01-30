package programmers.lessons;

public class T_UppercaseAndLowercaseLetters {

	public static void main(String[] args) {
		
		String param = "abCdEfghIJ";

		String result;
		
		result = solution(param);
		System.out.println(result);

	}

	/*
	 * 문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록
	 * solution 함수를 완성해주세요.
	 * 
	 * 
	 * 1 ≤ my_string의 길이 ≤ 1,000 my_string은 영어 대문자와 소문자로만 구성되어 있습니다.
	 * 
	 * 
	 * 입출력 예 #1
	 * 
	 * 소문자는 대문자로 대문자는 소문자로 바꾼 "CCCccc"를 return합니다. 입출력 예 #2
	 * 
	 * 소문자는 대문자로 대문자는 소문자로 바꾼 "ABcDeFGHij"를 return합니다.
	 * 
	 * 
	 * 
	 */
    public static String solution(String my_string) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        // 내 풀이.
        // 소문자인지 대문자인지 판단
        // ASCII 코드 활용? 만약 문자열이 소문자 code 범위에있으면 해당 코드의 + n 하여 append
        // 대문자와 소문자의 ASCII 코드의 10진수 차이는 32임.        
        for (int i = 0; i < my_string.length(); i++) {
			
        	char currChar = my_string.charAt(i);
        	// 만약 대문자라면
        	if(currChar > 64 && currChar < 91){        		 
        		sb.append(Character.toLowerCase(currChar));
        	} else { // 소문자인경우 대문자로
        		        		
        		sb.append(Character.toUpperCase(currChar));
        	}
		}
        
        answer = sb.toString();
        
        return answer;
    }
}
