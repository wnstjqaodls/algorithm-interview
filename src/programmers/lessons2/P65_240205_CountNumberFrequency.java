package programmers.lessons2;

public class P65_240205_CountNumberFrequency {
    /*
     * i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
     * 정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
     * 제한사항
     * 1 ≤ n ≤ 3,628,800
     *
     * 입출력 예
     * n       result
     * 3628800    10
     * 7          3
     *
     *
     * 목표 : 0 < n  ≤ 3,628,800 를 만족하는 i! 를 찾아야함
     */

    public static void main (String[] args) {
        // 테스트 코드
        System.out.println(solution(100)); // 양식에 맞게 결과를 확인하기 위한 출력문

    }

    public static int solution (int n) {
        int answer = 1;
        // 여기에 로직을 구현해주세요.
        // 1. n의 팩토리얼을 계산합니다.
        int factorNum = 1;
        int i = 1;

        while (true) {
            if (factorNum * (i + 1) > n) { //  다음 팩토리얼 값을 미리 계산해서 n 과 비교한다.
                // 만약 다음 팩토리얼값이 n 보다 크면 현재 i 값이 최대 팩토리얼인것임.
                break;
            }
            i++;
            factorNum *= i;

        }

        answer = i;

        return answer; //
    }
}
