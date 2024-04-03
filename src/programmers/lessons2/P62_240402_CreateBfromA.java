package programmers.lessons2;

import java.util.HashMap;

public class P62_240402_CreateBfromA {
  /*
  문자열 before와 after가 매개변수로 주어질 때,
   before의 순서를 바꾸어 after를 만들 수 있으면 1을,
  만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.

  입출력 예
  before	after	result
  "olleh"	"hello"	1
  "allpe"	"apple"	0

  입출력 예 설명
  입출력 예 #1

  "olleh"의 순서를 바꾸면 "hello"를 만들 수 있습니다.
  입출력 예 #2

  "allpe"의 순서를 바꿔도 "apple"을 만들 수 없습니다.
   */

  public static void main(String[] args) {

    String param1 = "allpe";
    String param2 = "apple";
    String param3 = "olleh";
    String param4 = "hello";
    int result = solution(param3, param4);
    System.out.println(result);
    // 여기에 테스트 코드 작성
  }
  public static int solution(String before, String after) {
    // 1. String 을 Char 배열로 변경
    // 2. before 의 각 Char 의 갯수가 after 의 Char 갯수와 동일한지 반복문 검사
    // 3. 동일하다면 가능한것으로 1을 return 아니라면 0
    // Hint : GPT 질의로 HASH MAP 을이용한 방법 추천받음.
    int answer = 0;
    HashMap<Character , Integer> beforeMap = new HashMap<>();
    HashMap<Character , Integer> afterMap = new HashMap<>();

    for (char cursor : before.toCharArray()) {
      beforeMap.put(cursor, beforeMap.getOrDefault(cursor,0)+1);
    }

    for (char cursor : after.toCharArray()) {
      afterMap.put(cursor, afterMap.getOrDefault(cursor, 0)+1);
    }

    if (beforeMap.equals(afterMap)) {
      answer = 1;
    } else {
      answer = 0;
    }
    return answer;
  }
}
