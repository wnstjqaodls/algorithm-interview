package programmers.lessons2;

public class P67_240801_OrderingCare {
  /*
외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다. 정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.

제한사항
중복된 원소는 없습니다.
1 ≤ emergency의 길이 ≤ 10
1 ≤ emergency의 원소 ≤ 100
   */

  public static void main (String[] args) {
    // 테스트 코드
    System.out.println(solution(new int[30, 10, 23, 6, 100])); // 예상 출력: 37
  }

  public int[] solution(int[] emergency) {
    int lengthOfemergency = emergency.length;
    int[] answer = new int[lengthOfemergency];
    //1. 배열을 정렬한다
    //2. 정렬한 배열중 가장 마지막 인덱스부터 순서를 매긴다.

    //Non- API way
    //1. 제일크다 = 모든 비교를 한후 결과
    //2. 그다음으로 크다 = 제일큰것을 제외한 나머지끼리 비교중 제일큰것을 두번째것으로 .
    //3. 반복

    for (int i=0; i<lengthOfemergency; i++){
      int currNum = emergency[i];
      int cnt = 1;

      for (int j=0; j<lengthOfemergency; j++){
        if(emergency[j] > currNum){
          cnt += 1;
        }
      }

      answer[i] = cnt;



    }
    //제일 큰것을 찾을때 그 큰것의 인덱스와 동일한 위치에 add 하기.

    return answer;
  }
}
