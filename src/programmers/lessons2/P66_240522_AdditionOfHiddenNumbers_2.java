package programmers.lessons2;

public class P66_240522_AdditionOfHiddenNumbers_2 {
    /*
     * 문자열 my_string이 매개변수로 주어집니다. my_string에는 소문자, 대문자, 자연수로만 구성되어있습니다.
     * my_string 안에 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
     *
     * 제한사항
     * 1 ≤ my_string의 길이 ≤ 1,000
     * 1 ≤ my_string 안의 자연수 ≤ 1000
     * 연속된 수는 하나의 숫자로 간주합니다.
     * 000123과 같이 0이 선행하는 경우는 없습니다.
     * 문자열에 자연수가 없는 경우 0을 return 해주세요.
     *
     * 입출력 예
     * my_string              result
     * "aAb1B2cC34oOp"        37
     * "1a2b3c4d123Z"         133
     *
     */

    public static void main (String[] args) {
        // 테스트 코드
        System.out.println(solution("aAb1B2cC34oOp")); // 예상 출력: 37
        System.out.println(solution("1a2b3c4d123Z"));  // 예상 출력: 133
    }

    public static int solution (String my_string) {
        // 1. 반복문시작
        // 2. 문자열의 숫자가 연결되어있다면 하나의 숫자로 처리 (이게 관건일듯.)
        // 2.1 반복문을 돌다가 숫자 ASCII 코드에 해당하면 해당 i 를 우선 저장 .  * 숫자는 ASCII 코드로 48 : 0 부터 57 : 9 까지 임.
        // 2.2 그다음 반복문에서 숫자에 해당하면 i 를 누적
        // 2.3 그다음 반복문에서 숫자에 해당하지 않는다면 누적된 i 값을 결과에 다시 누적함.

        int answer = 0;
        char [] charArray = my_string.toCharArray();


        StringBuilder currentNo = new StringBuilder("");
         // 1. 문자열을 순회하면서 숫자를 파싱.

        for (int i = 0; i < my_string.length(); i++) {
            if ( charArray[i] > 47 && charArray[i] < 58) {
                currentNo.append(charArray[i]);

                continue;
            }

            // 숫자가아닌 문자를 만난경우 현재까지의 숫자를 합산
            if ( currentNo.length() > 0){
                answer += Integer.parseInt(currentNo.toString());
                currentNo.setLength(0); // 초기화
            }


        }

        // 마지막에 숫자가 남아있는 경우 처리
        if (currentNo.length() > 0){
            answer += Integer.parseInt(currentNo.toString());
        }




        return answer;
    }
}
