package programmers.lessons2;

public class P76_241011_ThrowingBall {
    /*
     *문제 설명
    머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
    *  공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다. 친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
    *  k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.

     *
    제한사항
    2 < numbers의 길이 < 100
    0 < k < 1,000
    numbers의 첫 번째와 마지막 번호는 실제로 바로 옆에 있습니다.
    numbers는 1부터 시작하며 번호는 순서대로 올라갑니다.
     *
     *
   입출력 예
    numbers	            k	result
    [1, 2, 3, 4]	    2	3
    [1, 2, 3, 4, 5, 6]	5	3
    [1, 2, 3]	        3	2
    입출력 예 설명
    입출력 예 #1

    1번은 첫 번째로 3번에게 공을 던집니다.
    3번은 두 번째로 1번에게 공을 던집니다.
    입출력 예 #2

    1번은 첫 번째로 3번에게 공을 던집니다.
    3번은 두 번째로 5번에게 공을 던집니다.
    5번은 세 번째로 1번에게 공을 던집니다.
    1번은 네 번째로 3번에게 공을 던집니다.
    3번은 다섯 번째로 5번에게 공을 던집니다.
    입출력 예 #3

    1번은 첫 번째로 3번에게 공을 던집니다.
    3번은 두 번째로 2번에게 공을 던집니다.
    2번은 세 번째로 1번에게 공을 던집니다.
    ※ 공지 - 2023년 1월 25일 테스트 케이스가 추가되었습니다. 기존에 제출한 코드가 통과하지 못할 수도 있습니다.
     */

    public static void main (String[] args) {

        int [] param1 = {1,2,3,4,5,6};
        int param2 = 5;

            System.out.println(solution(param1,param2)); // 나와야하는 결과값 : 3

    }


    public static int solution(int[] numbers, int k) {
        // 커서를 활용한 반복문 풀이
        int answer = 0;
        int cursor = 0;
        int numbersLength = numbers.length; // 6
        int roofCount = 1;
        // 조건식은 > 3 + 2k  => 로 계산.

        // fixme : 나의풀이 > 실패
        /*for (int i = 0; i < 3 + 2*k; i+=2) {
            cursor = i;

            // info : 길이 초과시 커서를 1로 초기화.
            if (i + 2 > numbersLength ) {
                i = 0;
            }
            if (roofCount == k) {
                answer = numbers[i];
                break;
            }
            // info : 종결조건 변수사용
            roofCount += 1;

        }
*/

        // 공을 k번째로 던지기 위한 반복문
        for (int i = 1; i < k; i++) {
            // 한 명을 건너뛰는 규칙: 두 칸씩 이동
            cursor = (cursor + 2) % numbers.length;
        }

        // k번째 던진 사람의 번호를 반환
        answer = numbers[cursor];

        return answer;
    }
}
