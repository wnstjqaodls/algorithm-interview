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
        // 여기에 코드를 작성하세요
        // 1. n이 3의 배수이면 즉 % 3 == 0 이면 , n ..?
        // 2. 만약n 이  3이면 4, 6이면 8 임, 9면 14 임
        // 3. 1..2..5 씩증가 , 15일때 25라고했으니
        // 반복문도중 , 다음 i 가 3의 배수이면   

        // 40을 3으로 나누면 13.333333333333334 이 나오는데 그런데 리턴값은 76이 나온다. 
        // 무슨규칙이 있는거지?
        
        // 이전숫자를 기억할 변수하나놓고..
        // info : 초기 풀이 실패 
        int before = 0;
        for(int i = 1; i <= n; i++){
            before += 1; // 우선 증가.

            if(before % 3 == 0){ // 3의 배수이면 한번더 증가
                before += 1;
            }
        }

        // fixme : 실수원인 > 3의 배수만을 고려했음, 3이 포함된 숫자도 포함해야하는데 << 
        // fixme : 실수원인2 > 3이 연속된경우의 처리를 고려못함 > 23 은 3포함 , 24는 3의배수 ..
        int number = 0;
        for(int i = 1; i <= n; i++){
            number += 1; // 우선 증가.

            while(number % 3 == 0 || String.valueOf(number).contains("3")){
                number += 1;
            }
        }

        return number;
    }
} 