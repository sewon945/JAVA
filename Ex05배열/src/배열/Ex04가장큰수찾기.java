package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array를 선언하세요
		// 2. 배열 안의 모든 데이터를 임의의 값으로 초기화하세요(1~10까지의 수)
		// 3. 배열 안의 데이터 중 가장 큰 값을 출력하세요
		// 배열 안에 들어있는 값 : [5, 3, 2, 10, 3]
		// 가장 큰 값은 10입니다.

		// 1. 정수형 테이터 5개를 저장하는 배열 선언
		// (0~4번방까지 array가 들어갈 수 있는 공간 만든 것임)
		int[] array = new int[5];

		// 2. 랜덤한 숫자로 배열 초기화하기(1~10)
		Random ran = new Random();
		for (int i = 0; i < array.length; i++) { // array.length은 위의 숫자 5와 같은 말임
			array[i] = ran.nextInt(10) + 1;
		}
		
		// 3. 가장 큰 수를 저장할 수 있는 변수 max 선언
		int max = 0;
		for (int i = 0; i < array.length; i++) { // array.length은 위의 숫자 5와 같은 말임

			// 4. max와 배열 안에 들어있는 값 비교하기(0번 인덱스부터 차근차근)
			if (array[i] > max) {

				// 5. 만약 배열 안에 들어있는 값이 max 보다 크다면
				// max를 배열 안에 들어있는 값으로 변경하기
				max = array[i]; // array[i]가 5이면 max에 5의 값을 넣어주겠다는 말
			}

		}

		// 6. 배열 안의 모든 데이터 출력하기
		// >> Arrays.toString(배열명) 사용하기!!
		System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(array));

		// 7. 가장 큰 값 출력하기

		System.out.println("가장 큰 값은 " + max + "입니다.");

	}

}
