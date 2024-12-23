package programmers.lessons2;

public class P86_241024_CursedNumber3 {
    /*
    문제 설명
    3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다.
    3x 마을 사람들의 숫자는 다음과 같습니다.

    10진법     3x 마을에서 쓰는 숫자
    1         1
    2         2
    3         4
    4         5
    5         7
    6         8
    7         10
    8         11
    9         14
    10        16

    정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 
    solution 함수를 완성해주세요.

    제한사항
    - 1 ≤ n ≤ 100

    입출력 예
    n   result
    15  25
    40  76

    입출력 예 설명
    입출력 예 #1
    - 15를 3x 마을의 숫자로 변환하면 25입니다.

    입출력 예 #2
    - 40을 3x 마을의 숫자로 변환하면 76입니다.
    */

    public static void main(String[] args) {
        P86_241024_CursedNumber3 solution = new P86_241024_CursedNumber3();

        System.out.println("Test Case 1 - Expected: 25");
        System.out.println("Result: " + solution.solution(15));

        System.out.println("\nTest Case 2 - Expected: 76");
        System.out.println("Result: " + solution.solution(40));
    }

    public int solution(int n) {
        int answer = 0;
        return answer;
    }
} 