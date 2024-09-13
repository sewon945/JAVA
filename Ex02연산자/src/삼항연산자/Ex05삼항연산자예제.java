package 삼항연산자;

import java.util.Scanner;

public class Ex05삼항연산자예제 {

	public static void main(String[] args) {

		// 시급계산기 입니다. 기본 시급은 9,000원이고 
		// 8시간이 넘을 경우 초과 시간은 시급의 1.5배를 책정해줍니다.
		// 노동시간을 입력하세요: 7, 총 임금은 63000원 입니다
		// 노동시간을 입력하세요: 11, 총 임금은 112500원 입니다
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("노동시간을 입력하세요: ");
		int input = scan.nextInt();
		
		double result = (input>8)?(9000*8)+(input-8)*9000*1.5 : 9000*input;		
		
		System.out.println("총 임금은 "+ (int)result+"입니다");
		
		
		
		
		
		
		
		
		
		
	}

}
