package programmers.lessons2;

import java.util.ArrayList;

public class P74_241006_BinaryPlus {
    /*
     *문제 설명
    이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
    두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
     *
    제한사항
    return 값은 이진수를 의미하는 문자열입니다.
    1 ≤ bin1, bin2의 길이 ≤ 10
    bin1과 bin2는 0과 1로만 이루어져 있습니다.
    bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
     *
     *
    입출력 예
    bin1	bin2	result
    "10"	"11"	"101"
    "1001"	"1111"	"11000"

*
    입출력 예 설명
    입출력 예 #1
    10 + 11 = 101 이므로 "101" 을 return합니다.
    *
    입출력 예 #2
    1001 + 1111 = 11000 이므로 "11000"을 return합니다.
    * 1001
    * 1111
    *11000
     */

    public static void main (String[] args) {

        String param1 = "1001";
        String param2 = "1111";
        System.out.println(solution(param1,param2));  // 예상 출력: 4가 나와야함
    }


    public static String solution(String bin1, String bin2) {
        String answer = "";
        // 방법1 : 2진수를 10진수로 변경후 모두더한후 다시 2진수로 변경하여 리턴? > 10진수를 2진수로 바꾸는 메서드작성
        // 방법2 : String 을 배열로 바꾸고 각 이진수끼리 비교하여 둘다 1이라면 앞자리에1을 놓음.
        // 또다시 같은 인덱스의 이진수끼리 비교. > 둘다1이면 그앞의자리에 1로놓기.

        // 사용될만한 연산자
        /*
        << : 피연산자의 비트열을 왼쪽으로 이동시키며 이동에 따른 빈공간은 0으로 채움.
        >> : 피연산자의 비트열을 오른쪽으로 이동시키며, 이동에 따른 빈공간은 음수의경우엔 1, 양수의 경우엔 0으로 채움.
        >>> : 피연산자의 비트열을 오른쪽으로 이동시키며, 이동에 따른 빈공간은 0으로 채움.
        */
        StringBuilder sb = new StringBuilder();
        char [] bin1array = bin1.toCharArray();
        char [] bin2array = bin2.toCharArray();

        for (int i = bin1array.length-1; i <= 0; i--) { //revers 로 배열을시작

            for (int j = bin2array.length-1; j <= 0 ; j--) {
                if(bin1array[i] == 1 && bin2array[j] == 2){

                }
            }
        }


        return answer;
    }
}
