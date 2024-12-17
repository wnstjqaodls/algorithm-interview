package programmers.lessons2;

public class P83_241024_RectangleArea {
    /*
    문제 설명
    2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다. 
    직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가 담겨있는 배열 dots가 
    매개변수로 주어질 때, 직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.

    제한사항
    - dots의 길이 = 4
    - dots의 원소의 길이 = 2
    - -256 < dots[i]의 원소 < 256
    - 잘못된 입력은 주어지지 않습니다.

    입출력 예
    dots                                          result
    [[1, 1], [2, 1], [2, 2], [1, 2]]            1
    [[-1, -1], [1, 1], [1, -1], [-1, 1]]        4
    */

    public static void main(String[] args) {
        P83_241024_RectangleArea solution = new P83_241024_RectangleArea();

        int[][] dots1 = {{1, 1}, {2, 1}, {2, 2}, {1, 2}};
        System.out.println("Test Case 1 - Expected: 1");
        System.out.println("Result: " + solution.solution(dots1));

        int[][] dots2 = {{-1, -1}, {1, 1}, {1, -1}, {-1, 1}};
        System.out.println("\nTest Case 2 - Expected: 4");
        System.out.println("Result: " + solution.solution(dots2));
    }

    public int solution(int[][] dots) {
        // 좌표를 어떻게 자료구조로 나타내어야 할까..? > 2차원 배열 그대로 사용가능하기때문에 고려할필요 X

        // x 좌표의 최대값과 최소값을 구하고, y 좌표의 최대값과 최소값을 구한다,
        // x 좌표의 값의 차이 와 y 좌표의 값의 차이를 구한다.
        // 두 값을 곱하면 직사각형의 넓이가 나온다.

        // 초기 값 설정
        int maxX = dots[0][0];
        int minX = dots[0][0];
        int maxY = dots[0][1];
        int minY = dots[0][1];

        for (int i = 1; dots.length > i; i++) {
            if (dots[i][0] > maxX) {
                maxX = dots[i][0];
            } 
            if (dots[i][0] < minX){
                minX = dots[i][0];
            }
            if (dots[i][1] > maxY){
                maxY = dots[i][1];
            }
            if (dots[i][1] < minY){
                minY = dots[i][1];
            }
        }

        return (maxX - minX) * (maxY - minY);
    }
} 