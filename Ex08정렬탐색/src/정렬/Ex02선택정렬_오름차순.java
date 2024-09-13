package 정렬;

import java.util.Arrays;

public class Ex02선택정렬_오름차순 {

	public static void main(String[] args) {

		int[] array = { 98, 7, 70, 13, 24 };
		System.out.println("정렬 전 : " + Arrays.toString(array));
		int temp = 0; // 자리를 바꿀 숫자를 잠시 담아둘 공간

		int index;
		for (int j = 0; j < 4; j++) {
			index = j;
			for (int i = index + 1; i < 5; i++) {
				if (array[index] > array[i]) {
					index = i;
				}
			}
			temp = array[j];
			array[j] = array[index];
			array[index] = temp;
			System.out.println(j + 1 + "회차 : " + Arrays.toString(array));
		}

		
		
		
		// 1회차
//		int index = 0; // index는 현재 범위(정렬이 안된) 안에서 가장 작은 값의 인덱스를 기억할 변수
//						// 가장 작은 숫자의 방번호를 기억해 둘 공간
//		for (int i = index + 1; i < 5; i++) { // 1번방부터 찾을 것이기 때문에 index+1 ->i는 1이었음
//			if (array[index] > array[i]) {
//				index = i; // 배열 안에서 작은 값의 인덱스로 바꿔줘야 함!
//							// 번호만 기억하기 위해 array는 빼고 대입
//			}
//		}
//		// 자리를 바꾸는 건 가장 마지막에 진행!
//		temp = array[0];
//		array[0] = array[index]; // 가장 작은 숫자를 0번방으로
//		array[index] = temp; // 원래의 0번방에 있던 숫자를 index방으로 옮기기
//		System.out.println("1회차 : " + Arrays.toString(array));

		
		
		
		// 2회차
//		index = 1;
//		for(int i = index+1; i < 5; i++) {
//			if(array[index] > array[i]) {
//				index = i; // 배열 안에서 두 번째 작은 숫자의 인덱스로 바꿔주는 것!
//			}
//		}
//		
//		// 자리 바꾸기
//		temp = array[1];
//		array[1] = array[index]; // 두 번째로 작은 숫자를 1번방으로
//		array[index] = temp; // 원래 1번방에 있던 숫자를 index로 옮긴것
//		System.out.println("2회차 : " + Arrays.toString(array));

	}

}
