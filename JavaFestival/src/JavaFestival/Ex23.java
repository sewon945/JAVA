package JavaFestival;

public class Ex23 {

	public static void main(String[] args) {

		// 문제 23
		// 아래와 같은 2차원 배열을 왼쪽으로 90도 회전하여 출력하시오.
		// 원본                   90도 회전
		// 1  2  3  4  5        5 10 15 20 25
		// 6  7  8  9  10       4 9  14 19 24
		// 11 12 13 14 15       3 8  13 18 23
		// 16 17 18 19 20       2 7  12 17 22
		// 21 22 23 24 25       1 6  11 16 21

		int[][] array = new int[5][5];
		int num = 1;
// 입력부
		for (int j = 0; j < array.length; j++) {
			for (int i = array.length-1; i > -1; i--) {
				array[i][j] = num++;
			}
		}
		// 출력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}
	
		
		
		
     // 		입력부
//		for (int i = 4; i < -1; i--) {
//			array[i][0] = num++;
//		}
//
//		for (int i = 4; i < -1; i--) {
//			array[i][1] = num++;
//		}
//
//		array[4][0] = 1;
//		array[3][0] = 2;
//		array[2][0] = 3;
//		array[1][0] = 4;
//		array[0][0] = 5;
//
//		array[4][1] = 6;
//		array[3][1] = 7;
//		array[2][1] = 8;
//		array[1][1] = 9;
//		array[0][1] = 10;

		
		// 		출력부
		

		
//		for(int j = 0; j < 5; j++){
//		System.out.println(array[j][0]);
//		}
		
//		System.out.println(array[0][0]);
//		System.out.println(array[0][1]);
//		System.out.println(array[0][2]);
//		System.out.println(array[0][3]);
//		System.out.println(array[0][4]);
		
//		for(int j = 0; j < array.length; j++){
//		for(int i = 0; i < array.length; i++){
//		System.out.println(array[j][i]);
//		}
//		}
		
//		System.out.println(array[1][0]);
//		System.out.println(array[1][1]);
//		System.out.println(array[1][2]);
//		System.out.println(array[1][3]);
//		System.out.println(array[1][4]);
		
		
		
		
		
		
	}

}
