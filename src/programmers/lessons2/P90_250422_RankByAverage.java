package programmers.lessons2;

import java.util.Arrays;

public class P90_250422_RankByAverage {
    /*
    문제 설명
    영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 
    영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 
    영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 
    solution 함수를 완성해주세요.

    제한사항
    - 0 ≤ score[0], score[1] ≤ 100
    - 1 ≤ score의 길이 ≤ 10
    - score의 원소 길이는 2입니다.
    - score는 중복된 원소를 갖지 않습니다.

    입출력 예
    score                                                                    result
    [[80, 70], [90, 50], [40, 70], [50, 80]]                               [1, 2, 4, 3]
    [[80, 70], [70, 80], [30, 50], [90, 100], [100, 90], [100, 100], [10, 30]]    [4, 4, 6, 2, 2, 1, 7]
    */

    public static void main(String[] args) {
        P90_250422_RankByAverage solution = new P90_250422_RankByAverage();

        System.out.println("Test Case 1 - Expected: [1, 2, 4, 3]");
        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        printArray(solution.solution(score1));

        System.out.println("\nTest Case 2 - Expected: [4, 4, 6, 2, 2, 1, 7]");
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        printArray(solution.solution(score2));
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public int[] solution(int[][] score) {

        
        int average[] = new int[score.length];

        average = Arrays.stream(score).mapToInt(s -> (s[0] + s[1])).toArray();

        int result [] = new int[score.length];

        for (int i = 0; i < score.length; i++) {

        int rank = 1;

            for (double curr : average) {
                if (average[i] < curr) {
                    rank++;
                }
            }
            result[i] = rank;

        }
        return result;
    }
} 
