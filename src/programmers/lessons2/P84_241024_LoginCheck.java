package programmers.lessons2;

public class P84_241024_LoginCheck {
    /*
    문제 설명
    머쓱이는 프로그래머스에 로그인하려고 합니다. 
    머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때, 
    다음과 같이 로그인 성공, 실패에 따른 메시지를 return하도록 solution 함수를 완성해주세요.

    - 아이디와 비밀번호가 모두 일치하는 회원정보가 있으면 "login"을 return합니다.
    - 로그인이 실패했을 때 아이디가 일치하는 회원이 없다면 "fail"를,
      아이디는 일치하지만 비밀번호가 일치하는 회원이 없다면 "wrong pw"를 return 합니다.

    제한사항
    - 회원들의 아이디는 문자열입니다.
    - 회원들의 아이디는 알파벳 소문자와 숫자로만 이루어져 있습니다.
    - 회원들의 패스워드는 숫자로 구성된 문자열입니다.
    - 회원들의 비밀번호는 같을 수 있지만 아이디는 같을 수 없습니다.
    - id_pw의 길이는 2입니다.
    - id_pw와 db의 원소는 [아이디, 패스워드] 형태입니다.
    - 1 ≤ 아이디의 길이 ≤ 15
    - 1 ≤ 비밀번호의 길이 ≤ 6
    - 1 ≤ db의 길이 ≤ 10
    - db의 원소의 길이는 2입니다.

    입출력 예
    id_pw                       db                                                                              result
    ["meosseugi", "1234"]      [["rardss", "123"], ["yyoom", "1234"], ["meosseugi", "1234"]]                 "login"
    ["programmer01", "15789"]   [["programmer02", "111111"], ["programmer00", "134"], ["programmer01", "1145"]] "wrong pw"
    ["rabbit04", "98761"]      [["jaja11", "98761"], ["krong0313", "29440"], ["rabbit00", "111333"]]         "fail"
    */

    public static void main(String[] args) {
        P84_241024_LoginCheck solution = new P84_241024_LoginCheck();

        String[] id_pw1 = {"meosseugi", "1234"};
        String[][] db1 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println("Test Case 1 - Expected: login");
        System.out.println("Result: " + solution.solution(id_pw1, db1));

        String[] id_pw2 = {"programmer01", "15789"};
        String[][] db2 = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
        System.out.println("\nTest Case 2 - Expected: wrong pw");
        System.out.println("Result: " + solution.solution(id_pw2, db2));

        String[] id_pw3 = {"rabbit04", "98761"};
        String[][] db3 = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        System.out.println("\nTest Case 3 - Expected: fail");
        System.out.println("Result: " + solution.solution(id_pw3, db3));
    }

    public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        // 여기에 코드를 작성하세요
        // 1. String 배열을 받아서, 우선 아이디가 일치하는 회원이 있는지 2차원배열의 [i][0] 과 비교한다.
        // 1.1 아이디가 일치하는 회원이 없으면 "fail"을 반환한다.
        // 2. 아이디가 일치하는 회원이 있으면 비밀번호가 일치하는지 비교한다.
        // 3. 비밀번호까지 일치하면 "login"을 반환한다.
        // 4. 비밀번호가 일치하지 않으면 "wrong pw"를 반환한다.

        for (int i=0; db.length > i; i++ ){
            if(id_pw[0].equals(db[i][0])){
                if(id_pw[1].equals(db[i][1])) {
                    answer = "login";
                    
                } else {
                    answer = "wrong pw";
                    break;
                }
            }
        }

        return answer.isEmpty() ? "fail" : answer;
    }
} 
