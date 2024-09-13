package JavaFestival;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// 문제 2
		// 일한 시간을 입력받아 총 임금을 계산하는 시급계산기입니다
		// 시급은 5000원이며 8시간보다 초과 근무한 시간에 대해 1.5배의 시급이 책정됩니다.
		// 일한시간을 입력하세요 : 10
		// 총 임금은 55000원 입니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("일한 시간을 입력하세요 : ");
		int time = sc.nextInt();

		
		int money = 0;
		if (time > 8) {
			money = (int) (5000 * (time - 8) * 1.5 + 8 * 5000);
		} else {
			money = 5000 * time;
		}

		System.out.println("총 임금은 " + money + "원 입니다.");
		
		
		
		
		
		
		
	}

}
