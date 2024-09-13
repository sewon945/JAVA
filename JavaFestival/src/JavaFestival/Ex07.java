package JavaFestival;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		// 행 개수를 입력받아 다음과 같이 삼각형을 출력하시오
		// 행 개수 : 7
		// *******
		// ******
		// *****
		// ****
		// ***
		// **
		// *

		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int j = num; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
