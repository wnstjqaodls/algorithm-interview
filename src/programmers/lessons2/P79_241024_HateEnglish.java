package programmers.lessons2;

import java.util.HashMap;

public class P79_241024_HateEnglish {
    /*
    문제 설명
    영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.

   제한사항
    numbers는 소문자로만 구성되어 있습니다.
    numbers는 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" 들이 공백 없이 조합되어 있습니다.
    1 ≤ numbers의 길이 ≤ 50
    "zero"는 numbers의 맨 앞에 올 수 없습니다.

    입출력 예
    numbers	result
    "onetwothreefourfivesixseveneightnine"	123456789
    "onefourzerosixseven"	14067

    입출력 예 설명
    입출력 예 #1

    "onetwothreefourfivesixseveneightnine"를 숫자로 바꾼 123456789를 return합니다.
    입출력 예 #1

    "onefourzerosixseven"를 숫자로 바꾼 14067를 return합니다.
     */

    public static void main (String[] args) {


        String param = new String("onetwothreefourfivesixseveneightnine");
        String param2 = new String("onefourzerosixseven");

            System.out.println(solution(param)); // 나와야하는 결과값 : 123456789
            System.out.println(solution(param2)); // 나와야하는 결과값 :  14067

    }


    public static long solution(String numbers) {
        long answer = 0;

        // info : 전략 .. > 영어를 Hash Map 데이터에 key : value로 저장한 후
        // info : String 을 순회하며 contains 포함되어있다면 Builder 를 이용해 스트링을 조합한다.
        // info : 마지막으로 Integer 클래스로 파싱한다

        HashMap<String,String> storedNumber = new HashMap<String,String>();
        storedNumber.put("zero","0");
        storedNumber.put("one","1");
        storedNumber.put("two","2");
        storedNumber.put("three","3");
        storedNumber.put("four","4");
        storedNumber.put("five","5");
        storedNumber.put("six","6");
        storedNumber.put("seven","7");
        storedNumber.put("eight","8");
        storedNumber.put("nine","9");

        StringBuilder sb = new StringBuilder();

        // fixme : 막히는부분 > 특정 문자열을 split 하는부분이 시간걸림.

        int i = 0;
        while(i < numbers.length()) {
            for(String key : storedNumber.keySet()){

                if (numbers.startsWith(key,i)) {
                    sb.append(storedNumber.get(key));
                    i += key.length(); // note : 일치하는 단어의 길이만큼 이동함.
                    break; // 다음 반복문으로 이동
                }

            }
        }
        answer = Long.parseLong(sb.toString());

        return answer;
    }
}
