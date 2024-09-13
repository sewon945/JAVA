package javafestival;

import java.util.Random;
import java.util.Scanner;

public class javafestival {

	public static void main(String[] args) {

		
		// 자바 페스티벌 문제 29
		
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		int count = 0;

		while (count < 5) {
			int num = ran.nextInt(9)+1;
			int num1 = ran.nextInt(9)+1;
			int result = num+num1;
			System.out.print(num + " + " + num1 + " = ");
			int num2 = sc.nextInt();
			if (result == num2) {
				System.out.println("success");
			} else {
				System.out.println("fail");
				count++;
			}
		}
		System.out.println("over");
	}

}
