package programmers.lessons2;

import java.util.ArrayList;
import java.util.Arrays;

public class P92_241024_SpecialSort {
    /*
    문제 설명
    정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 
    이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다. 
    정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 
    n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.

    제한사항
    - 1 ≤ n ≤ 10,000
    - 1 ≤ numlist의 원소 ≤ 10,000
    - 1 ≤ numlist의 길이 ≤ 100
    - numlist는 중복된 원소를 갖지 않습니다.

    입출력 예
    numlist                             n       result
    [1, 2, 3, 4, 5, 6]                 4       [4, 5, 3, 6, 2, 1]
    [10000,20,36,47,40,6,10,7000]      30      [36, 40, 20, 47, 10, 6, 7000, 10000]

    입출력 예 설명
    입출력 예 #1
    4에서 가까운 순으로 [4, 5, 3, 6, 2, 1]을 return합니다.
    3과 5는 거리가 같으므로 더 큰 5가 앞에 와야 합니다.
    2와 6은 거리가 같으므로 더 큰 6이 앞에 와야 합니다.

    입출력 예 #2
    30에서 가까운 순으로 [36, 40, 20, 47, 10, 6, 7000, 10000]을 return합니다.
    20과 40은 거리가 같으므로 더 큰 40이 앞에 와야 합니다.
    */

    public static void main(String[] args) {
        P92_241024_SpecialSort solution = new P92_241024_SpecialSort();

        System.out.println("Test Case 1 - Expected: [4, 5, 3, 6, 2, 1]");
        int[] numlist1 = {1, 2, 3, 4, 5, 6};
        printArray(solution.solution(numlist1, 4));

        System.out.println("\nTest Case 2 - Expected: [36, 40, 20, 47, 10, 6, 7000, 10000]");
        int[] numlist2 = {10000, 20, 36, 47, 40, 6, 10, 7000};
        printArray(solution.solution(numlist2, 30));
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        int [][] tempArr = new int[numlist.length][2];

        // 1. 2차원 배열이용, 거리와 값 저장
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i][0] = Math.abs(numlist[i] - n); // 거리
            tempArr[i][1] = numlist[i]; // 값
        }

        // 2. 버블정렬 이용하여, 넣기. 이중for문
        for (int i = 0; i < numlist.length-1; i++) {
            for (int j = 0; j < numlist.length-1; j++) {
                boolean swap = false;


                // 거리비교
                if(tempArr[j][0] > tempArr[j+1][0]) {
                    swap = true;
                }

                // 거리같은경우 값 비교 (더큰 값이 앞으로)
                else if(tempArr[j][0] == tempArr[j+1][0]) {
                    if (tempArr[j][1] < tempArr[j+1][1]) {
                        swap = true;
                    }
                }

                if(swap) {
                    int [] tmp = tempArr[j];
                    tempArr[j] = tempArr[j+1];
                    tempArr[j+1] = tmp;

                }

            }
        }

        for (int i = 0; i < answer.length; i++) {
            // 값만 집어넣음.
            answer[i] = tempArr[i][1];
        }


        return answer;
    }
}
