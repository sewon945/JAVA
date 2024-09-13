package JavaFestival;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		// 문제 8
		// 1의 자리에서 반올림 한 결과를 출력하시오
		// 숫자 입력 : 123 숫자 입력 : 128
		// 반올림 수 : 120 반올림 수 : 130

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();

		int result = (input + 5) / 10 * 10;

		System.out.print("반올림 수 : " + result);

	}

}
