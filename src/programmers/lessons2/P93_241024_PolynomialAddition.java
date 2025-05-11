package programmers.lessons2;

import java.util.Arrays;

public class P93_241024_PolynomialAddition {
    /*
    문제 설명
    한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
    동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.

    같은 식이라면 가장 짧은 수식을 return 합니다.

    제한사항
    - 0 < polynomial에 있는 수 < 100
    - polynomial에 변수는 'x'만 존재합니다.
    - polynomial은 양의 정수, 공백, ‘x’, ‘+'로 이루어져 있습니다.
    - 항과 연산기호 사이에는 항상 공백이 존재합니다.
    - 공백은 연속되지 않으며 시작이나 끝에는 공백이 없습니다.
    - 하나의 항에서 변수가 숫자 앞에 오는 경우는 없습니다.
    - " + 3xx + + x7 + "와 같은 잘못된 입력은 주어지지 않습니다.
    - 0으로 시작하는 수는 없습니다.
    - 문자와 숫자 사이의 곱하기는 생략합니다.
    - polynomial에는 일차 항과 상수항만 존재합니다.
    - 계수 1은 생략합니다.
    - 결괏값에 상수항은 마지막에 둡니다.
    - 0 < polynomial의 길이 < 50

    입출력 예
    polynomial            result
    "3x + 7 + x"          "4x + 7"
    "x + x + x"           "3x"
    */

    public static void main(String[] args) {
        P93_241024_PolynomialAddition solution = new P93_241024_PolynomialAddition();

        // 테스트 케이스
        System.out.println("Test Case 1 - Expected: 4x + 7");
        String result1 = solution.solution("3x + 7 + x");
        System.out.println("Result: " + result1);

        System.out.println("\nTest Case 2 - Expected: 3x");
        String result2 = solution.solution("x + x + x");
        System.out.println("Result: " + result2);
    }

    public String solution(String polynomial) {
        String answer = "";

        // 여기에 풀이 코드를 작성하세요.
        // 1. polynomial 을 split("공백") 하여 배열로 파싱,
        // 2. x char 존재시, 다항식, 없을시 , 상수항으로 판별
        // 3. 다항식은 x앞의 숫자가 있으면 해당숫자 + 다항식 없으면 1로 하여 연산.
        // 4. 다항식연산결과 저장
        // 5. 상수항을 전부 따로 연산
        // 6. 결과값에 다항식합 + 상수항 으로 조합
        String [] parsedPolynomial = polynomial.split("\\+");

        int polynomialSum = 0;
        int constant = 0;

        for ( String curStr : parsedPolynomial ) {
            String curr = curStr.trim();

            if(curr.contains("x")) {
                if(curr.length() == 1) {
                    polynomialSum += 1;
                } else {
                    polynomialSum += Integer.parseInt( curr.substring(0,curr.indexOf("x")) );

                }

            } else {


                constant +=  Integer.parseInt(curr);
            }

        }

        StringBuilder sb = new StringBuilder();
        /*if (polynomialSum > 0) {
            sb.append(polynomialSum);
            sb.append("x");
        }

        if (constant > 0) {
            sb.append(" + ");
            sb.append(constant);
        }*/
        if (polynomialSum != 0) {
            if (polynomialSum == 1) {
                sb.append("x");
            } else {
                sb.append(polynomialSum).append("x");
            }
        }

        if (constant != 0) {
            if (sb.length() > 0) {
                sb.append(" + ");
            }
            sb.append(constant);
        }
        answer = sb.toString();

        return answer;
    }
}
