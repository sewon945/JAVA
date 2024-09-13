package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array를 선언하세요.
		// 2. 배열 안의 데이터를 모두 입력 받으세요.
		// 3. 입력한 점수를 출력하세요.
		// 4. 최고 점수와 최저 점수를 출력하세요.
		// 5. 점수의 총합과 평균을 출력하세요.

		Scanner sc = new Scanner(System.in);
		// 1. 성적 데이터를 저장할 수 있는 배열 생성
//		int[] array = new int[5];
//		
		// 2. 성적 입력(5개)
//		for(int i = 0; i < array.length; i++){
//		System.out.print((i+1) + "번째 입력 >> ");
//		array[i] = sc.nextInt();
//		}
//		
		// 3. 입력받은 데이터 전부 출력하기
//		System.out.println("입력된 점수 : " + Arrays.toString(array));
//		
		// 4. 최고 점수(max), 최저 점수(min), 총합(sum)을 저장할 수 있는 변수 선언하기
//		int max = 0;
//		int min = 999;  // min은 가장 큰 숫자로 바꿔줘야 한다(점수는 대부분 100점이기에 100으로 선언해도 괜찮음)
//		int sum = 0;
//		double num = 0;
//		
		// 5. 배열 안의 모든 데이터와 max를 비교하면서 최고 점수 구하기
//		for(int i = 0; i < array.length; i++) {
//			if(array[i] > max) {
//				max = array[i];
//			}
//		 
		// 6. 배열 안의 모든 데이터와 min을 비교하면서 최저 점수 구하기
//			if(array[i] < min) {
//				min = array[i];
//			}
//			sum = sum+array[i];
//			num = sum / (double) array.length;
//		}
//		
		// 7. 배열 안의 모든 데이터를 더해서 총합 구하기
//
//		System.out.println("최고 점수 : " + max);
//		System.out.println("최저 점수 : " + min);
//		// 8. 결과값들 출력하기(이때 평균은 소수점이 나올 수 있도록)
//		System.out.println("총합 : " + sum);
//		System.out.println("평균 : " + num);

///////////////////////////////////////////////////////////////////////////////////////		

		// 선생님 풀이

		// Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}
		System.out.println("입력된 점수 : " + Arrays.toString(array));
		int max = 0;
		int min = array[0];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];    //min은 array[0]인 1번방에 있는 숫자이지만
			}                      // 1번방에 있는 숫자를 다시 min에 대입시키기 때문에 값이 나올 수 있음
			sum += array[i]; // 복합대입연산자

		}

		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (float) sum / array.length);
		                            // 소수점이 한자리이기에 float => 강제형변환
		                            // array.length => 내가 가지고 있는 배열의 개수 5

	}

}
