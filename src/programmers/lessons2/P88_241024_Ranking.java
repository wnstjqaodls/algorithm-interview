package programmers.lessons2;

import java.util.*;

public class P88_241024_Ranking {
    /*
    문제 설명
    영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 
    영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 
    평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.

    제한사항
    - 0 ≤ score[0], score[1] ≤ 100
    - 1 ≤ score의 길이 ≤ 10
    - score의 원소 길이는 2입니다.
    - score는 중복된 원소를 갖지 않습니다.

    입출력 예
    score                                           result
    [[80, 70], [90, 50], [40, 70], [50, 80]]      [1, 2, 4, 3]
    [[80, 70], [70, 80], [30, 50], [90, 100],     [4, 4, 6, 2, 2, 1, 7]
    [100, 90], [100, 100], [10, 30]]

    입출력 예 설명
    입출력 예 #1
    - 평균은 각각 75, 70, 55, 65 이므로 등수를 매겨 [1, 2, 4, 3]을 return합니다.

    입출력 예 #2
    - 평균은 각각 75, 75, 40, 95, 95, 100, 20 이므로 [4, 4, 6, 2, 2, 1, 7] 을 return합니다.
    - 공동 2등이 두 명, 공동 4등이 2명 이므로 3등과 5등은 없습니다.
    */

    public static void main(String[] args) {
        P88_241024_Ranking solution = new P88_241024_Ranking();

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
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
//      int cursor = 0;
        int [][] averageList = new int[score.length][2];
        
        for (int i = 0 ; i < score.length ; i++) {  // 평균 데이터셋 완성
            int average = (score[i][0] + score[i][1]) / 2;
            averageList[i][0] = i; // 인덱스를 저장
            averageList[i][1] = average; // 값을 저장
        }
        Arrays.sort(averageList, (a,b) -> Double.compare(b[1], a[1])); // 내림차순 정렬됨.

        int rank = score.length; // 4 or 7
        int prevRank = rank;
        for (int i = 0; i < averageList.length; i++) {
            int index = averageList[i][0];

            // condition : 이전값과 같으면 같은 rank 를 기록.
            if(!(i == 0) && averageList[i][1] == averageList[i-1][0]) {
                answer[index] = prevRank;
            } else {
                answer[index] = rank;
            }
//            cursor++;
            prevRank = rank;
            rank--;
        }
        
        return answer;
    }
} 
