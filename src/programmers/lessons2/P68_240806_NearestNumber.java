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
        // 가장 가까운 수가 여러개일경우 더 작은 수를 리턴하라고 한다.
        int minDiff = Integer.MAX_VALUE; //
        int [] multipleNearNumber = new int [100];

        for (int i = 1; i < array.length; i++) { // 두 번째 요소부터 시작하여 배열 순회
            int diff = Math.abs(array[i] - n); // n과 현재 요소의 차이 계산

            // 최소 차이를 업데이트하거나, 차이가 같은 경우 더 작은 수를 선택하는 조건
            // 가장 가까운 수가 여러개일 경우  더 작은수를 리턴함.
            if ( diff < minDiff ) {

                minDiff = diff;
                answer = array[i];
                if (minDiff == diff){
                    int cnt = 0;
                    multipleNearNumber[cnt] = array[i];
                    cnt += 1;
                }
            }
        }

        if(multipleNearNumber.length > 0){
            for (int i = 0; i < multipleNearNumber.length; i++) {

                if (multipleNearNumber[i] < minDiff){
                    answer = multipleNearNumber[i];
                }

            }
        }
        return answer;
    }
}
