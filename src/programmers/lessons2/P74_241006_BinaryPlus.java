package programmers.lessons2;

import java.util.ArrayList;

public class P74_241006_BinaryPlus {
    /*
     * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
     * 따라서 12의 소인수는 2와 3입니다.
     * 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.

     *
    제한사항
    2 ≤ n ≤ 10,000

     *
     *
    입출력 예
    n	result
    12	[2, 3]
    17	[17]
    420	[2, 3, 5, 7]
    *
    *
  입출력 예 설명
    입출력 예 #1
    12를 소인수분해하면 2 * 2 * 3 입니다. 따라서 [2, 3]을 return합니다.
    *
    입출력 예 #2
    17은 소수입니다. 따라서 [17]을 return 해야 합니다.
    *
    입출력 예 #3
    420을 소인수분해하면 2 * 2 * 3 * 5 * 7 입니다. 따라서 [2, 3, 5, 7]을 return합니다.
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
