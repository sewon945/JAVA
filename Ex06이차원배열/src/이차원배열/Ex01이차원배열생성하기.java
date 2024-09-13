package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열생성하기 {

	public static void main(String[] args) {

		// 1. 이차원배열 생성하기(정수형 데이터 저장)
		int[][] array = new int[3][3]; // [행][열]
		// int - 배열타입, [][] - 이차원배열 선언, array - 배열에 대한 레퍼런스 변수
		// new - 배열생성, int - 선언한 배열타입과 동일, [3] - 배열크기(행), [3] - 배열크기(열)

		System.out.println(array[0][1]); // 0번 행에 1번 열

		// 2. 이차원배열 값을 넣으면서 생성하기     //     _0__1__2__(열)
		int[][] array2 = { { 1, 2, 3 },   //     0|__|__|__|
				           { 4, 5, 6 },   // =>  1|__|__|__|
				           { 7, 8, 9 } }; //     2|__|__|__|
								          //    (행)

		// 3. 이차원배열 안에 값 넣기

//		array[0][0] = 1;  // 0번 행에 0번 열에 1을 넣어주겠다
//		array[0][1] = 2;
//		array[0][2] = 3;
//		
//		array[1][0] = 4;
//		array[1][1] = 5;
//		array[1][2] = 6;
//		
//		array[2][0] = 7;
//		array[2][1] = 8;
//		array[2][2] = 9;

		int num = 1;
		for(int j = 0; j < 3; j++){   // j --> 행
		for (int i = 0; i < 3; i++) { // i --> 열
			array[j][i] = num++;
		}
		}
		
    		// 위의 반복구문
////	    array[0][0] = num++;
////		array[0][1] = num++;
////		array[0][2] = num++;

//		for (int i = 0; i < 3; i++) {
//			array[1][i] = num++;
//		}
////		array[1][1] = num++;
////		array[1][2] = num++;

//		for (int i = 0; i < 3; i++) {
//			array[2][i] = num++;
//		}
////		array[2][1] = num++;
////		array[2][2] = num++;
		
		
		// 4. 이차원배열 값 출력하기
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));
		////////////////////////////////////////////////////
		
		for (int j = 0; j < array.length; j++) {  // array.length => 3(행 배열의 크기 3칸)
		    for(int i = 0; i < array[j].length; i++) { // 열의 크기는 일정하지 않으므로 행이라는 j의 크기를 가지고 쓴다
			   
		       System.out.print(array[j][i]+ " ");
		    }
		   
		    System.out.println();
		}
		
		
		// 위의 풀이 (k는 열 => i, l은 행 => j)
////	    System.out.print(array[0][0]+ " ");
////	 	System.out.print(array[0][1]+ " ");
////		System.out.print(array[0][2]+ " ");
//		System.out.println();
//		
//		for(int k = 0; k < 3; k++){
//		System.out.print(array[1][k]+ " ");
//		}
////		System.out.print(array[1][1]+ " ");
////		System.out.print(array[1][2]+ " ");
//		System.out.println();
//		
//		for(int k = 0; k < 3; k++) {
//		System.out.print(array[2][0]+ " ");
//		}
////		System.out.print(array[2][1]+ " ");
////		System.out.print(array[2][2]+ " ");


	}

}
