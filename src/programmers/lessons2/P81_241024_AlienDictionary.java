package programmers.lessons2;

import java.util.Arrays;

public class P81_241024_AlienDictionary {
    /*
    문제 설명
    PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
    알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
    spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 
    존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.

    제한사항
    - spell과 dic의 원소는 알파벳 소문자로만 이루어져있습니다.
    - 2 ≤ spell의 크기 ≤ 10
    - spell의 원소의 길이는 1입니다.
    - 1 ≤ dic의 크기 ≤ 10
    - 1 ≤ dic의 원소의 길이 ≤ 10
    - spell의 원소를 모두 사용해 단어를 만들어야 합니다.
    - spell의 원소를 모두 사용해 만들 수 있는 단어는 dic에 두 개 이상 존재하지 않습니다.
    - dic과 spell 모두 중복된 원소를 갖지 않습니다.

    입출력 예
    spell	                dic	                                    result
    ["p", "o", "s"]	        ["sod", "eocd", "qixm", "adio", "soo"]	2
    ["z", "d", "x"]	        ["def", "dww", "dzx", "loveaw"]	        1
    ["s", "o", "m", "d"]	["moos", "dzx", "smm", "sunmmo", "som"]	2
    */

    public static void main(String[] args) {
        String[] spell1 = {"p", "o", "s"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        
        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        
        System.out.println(solution(spell1, dic1)); // 예상 결과: 2
        System.out.println(solution(spell2, dic2)); // 예상 결과: 1
    }

    public static int solution(String[] spell, String[] dic) {
        // 1. 이중 for 문 이용하지않고, 시간복잡도 최소화 하기위해 Set 해쉬자료구조를 이용한 풀이.
        int answer = 2;
        //Set<String> set = new HashSet<>();

        /* for (String singleSpell : spell) {
            set.add(singleSpell);
        }
 */
        // 2. dic 배열을 순회하며, 해쉬의 원소와 일치하는 문자열이 있는지 확인.
        /* for (String singleDic : dic) {
            if(singleDic.contains(set.toString())) {
                answer = 1;
                break;
            }
        } */

        String target = String.join("",spell);
        char [] targetChars = target.toCharArray(); // char 어레이로 바꾸는이유는 sort 하기위함임.
        Arrays.sort(targetChars);
        String sortedTarget = new String(targetChars);

        for (String singleDic : dic) {
            char [] charArr = singleDic.toCharArray();
            Arrays.sort(charArr);
            if(sortedTarget.equals(new String(charArr))) {
                answer = 1;
                break;
            }
        }   
        return answer;
    }
} 