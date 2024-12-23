package programmers.lessons2;

public class P85_241024_PaperCut {
    /*
    문제 설명
    머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 
    예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
    
    정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 
    return 하도록 solution 함수를 완성해보세요.

    제한사항
    - 0 < M, N < 100
    - 종이를 겹쳐서 자를 수 없습니다.

    입출력 예
    M   N   result
    2   2   3
    2   5   9
    1   1   0

    입출력 예 설명
    입출력 예 #1
    - 본문과 동일합니다.

    입출력 예 #2
    - 가로 2 세로 5인 종이는 가로로 1번 세로로 8번 총 가위질 9번이 필요합니다.

    입출력 예 #3
    - 이미 1 * 1 크기이므로 0을 return 합니다.
    */

    public static void main(String[] args) {
        P85_241024_PaperCut solution = new P85_241024_PaperCut();

        System.out.println("Test Case 1 - Expected: 3");
        System.out.println("Result: " + solution.solution(2, 2));

        System.out.println("\nTest Case 2 - Expected: 9");
        System.out.println("Result: " + solution.solution(2, 5));

        System.out.println("\nTest Case 3 - Expected: 0");
        System.out.println("Result: " + solution.solution(1, 1));
    }

    public int solution(int M, int N) {
        
        // 초기 문제풀이
        /* int answer = 0;
        // 1. M 즉 가로로 자르는 횟수는 1 > M 일때 Count 를 증가시킨
        // 2. M 의 누적값을 저장
        // 3. N 즉 세로로 자르는 횟수는 N-1 번 자르면 된다.
        // 4. 최종 연산 = (N-1) X M 의 Count 값

        int sumOfN = 0;
        int sumOfM = 0;
        for(int i = 1; i < M; i++){
            sumOfM += 1;
        }
        for(int i = 1; i < N; i++){
            sumOfN += 1;
        }
        sumOfN = N-1; // 수식에따라 값 보정
        
        answer = sumOfM * sumOfN;
        return answer; */

        // Help from ChatGPT
        // 이전 코드의문제 
        // 1. 불필요한 변수 사용
        // 2. 불필요한 반복문 사용
        // 3. 로직이 잘못됨.

        // 최적화 풀이 > (m-1) + (n-1)*m 
        // 다른사람들의 풀이 > answer = M*N-1;

        if (M == 1 && N == 1) return 0;
        return (M-1) + (N-1)*M;
    }
} 