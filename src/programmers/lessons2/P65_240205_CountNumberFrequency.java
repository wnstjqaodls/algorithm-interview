package programmers.lessons2;

public class P65_240205_CountNumberFrequency {
  /*
   * 팩토리얼의 끝자리 0의 개수를 반환하는 문제입니다.
   * 예를 들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 따라서 n에 주어진 대로 끝자리 0의 개수를 가진 결과를 리턴하는 solution 함수를 완성해주세요.
   *
   * 제한사항
   * 1 ≤ n ≤ 3,628,800
   *
   * 입출력 예
   * n       result
   * 3628800    10
   * 7          3
   *
   * 입출력 예 설명
   * 입출력 예 #1
   * 10! = 3,628,800으로 끝자리에 0은 10개 입니다.
   *
   * 입출력 예 #2
   * 3! = 6, 4! = 24입니다. n이 7이므로, 7이하의 팩토리얼 중 3은 3개의 0을 리턴합니다.
   */

  public static void main(String[] args) {
    // 테스트 코드
    System.out.println(solution(3628800)); // 양식에 맞게 결과를 확인하기 위한 출력문
    System.out.println(solution(7)); // 양식에 맞게 결과를 확인하기 위한 출력문
  }

  public static int solution(int n) {
    int answer = 0;

    // 여기에 로직을 구현해주세요.
    // 1. n의 팩토리얼을 계산합니다.

    // 2. 계산된 결과의 끝자리 0의 개수를 세어 answer에 할당합니다.

    return answer; // 계산된 끝자리 0의 개수를 반환합니다.
  }
}
