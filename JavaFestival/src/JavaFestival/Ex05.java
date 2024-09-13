package JavaFestival;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		// 행 개수를 입력받아 다음과 같이 삼각형을 출력하시오
		// 행 개수 : 8
		// *
		// **
		// ***
		// ****
		// *****
		// ******
		// *******
		// ********

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();
		
		for (int b = 0; b < num; b++) {
			for (int a = 0; a < b + 1; a++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
