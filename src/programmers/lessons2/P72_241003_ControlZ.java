package programmers.lessons2;

import java.util.Stack;

public class P72_241003_ControlZ {
    /*
     * 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
     *  문자열에 있는 숫자를 차례대로 더하려고 합니다.
     *  이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
     *  숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.

     *
    제한사항
    1 ≤ s의 길이 ≤ 200
    -1,000 < s의 원소 중 숫자 < 1,000
    s는 숫자, "Z", 공백으로 이루어져 있습니다.
    s에 있는 숫자와 "Z"는 서로 공백으로 구분됩니다.
    연속된 공백은 주어지지 않습니다.
    0을 제외하고는 0으로 시작하는 숫자는 없습니다.
    s는 "Z"로 시작하지 않습니다.
    s의 시작과 끝에는 공백이 없습니다.
    "Z"가 연속해서 나오는 경우는 없습니다.

     *
     *
    입출력 예
    s	result
    "1 2 Z 3"	4
    "10 20 30 40"	100
    "10 Z 20 Z 1"	1
    "10 Z 20 Z"	0
    "-1 -2 -3 Z"	-3
    *
    *
   입출력 예 설명
    입출력 예 #1
    본문과 동일합니다.
    *
    입출력 예 #2
    10 + 20 + 30 + 40 = 100을 return 합니다.
    *
    입출력 예 #3
    "10 Z 20 Z 1"에서 10 다음 Z, 20 다음 Z로 10, 20이 지워지고 1만 더하여 1을 return 합니다.
    *
    입출력 예 #4, #5
    설명 생략
     */

    public static void main (String[] args) {

        String param = "10 Z 20 Z 1";
        System.out.println(solution(param));  // 예상 출력: 4가 나와야함
    }


    public static int solution(String s) {
        // 1.문제분석
        // 2.시간복잡도 고려
            // info : 길이가 200 이고 단순반복문 1개일시 > O^n > O**200 ?
        // 3.문제 풀이도출
        // 반복문을 사용해서 > 공백으로 구분 > 해당토큰을 숫자인지 Z 문자인지 판별 > Z이면 빼기누적연산.
        // 자료구조 Stack 이용
        String [] strArr = s.split(" ");
        int lenght = strArr.length;
        Stack<Integer> stack = new Stack();
        int answer = 0;

        for (int i = 0; i < lenght; i++) {

            if( "Z".equals(String.valueOf(strArr[i])) ) {
                stack.pop();
                continue;
            }
            stack.push( Integer.valueOf(strArr[i]) );
        }

        while( !stack.isEmpty()){
            answer += stack.pop();
        }

        return answer;
    }
}
