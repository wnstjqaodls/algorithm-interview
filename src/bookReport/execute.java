package bookReport;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

public class execute {
  public static void main(String[] args) {
    // 원시 데이터 타입 배열
    int[] numbers = {1, 2, 3, 4, 5};

    // 향상된 for 문을 사용하여 배열 요소 출력 및 변경 시도
    for (int number : numbers) {
      System.out.print(number + " ");  // 변경 전의 숫자 출력
      number = number * 10;  // 배열의 요소 값을 변경하려고 시도 (실제로는 변경되지 않음)
    }
    System.out.println();  // 줄 바꿈

    // 실제 배열의 요소를 출력하여 확인
    for (int number : numbers) {
      System.out.print(number + " ");  // 변경되지 않은 원본 배열 요소 출력
    }
    System.out.println();  // 줄 바꿈

    int number = 9;
    switch (number) {
      case 9:
        System.out.println("Number is 9");
        // break를 생략하여 다음 case로 진행
      case 10:
        System.out.println("Or number is 10");
      default:
        System.out.println("Or some other number");
    }
  }




}
