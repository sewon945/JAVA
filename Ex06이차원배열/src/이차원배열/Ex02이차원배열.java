package 이차원배열;

import java.util.Arrays;

public class Ex02이차원배열 {

	public static void main(String[] args) {

		// 정수형 데이터를 저장할 수 있는 5행 5열 크기의 array를 선언하세요
		// 아래와 같이 21~45까지의 숫자를 저장하고, 출력하세요

		// 세로출력
		//    0  1  2  3  4 (열)
		//
		// 0  21 26 31 36 41
		// 1  22 27 32 37 42
		// 2  23 28 33 38 43
		// 3  24 29 34 39 44
		// 4  25 30 35 40 45
		// (행)

		int[][] array = new int[5][5];
		// 21~25에 대한 데이터를 입력
		int num = 21;
		// 채우기
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[i][j] = num++;
			}
		}

		// 출력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}

		// 풀이과정 (아래에서 위로)
		
//		// 0열 채우기
//		for (int i = 0; i < 5; i++) {
//			array[i][0] = num++;
//		}
//		// 1열 채우기
//		for (int i = 0; i < 5; i++) {
//			array[i][1] = num++;
//		}
//		// 2열 채우기
//		for (int i = 0; i < 5; i++) {
//			array[i][2] = num++;
//		}
//		// 3열 채우기
//		for (int i = 0; i < 5; i++) {
//			array[i][3] = num++;
//		}
//		// 4열 채우기
//		for (int i = 0; i < 5; i++) {
//			array[i][4] = num++;
//		}

//		array[0][0] = num++;
//		array[1][0] = num++;
//		array[2][0] = num++;
//		array[3][0] = num++;
//		array[4][0] = num++;

//		array[0][1] = num++;
//		array[1][1] = num++;
//		array[2][1] = num++;
//		array[3][1] = num++;
//		array[4][1] = num++;

//		array[0][2] = num++;
//		array[1][2] = num++;
//		array[2][2] = num++;
//		array[3][2] = num++;
//		array[4][2] = num++;

//		array[0][3] = num++;
//		array[1][3] = num++;
//		array[2][3] = num++;
//		array[3][3] = num++;
//		array[4][3] = num++;

//		array[0][4] = num++;
//		array[1][4] = num++;
//		array[2][4] = num++;
//		array[3][4] = num++;
//		array[4][4] = num++;

	}

}
