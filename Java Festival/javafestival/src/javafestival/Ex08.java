package javafestival;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int input = sc.nextInt();
		int result = (input + 5) / 10 * 10;
		System.out.println("반올림수 : " + result);

	}

}
