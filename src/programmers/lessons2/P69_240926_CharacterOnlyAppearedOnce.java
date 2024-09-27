package programmers.lessons2;

import java.util.Arrays;

public class P69_240926_CharacterOnlyAppearedOnce {
    /*
     * 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
     * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
     *
    제한사항
    0 < s의 길이 < 1,000
    s는 소문자로만 이루어져 있습니다.

     *
     *
     *  입출력 예
         s	            result
        "abcabcadc"	    "d"
        "abdc"	        "abcd"
        "hello"	        "eho"
*
*
    입출력 예 #1
    "abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
    입출력 예 #2
    "abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
     */

    public static void main (String[] args) {

        String s = "abdc";
        System.out.println(solution(s));  // 예상 출력: abcd 가 나와야함  실제 : abdc
    }



    public static String solution(String s) {
        // 한번만 등장 info > char하나의 값을 나머지와 loop 돌며 비교
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            boolean flag = false;

            int cnt = 0;
            for (int j = 0; j <s.length() ; j++) {
//                flag = true;
                if(currChar == s.charAt(j)) {
//                    flag = false;
                    cnt++;
                }
            }
            if(cnt < 2) flag = true;

            if(flag) answer += currChar;

        }

        // 사전순 정렬
        char [] charArray = answer.toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }
}
