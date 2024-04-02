package programmers.lessons2;

public class P60_240205_RemoveDuplicateCharacters {
	/*
		문자열 my_string 매개변수로 주어집니다.
		my_string 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
	 *
	 * 입출력 예
		my_string	result
		"people"	"peol"
		"We are the world"	"We arthwold"
	 */

  public static void main(String[] args) {

    String param = "We are the world";
    String result;

    result = solution(param);
    System.out.println(result);

  }

  public static String solution(String my_string) {
    StringBuilder result = new StringBuilder();
    // 1. 스트링을 모두 char 배열로 변환한다

    // 2. 중복된 for 문으로 하나의 i 에 대해 j 를 반복하여 만약 존재한다면 넣지말고

    // 3. 존재하지 않는다면 String builder 에 push 한다.
    char[] charArr = my_string.toCharArray();

    /*for (int i = 0; i < charArr.length; i++) {
      boolean flag = false;
      int currChar = charArr[i];

      for (int j = i; j < charArr.length; j++) {
        int innerChar = charArr[j];
        // 아래조건은 문제가있음 : 항상 i == j 일때 true 가 되므로
        // 모든 문자가 중복으로 판단되어서 문자열에 추가가 안되게됨.
        if (currChar == innerChar) {
          flag = true;
          break;
        }

      }
      if (flag == false) {
        result.append(charArr[i]);
      }
    }
    */

    for (int i = 0; i < charArr.length; i++) {
      char currChar = charArr[i];
      // 현재 문자가 문자열 내에서 처음으로 등장하는 위치 찾음
      if (my_string.indexOf(currChar) == i) {
        // 해당 문자 인덱스가 현재 인덱스랑 같으면 중복되지않은것임.
        result.append(currChar);
      }
    }


    return result.toString();
  }

}

