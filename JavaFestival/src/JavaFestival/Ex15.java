package JavaFestival;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		// 정수 n을 입력받아 1, 2, 4, 7, 11 과 같은 수열의 n 번째 항까지 출력하시오.
		// n 입력 : 7
		// 1 2 4 7 11 16 22

		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");

		int num = sc.nextInt();

		int sum = 1;

		for (int i = 0; i < num; i++) {
			sum += i;
			System.out.print(sum + " ");
		}

//		1+0
//		1+1
//		2+2
//		4+3
//		7+4
//		11+5
//		16+6

	
		
		
	}

}
