package programmers.lessons2;

public class P68_240806_NearestNumber {
    /*
     * 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
     *
    제한사항
    1 ≤ array의 길이 ≤ 100
    1 ≤ array의 원소 ≤ 100
    1 ≤ n ≤ 100
    가장 가까운 수가 여러 개일 경우 더 작은 수를 return 합니다.
     *
     *
     * 입출력 예
        array	n	result
        [3, 10, 28]	20	28
        [10, 11, 12] 13	12
     */

    public static void main (String[] args) {

        int num = 20;
        int numArr [] = new int[3];
        numArr = new int[] {10, 11, 12};
        System.out.println(solution(numArr, num));  // 예상 출력: 133
    }



    public static int solution(int[] array, int n) {
        int answer = 0;
        // 가까운 수 라는건.. 수직선상의 차이가 가장 적은수라고 볼수있음
        // 3-20 = -17 만큼차이
        // 28-20 = 8 만큼차이.
        // 즉. 절대값만큼의 차이를 기준으로 조건판단하면됨.
        int minDiffNum = array[0];
        for (int i = 0; i < array.length; i++) {
            int diffNum = Math.abs(n) - Math.abs(array[i]);
            if(diffNum < minDiffNum) {
                answer = array[i];
            }
        }
        return answer;
    }
}
