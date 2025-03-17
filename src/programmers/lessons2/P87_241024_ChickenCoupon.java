package programmers.lessons2;

public class P87_241024_ChickenCoupon {
    /*
    문제 설명
    프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 
    쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 
    시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 
    return하도록 solution 함수를 완성해주세요.

    제한사항
    - chicken은 정수입니다.
    - 0 ≤ chicken ≤ 1,000,000

    입출력 예
    chicken     result
    100        11
    1,081      120

    입출력 예 설명
    입출력 예 #1
    - 100마리를 주문하면 쿠폰이 100장 발급되므로 서비스 치킨 10마리를 주문할 수 있습니다.
    - 10마리를 주문하면 쿠폰이 10장 발급되므로 서비스 치킨 1마리를 주문할 수 있습니다.
    - 따라서 10 + 1 = 11 을 return합니다.

    입출력 예 #2
    - 1081마리를 주문하면 쿠폰이 1081장 발급되므로 서비스 치킨 108마리를 주문할 수 있습니다. 
      그리고 쿠폰이 1장 남습니다.
    - 108마리를 주문하면 쿠폰이 108장 발급되므로 서비스 치킨 10마리를 주문할 수 있습니다. 
      그리고 쿠폰이 8장 남습니다.
    - 10마리를 주문하면 쿠폰이 10장 발급되므로 서비스 치킨 1마리를 주문할 수 있습니다.
    - 1마리를 주문하면 쿠폰이 1장 발급됩니다.
    - 가지고 있는 쿠폰이 총 10장이므로 서비스 치킨 1마리를 추가로 주문할 수 있습니다.
    - 따라서 108 + 10 + 1 + 1 = 120 을 return합니다.
    */

    public static void main(String[] args) {
        P87_241024_ChickenCoupon solution = new P87_241024_ChickenCoupon();

        System.out.println("Test Case 1 - Expected: 11");
        System.out.println("Result: " + solution.solution(100));

        System.out.println("\nTest Case 2 - Expected: 120");
        System.out.println("Result: " + solution.solution(1081));
    }

    public int solution(int chicken) {
        int answer = 0;

        // 쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다.
        // 1. 치킨의 수가 파라미터로 오는데, for 문을 돌며  10으로 나눈다.
        // 2. 그리고 몫이 10 이상이라면 , 또 10으로 나눈다. 이 과정을 몫이 10 미만이 될때까지 반복한다. 

        return answer;
    }
} 