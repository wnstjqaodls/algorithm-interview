package programmers.lessons2;

import java.util.Arrays;

public class P71_240927_NumberOf7s {
    /*
     * 머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
     *
    제한사항
    1 ≤ array의 길이 ≤ 100
    0 ≤ array의 원소 ≤ 100,000

     *
     *
    입출력 예
    array	result
    [7, 77, 17]	4
    [10, 29]	0
    *
    *
   입출력 예 설명
    입출력 예 #1
    [7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.

*   입출력 예 #2
    [10, 29]에는 7이 없으므로 0을 return 합니다.
     */

    public static void main (String[] args) {

        int [] param = {7,77,717};
        System.out.println(solution(param));  // 예상 출력: 4가 나와야함
    }


    public static int solution(int[] array) {

        int cnt = 0;
        for (int i = 0; i < array.length; i++) {
            int curr = array[i]; // 현재 숫자

            int num = curr;
            while( num > 0 ){
                int digit = num % 10; // 현재 자리수
                if(digit == 7){ // 자리수가 7인지 확인
                    cnt += 1;
                }

                num /= 10;
            }

        }

        int answer = cnt;
        return answer;
    }
}
