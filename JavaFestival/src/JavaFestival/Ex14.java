package JavaFestival;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		// 정수 N을 입력받아 N*N 배열에 다음과 같이 숫자를 저장(스네이크)하고 출력하시오.
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25

		// 1. 정수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int row = sc.nextInt();

		// 2. 이차원배열 생성
		int[][] array = new int[row][row];

		int num = 1;

		// 3. 입력부
		// 만약 row = 2;
		// 1 2
		// 4 3

		for (int j = 0; j < array.length; j++) { // 모든 행의 값을 채우는 for문
			// 행의 숫자가 홀수인지 짝수인지 판별
			if (j % 2 == 0) {
				// 짝수행(0번행~)의 규칙 : 열번호가 0부터 시작해서 1씩 증가
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++;
				}
			} else {
				// 홀수행(1번행~)의 규칙 : 열번호가 1부터 시작해서 1씩 감소
				for (int i = array.length - 1; i > -1; i--) {
					array[j][i] = num++;
				}
			}
		}

		// 짝수행(0번행~)의 규칙 : 열번호가 0부터 시작해서 1씩 증가
//		for (int i = 0; i < 2; i++) {
//			array[0][i] = num++;
//		}

		// 홀수행(1번행~)의 규칙 : 열번호가 1부터 시작해서 1씩 감소
//		for (int i = array.length-1; i > -1; i--) {
//			array[1][i] = num++;
//		}

//		array[0][0] = num++;
//		array[0][1] = num++;
//		array[1][0] = num++;
//		array[1][1] = num++;

		
		// 4. 출력부
		for (int j = 0; j < array.length; j++) { // j값 -> 행번호
			for (int i = 0; i < array.length; i++) { // i값 -> 열번호
				System.out.print(array[j][i] + "\t");
			}

			System.out.println();
		}

		
//		for (int i = 0; i < 2; i++) {
//			System.out.print(array[1][i] + "\t");
//		}

		// 출력부
//		System.out.print(array[0][0] + "\t");
//		System.out.print(array[0][1] + "\t");

//		System.out.print(array[1][0] + "\t");
//		System.out.print(array[1][1] + "\t");

	}

}
