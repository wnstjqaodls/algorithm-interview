package programmers.lessons;

import java.util.Arrays;

public class Q_CalcMedianWithQuickSort {

	public static void main(String[] args) {
		int result;
		int[] num1 = { 1, 2, 7, 10, 11 };
		int[] num2 = { 9, -1, 0 };

		result = solution(num2);
		System.out.println(result);

	}

	/*
	 * 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미합니다. 예를 들어 1, 2, 7, 10,
	 * 11의 중앙값은 7입니다. 정수 배열 array가 매개변수로 주어질 때, 중앙값을 return 하도록 solution 함수를
	 * 완성해보세요.
	 */
	public static int solution(int[] array) {
		int answer = 0;
		// Arrays.sort(array); 정렬 API 사용불가로 직접 버블 sort 구현

		/*
		 * int middleValueIdx = array.length / 2;
		 * 
		 * if( array.length % 2 == 0){ return array[0]; //원소가 하나인경우 } else {
		 * answer = array[middleValueIdx]; }
		 * 
		 * 
		 * return answer;
		 */

		quickSort(array, 0, array.length - 1);
		int middleIndex = array.length / 2;
		return array[middleIndex];

	}

	/**
	 * @시간복잡도 O(N * logN)
	 * @param array
	 * @param start
	 * @param end
	 */
	public static void quickSort(int[] array, int start, int end) {
		if (start < end) { // 배열크기 1보다 큰경우만..
			int partitionIndex = partition(array, start, end);
			quickSort(array, start, partitionIndex - 1);
			quickSort(array, partitionIndex + 1, end);

		}
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[end]; // 1. 기준되는 피봇값
		int i = (start -1); // 2. i 는 분할 인덱스임
		
		for (int j = start; j < end; j++) {
			if(array[j] <= pivot){ // 3 피벗보다 작거나 같은 요소찾기
				i++; // 분할 인덱스 증가
				
				// 4. array [i] 와 array[j] 교환
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		// array
		
		
		return 0;
	}

}
