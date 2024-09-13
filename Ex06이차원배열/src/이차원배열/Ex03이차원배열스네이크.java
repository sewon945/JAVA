package 이차원배열;

public class Ex03이차원배열스네이크 {

	public static void main(String[] args) {

		// 정수형 데이터를 저장할 수 있는 5행 5열 크기의 array를 선언하세요
		// 아래와 같이 21~45까지의 숫자를 저장하고, 출력하세요

		// 21 22 23 24 25
		// 30 29 28 27 26
		// 31 32 33 34 35
		// 40 39 38 37 36
		// 41 42 43 44 45

		// 1. 이차원배열 생성
		int[][] array = new int[5][5];

		int num = 21;

		// 2. 입력부
		// 0, 2, 4 행 ----> 오른쪽 증가(행의 인덱스가 짝수일 때)
		// 1, 3 행 <---- 왼쪽 증가(행의 인덱스가 홀수일 때)
		for (int j = 0; j <= 4; j++) { // j --> 행 번호
			// 행이 홀수인지 짝수인지 판별이 필요함
			if (j % 2 == 0) { // --> 짝수라는 뜻 (나머지를 구해야하기에 %)
				// 행이 짝수일 때
				for (int i = 0; i < 5; i++) {
					array[j][i] = num++;
				}
			} else { // --> 그렇지 않을 때(홀수일 때)
				// 행이 홀수일 때
				for (int i = 4; i > -1; i--) {
					array[j][i] = num++;
				}
			}

		}

		// 3. 출력부
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}


 
		
		
//		array[0][0] = num++;
//		array[0][1] = num++;
//		array[0][2] = num++;
//		array[0][3] = num++;
//		array[0][4] = num++;

//		array[1][4] = num++;
//		array[1][3] = num++;
//		array[1][2] = num++;
//		array[1][1] = num++;
//		array[1][0] = num++;

	}

}
