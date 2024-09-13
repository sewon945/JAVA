package JavaFestival;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		// 정수 N을 입력받아 N * N 배열에 다음과 같이 숫자를 저장하고 출력하시오.


		// 1. 정수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int row = sc.nextInt();

		// 2. 이차원배열 생성
		int[][] array = new int[row][row];

		int num = 1;

		// 3. 입력부
		// 1 4 7
		// 2 5 8
		// 3 6 9 를 만든다 생각하고 1차 입력
//				array[0][0] = num++;
//				array[1][0] = num++;
//				array[2][0] = num++;

//				array[0][1] = num++;
//				array[1][1] = num++;
//				array[2][1] = num++;

//				array[0][2] = num++;
//				array[1][2] = num++;
//				array[2][2] = num++;

		// 1차 입력값 - > 반복문으로 바꿔주기
//				for (int i = 0; i < array.length; i++) {
//					array[i][0] = num++;
//				}
//				
//				for (int i = 0; i < array.length ; i++) {
//					array[i][1] = num++;
//				}
//				for(int i=0; i<array.length;i++) {
//					array[i][2] = num++;
//				}

		// 2차 입력값 - > 이중for문으로 정리
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = num++;
			}
		}

		// 4. 출력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + "\t");

			}
			System.out.println();
		}

	}

}
