package programmers.lessons2;

public class P80_241024_NumberOfCasesOfSharingMarbles {
    /*
    문제 설명
    머쓱이는 구슬을 친구들에게 나누어주려고 합니다. 구슬은 모두 다르게 생겼습니다.
    머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
    balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.

    제한사항
    1 ≤ balls ≤ 30
    1 ≤ share ≤ 30
    구슬을 고르는 순서는 고려하지 않습니다.
    share ≤ balls

    입출력 예
    balls	share	result
    3	    2	    3
    5	    3	    10

    입출력 예 설명
    입출력 예 #1

    서로 다른 구슬 3개 중 2개를 고르는 경우의 수는 3입니다.

    입출력 예 #2

    서로 다른 구슬 5개 중 3개를 고르는 경우의 수는 10입니다.
    Hint
    서로 다른 n개 중 m개를 뽑는 경우의 수 공식은 다음과 같습니다.

    ! -> 팩토리얼ㄹㄴㄷㄹ
    n! / (n-r)! x mｓ

     */

    public static void main (String[] args) {

        int balls = 5;
        int share = 3;
        System.out.println(solution(balls,share)); // 나와야하는 결과값 : 10
        
            }
            
        
            // TODO : GPT 정답 도움 풀이 
        public static long solution(int balls, int share) {
        // 조합 공식을 직접 계산하되, 오버플로우를 방지하기 위해 
            // 분자와 분모를 동시에 나누어가며 계산
            long answer = 1;
            //int denominator = 1;
            
            for(int i = 0; i < share; i++) {
                answer *= (balls - i);
                answer /= (i + 1);
            }
            
            return answer;
    }



// TODO : 초기 나의 풀이 
/*     public int solution(int balls, int share) {
        int answer = 0;
        // info : 팩토리얼 계산로직
        // info : 조합 공식 nCr = n! / r!(n-r)!
        int n = calculateFactorial(balls);
        int r = calculateFactorial(share);
        int Denominator = calculateFactorial(balls - share);
        answer = n / (r * Denominator);

        return answer;
    }

    public static long solution(int balls, int share) {
    // 조합 공식을 직접 계산하되, 오버플로우를 방지하기 위해 
        // 분자와 분모를 동시에 나누어가며 계산
        long answer = 1;
        //int denominator = 1;
        
        for(int i = 0; i < share; i++) {
            answer *= (balls - i);
            answer /= (i + 1);
        }
        
        return answer;

    } */

}
