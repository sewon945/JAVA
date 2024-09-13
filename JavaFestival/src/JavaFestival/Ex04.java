package JavaFestival;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		// 거스름돈을 입력받아 내어줘야 하는 지폐의 개수를 출력하는 프로그램을 작성하시오
		// 단, 최대단위는 1000원, 최소단위는 100원
		// 총금액 입력 : 25600
		
		// 잔돈 : 25600원
		// 10000원 : 2개
		// 5000원 : 1개
		// 1000원 : 0개
		// 500원 : 1개
		// 100원 : 1개
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총 금액 입력 : ");
		
		// 만원
		int tenThousand = 0;
        // 천원
		int oneThousand = 0;
		// 오천원
		int fiveThousand = 0;
		// 오백원
		int fiveHundred = 0;
		// 백원
		int oneHundred = 0;
		
		// 총 금액
		int total = sc.nextInt();
		System.out.println("잔돈 : " + total);
		
		// 만원 지폐 수 계산
		tenThousand = total/10000;
		// 거스름돈
		total = total % 10000;		
		
		// 오천원 지폐 수 계산
		fiveThousand = total/5000;
		total = total % 5000;		
		
		// 천원 지폐수 계산
		oneThousand = total/1000;
		total = total % 1000;	
		
		// 500원 계산
		fiveHundred = total/500;
		total = total % 500;
		
		// 100원
		oneHundred = total/100;
		total = total % 100;
		
		// 출력
		System.out.println("10000원 : " + tenThousand);
		System.out.println("5000원 : " + fiveThousand);
		System.out.println("1000원 : " + oneThousand);
		System.out.println("500원 : " + fiveHundred);
		System.out.println("100원 : " + oneHundred);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
