package programmers.lessons2;

import java.util.HashMap;
import java.util.Map;

public class P63_240402_DecodeMorseCode {
  /*
   * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
   * 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
   * 모스부호는 다음과 같습니다.
   *
   * morse = {
   * '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
   * '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
   * '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
   * '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
   * '-.--':'y','--..':'z'
   * }
   *
   * 제한사항
   * 1 ≤ letter의 길이 ≤ 1,000
   * return값은 소문자입니다.
   * letter의 모스부호는 공백으로 나누어져 있습니다.
   * letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
   * 해독할 수 없는 편지는 주어지지 않습니다.
   * 편지의 시작과 끝에는 공백이 없습니다.
   *
   * 입출력 예
   * letter              result
   * ".... . .-.. .-.. ---"     "hello"
   * ".--. -.-- - .... --- -."      "python"
   */

  public static void main(String[] args) {
    // 여기에 테스트 코드 작성
    HashMap<String, String> morse = (HashMap <String, String>) generateMorse();
    String param1 = ".--. -.-- - .... --- -.";
    String result = solution(morse,param1);
    System.out.println(result);





  }

  public static String solution(HashMap <String, String> morse ,String letter) {
    // 코드 작성
    // 1. 우선 해독할문자를 공백기준으로 분리한다. (split)
    // 2. 모스부호의 모든 key 를 순회하면서 해당 key와 동일한 부호가있다면 value 를 sb에 붙인다.
    StringBuilder result = new StringBuilder();
    String [] letters = letter.split(" ");

    for (String curLetter : letters) {

      for (String key : morse.keySet()) {

        if (curLetter.equals(key)) {
          result.append(morse.get(key));
        }
      }

    }

    return result.toString(); // 임시 반환 값 - 수정 필요
  }

  private static Map<String,String> generateMorse () {
    Map <String, String> morse = new HashMap <>();
    morse.put(".-", "a");
    morse.put("-...", "b");
    morse.put("-.-.", "c");
    morse.put("-..", "d");
    morse.put(".", "e");
    morse.put("..-.", "f");
    morse.put("--.", "g");
    morse.put("....", "h");
    morse.put("..", "i");
    morse.put(".---", "j");
    morse.put("-.-", "k");
    morse.put(".-..", "l");
    morse.put("--", "m");
    morse.put("-.", "n");
    morse.put("---", "o");
    morse.put(".--.", "p");
    morse.put("--.-", "q");
    morse.put(".-.", "r");
    morse.put("...", "s");
    morse.put("-", "t");
    morse.put("..-", "u");
    morse.put("...-", "v");
    morse.put(".--", "w");
    morse.put("-..-", "x");
    morse.put("-.--", "y");
    morse.put("--..", "z");

    return morse;
  }


}
