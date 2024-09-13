package JavaFestival;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		
		
		// 문제 3
		// 1-2+3-4+...+99-100 를 계산하여 답을 출력하시오.
		// 1 -2 3 -4 5 -6 7 -8 9 -10 11 -12 13 -14 15 -16 17 ...
		// 결과 : -50

		int num = 0;
		int total = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				num = i * -1;
			} else {
				num = i;
			}
			total += num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("결과 : " + total);

		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
