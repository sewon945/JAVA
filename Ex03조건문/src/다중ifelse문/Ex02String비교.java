package 다중ifelse문;

import java.util.Scanner;

public class Ex02String비교 {

	public static void main(String[] args) {

		// 알파벳 하나를 입력받은 후 A를 입력한 경우는 "A입력"
		// B를 입력한 경우는 "B입력", C를 입력한 경우는 "C입력"을 출력하고
		// 그 외의 알파벳을 입력한 경우는 "A,B,C 외 입력"을 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 입력 >> ");
		String input = sc.next();
		
		//비교연산자 ( == , != ) => 기본타입(Primitive Type)
		// boolean, char, byte, short, int, long, float, double
		// 같은지 : input == "A", input.equals("A") / 다른지 : !input.equals("A")
		if(input.equals("A")) {
			System.out.println("A입력!");
		}else if(input.equals("B")) {
			System.out.println("B입력!");
		}else {
			System.out.println("A,B 외 입력!");
		}
		
		System.out.println("프로그램 종료!"); 
		
		
		
		// 버스 단말기에 버스카드를 태그하려고 합니다. 현재 카드 잔액과 탑승자가 성인/청소년/어린이 인지
		// 입력한 후 잔액이 충분한 경우에는 인사말을 출력하고 부족한 경우에는 "잔액이 부족합니다"를 출력하시오.
		// (성인-감사합니다(1800원)/청년-반갑습니다(1500원)/어린이-안녕하세요(1000원))
		
		System.out.print("잔액 : ");
		int money = sc.nextInt();
		
		System.out.print("성인/청소년/어린이 : ");
		String hum = sc.next();
		
		if( hum.equals("성인") && money >= 1800 ) {
			System.out.println("감사합니다");
		}else if( hum.equals("청소년") && money >= 1500 ) {
			System.out.println("반갑습니다");
		}else if( hum.equals("어린이") && money >= 1000 ) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("잔액이 부족합니다");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
