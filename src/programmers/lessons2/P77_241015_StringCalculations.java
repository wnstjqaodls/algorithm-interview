package programmers.lessons2;

import java.util.Arrays;

public class P77_241015_StringCalculations {
    /*
     *문제 설명
    my_string은 "3 + 5"처럼 문자열로 된 수식입니다.
    *  문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.

     *
    제한사항
    연산자는 +, -만 존재합니다.
    문자열의 시작과 끝에는 공백이 없습니다.
    0으로 시작하는 숫자는 주어지지 않습니다.
    잘못된 수식은 주어지지 않습니다.
    *
    5 ≤ my_string의 길이 ≤ 100
    *
    my_string을 계산한 결과값은 1 이상 100,000 이하입니다.
    my_string의 중간 계산 값은 -100,000 이상 100,000 이하입니다.
    계산에 사용하는 숫자는 1 이상 20,000 이하인 자연수입니다.
    my_string에는 연산자가 적어도 하나 포함되어 있습니다.
    return type 은 정수형입니다.
    my_string의 숫자와 연산자는 공백 하나로 구분되어 있습니다.
     *
     *
   입출력 예
    my_string	result
    "3 + 4"	7
    입출력 예 설명
    입출력 예 #1

    3 + 4 = 7을 return 합니다.
     */

    public static void main (String[] args) {


        String param = "3 + 4";

            System.out.println(solution(param)); // 나와야하는 결과값 : 3

    }


    public static int solution(String my_string) {
        int answer = 0;
        // info : 문제풀이 전략 > 우선 + - 밖에 없다고했으니 , String 을 이동하며 + 기호발견시 이전의 값을 int 로 파싱해서누적한
        // info 누적한값을 + 기호 뒤의 값과 연산함. > 다음공백 이전까지 > 그리고 다시 이동
        String filterdResult;
        String filterdOperators;

        filterdResult = my_string.replaceAll("[^0-9]"," ");// 공백 제거및 숫자만 남기기
        String [] numbers = filterdResult.split("\\s+");

        System.out.println("필터된 숫자는 : "+filterdResult); // 나와야하는 결과값 : 3

        filterdOperators = my_string.replaceAll("[^\\+\\-]","");
        System.out.println("필터된 연산자는 : "+filterdOperators); // 나와야하는 결과값 : 3

        answer = Integer.parseInt(numbers[0]); // 첫 번째 숫자 시작
        for (int i = 0; i < filterdOperators.length(); i++) {
            if(filterdOperators.charAt(i) == '+'){
                answer += Integer.parseInt(numbers[i + 1]);
            } else if (filterdOperators.charAt(i) == '-') {
                answer -= Integer.parseInt(numbers[i + 1]);
            }
        }

        return answer;
    }
}
