package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {

	public static void main(String[] args) {

		// 버블정렬
		// 오름차순 정렬

		// 1. 앞에서부터 현재 원소와 바로 다음에 있는 원소 비교
		// 2. 현재 원소가 다음 원소보다 크다면 원소 교환
		// 3. 다음 원소로 이동해서 해당 원소와 그 다음 원소를 비교 반복

		// 배열 선언하기
		int[] array = { 45, 7, 12, 82, 25 };
		System.out.println("정렬 전 : " + Arrays.toString(array));

		// 치환 , 순서를 바꾸려면 공간이 하나 더 필요함!
		int temp = 0; // 치환을 위한 임시 공간 => 0이 아니라 사실상 비어있는 것임

		// 1회차
		// 0과 1 비교 / 1과 2 비교 / 2와 3 비교 / 3과 4 비교 ==> 총 4번
		
		// Q. 중간에 정렬이 완료된 경우 더 이상 정렬을 진행하지 않는 코드 작성하기
		for (int j = 1; j < array.length; j++) {
			boolean sw = false;   // n회차에서 정렬이 한 번이라도 일어나면 true
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sw = true; 
				} // 내림차순이라면 위에 부등호만 바꿔주면 된다
			}
			if(!sw) { // ! --> not
				// sw 가 false일 때만 실행 (즉, n회차에서 한 번도 바뀐 값이 없다는 말)
				break;
			}

			System.out.println(j + "회차 : " + Arrays.toString(array));
		}

		
		// 2회차
		// 0과 1 비교 / 1과 2 비교 / 2와 3 비교 ==> 4번방에는 이미 82이라는 가장 높은 숫자가 와있기에 비교X

//		for (int i = 0; i < 3; i++) {
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//			}
//		}
//
//		System.out.println("2회차 : " + Arrays.toString(array));

	}

}
