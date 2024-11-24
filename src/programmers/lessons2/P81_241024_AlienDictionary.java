package programmers.lessons2;

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
        int answer = 2; // 기본값을 2로 설정 (찾지 못한 경우)
        
        // dic의 각 단어를 확인
        for (String word : dic) {
            boolean isValid = true;
            
            // spell의 각 문자가 word에 정확히 한 번씩 포함되어 있는지 확인
            for (String s : spell) {
                if (word.length() != spell.length || 
                    word.indexOf(s) == -1 || 
                    word.chars().filter(ch -> ch == s.charAt(0)).count() != 1) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
} 