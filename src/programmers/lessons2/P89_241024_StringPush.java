package programmers.lessons2;

public class P89_241024_StringPush {
    /*
    문제 설명
    문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 
    "ohell"이 됩니다. 이것을 문자열을 민다고 정의할 때, 문자열 A와 B가 매개변수로 주어질 때, 
    A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고 
    밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해주세요.

    제한사항
    - 0 < A의 길이 = B의 길이 < 100
    - A, B는 알파벳 소문자로 이루어져 있습니다.

    입출력 예
    A       B        result
    "hello" "ohell"  1
    "apple" "elppa"  -1
    "atat"  "tata"   1
    "abc"   "abc"    0
    */

    public static void main(String[] args) {
        P89_241024_StringPush solution = new P89_241024_StringPush();

        System.out.println("Test Case 1 - Expected: 1");
        System.out.println(solution.solution("hello", "ohell"));

        System.out.println("\nTest Case 2 - Expected: -1");
        System.out.println(solution.solution("apple", "elppa"));

        System.out.println("\nTest Case 3 - Expected: 1");
        System.out.println(solution.solution("atat", "tata"));

        System.out.println("\nTest Case 4 - Expected: 0");
        System.out.println(solution.solution("abc", "abc"));
    }

    public int solution(String A, String B) {
        // 두 문자열이 같으면 밀 필요가 없으므로 0 반환
        if (A.equals(B)) return 0;
        
        char[] chars = A.toCharArray();
        int len = chars.length;
        
        // 최대 len-1번 밀어보기
        for (int i = 1; i < len; i++) {
            // 마지막 문자 저장
            char last = chars[len - 1];
            
            // 오른쪽으로 한 칸씩 밀기
            for (int j = len - 1; j > 0; j--) {
                chars[j] = chars[j - 1];
            }
            
            // 마지막 문자를 맨 앞으로
            chars[0] = last;
            
            // 현재 상태가 B와 같은지 확인
            if (String.valueOf(chars).equals(B)) {
                return i;
            }
        }
        
        return -1;
    }
} 