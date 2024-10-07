package programmers.lessons2;

public class P74_241006_BinaryPlus {
    /*
     *문제 설명
    이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
    두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
     *
    제한사항
    return 값은 이진수를 의미하는 문자열입니다.
    1 ≤ bin1, bin2의 길이 ≤ 10
    bin1과 bin2는 0과 1로만 이루어져 있습니다.
    bin1과 bin2는 "0"을 제외하고 0으로 시작하지 않습니다.
     *
     *
    입출력 예
    bin1	bin2	result
    "10"	"11"	"101"
    "1001"	"1111"	"11000"

*
    입출력 예 설명
    입출력 예 #1
    10 + 11 = 101 이므로 "101" 을 return합니다.
    *
    입출력 예 #2
    1001 + 1111 = 11000 이므로 "11000"을 return합니다.
    * 1001
    * 1111
    *11000
     */

    public static void main (String[] args) {

        String param1 = "10";
        String param2 = "11";
        System.out.println(solution(param1,param2));  // 예상 출력: 101가 나와야함
        System.out.println(solution("1001", "1111")); // 결과: "11000"
    }


    public static String solution(String bin1, String bin2) {
        String answer = "";
        // 방법1 : 2진수를 10진수로 변경후 모두더한후 다시 2진수로 변경하여 리턴? > 10진수를 2진수로 바꾸는 메서드작성
        // 방법2 : String 을 배열로 바꾸고 각 이진수끼리 비교하여 둘다 1이라면 앞자리에1을 놓음.
        // 또다시 같은 인덱스의 이진수끼리 비교. > 둘다1이면 그앞의자리에 1로놓기.

        // 사용될만한 연산자
        /*
        << : 피연산자의 비트열을 왼쪽으로 이동시키며 이동에 따른 빈공간은 0으로 채움.
        >> : 피연산자의 비트열을 오른쪽으로 이동시키며, 이동에 따른 빈공간은 음수의경우엔 1, 양수의 경우엔 0으로 채움.
        >>> : 피연산자의 비트열을 오른쪽으로 이동시키며, 이동에 따른 빈공간은 0으로 채움.
        */
        int maxLength = Math.max(bin1.length(), bin2.length());
//        bin1 = String.format("%"+ maxLength + "s", bin1).replace(' ','0');
//        bin2 = String.format("%"+ maxLength + "s", bin2).replace(' ','0');
        while (bin1.length() < maxLength) bin1 = "0" + bin1;
        while (bin2.length() < maxLength) bin2 = "0" + bin2;

        StringBuilder sb = new StringBuilder();
        // fixme 놓친것 1 : 두 이진수 문자열의 길이를 맞춰줌
        // fixme 놓친것 2 : 덧셈에서 자리올림 carry 변수 활용
        // fixme 놓친것 3 : 오른쪽에서 왼쪽으로 순회하면서 덧셈 수행
        int carry = 0;

        for (int i = maxLength-1; i >= 0 ; i--) {
            int bit1 = bin1.charAt(i) - '0'; // bin1의 현재 비트
            int bit2 = bin2.charAt(i) - '0'; // bin2의 현재 비트

            //현재 자리의 합계와 캐리 계산
            int sum = bit1 + bit2 + carry;
//            sb.append(sum % 2); // 현재 자리의 결과 비트 0 또는 1
            sb.insert(0, sum % 2); // 현재 자리의 결과 비트 (0 또는 1)을 맨 앞에 추가
            carry = sum / 2; // 다음 자리로 넘길 캐리 값
        }

        if (carry != 0) {
            sb.insert(0, carry);
        }
        /* info : 내가풀이 시도했던 방식
        for (int i = bin1array.length-1; i <= lastPointer; i--) { //revers 로 배열을시작
            for (int j = bin2array.length-1; j <= j-1 ; j--) {

                if(bin1array[i] == '1' && bin2array[j] == '1'){
                    sb.append("0");
                } else {
                    sb.append((bin1array[i] - '0') + (bin2array[j] - '0'));
                }
            }
        }*/

        answer = sb.toString();
        return answer;
    }
}
