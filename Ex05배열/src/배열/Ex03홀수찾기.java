package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array를 선언
		// --> 5칸 짜리 0~4번까지의 배열 선언
		int[] array = new int[5];

		// 2. 랜덤한 값으로 배열 초기화(1~100)
		Random ran = new Random();
        // array(0~4번방)에 랜덤한 숫자 아무거나 넣기(ex) 5, 13, 20, 24, 31)
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(100) + 1;
		}
		// 3. 배열 안의 데이터 중 홀수의 값만 출력하고, 총 몇 개인지 출력
		// array에 들어있는 홀수는 53 39 5 이며,
		// 총3개 입니다.

		// 배열 안에 있는 모든 데이터 출력하기
		// Arrays.toString(배열명)
		System.out.println(Arrays.toString(array));

		System.out.print("array에 들어있는 홀수는 ");
		int count = 0; // count = 0
		for (int i = 0; i < array.length; i++) {    // i = 0 ; 0 < 5
			if (array[i] % 2 == 1) {                // 5 % 2 == 1 (참)
				System.out.print(array[i] + " ");   // 5" "
				count++;
			}
		}

		System.out.println("이며,");
		System.out.println("총 " + count + "개 입니다.");

	}

}
