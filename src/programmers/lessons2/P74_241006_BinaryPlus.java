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
     */

    public static void main (String[] args) {

        int param = 420;
        System.out.println(solution(param));  // 예상 출력: 4가 나와야함
    }


    public static int[] solution(int n) {
        ArrayList<Integer> factors = new ArrayList<>(); // 소인수가 몇개인지모르기때문에

        // 소수 = 약수중에 소수 인 수

        for (int i = 2; i <= n; i++) {
            if( n % i == 0) { // i 가 소인수라면

                while(n % i ==0) { // 나눌수 있을 때 까지 나눔 (소인수 중복방지)
                    n /= i;
                }
                factors.add(i);
            }

        }
        return factors.stream().mapToInt(i -> i).toArray();
    }
}
