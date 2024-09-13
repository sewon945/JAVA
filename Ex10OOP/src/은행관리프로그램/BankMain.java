package 은행관리프로그램;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		// 1. Bankbook 설계도를 기반으로 bank1 객체 생성
		Bankbook bank1 = new Bankbook();
		
		// 2. bank1에 7000원 입금
//		bank1.deposit(7000);
//		System.out.println(bank1.showMoney());
		

		Scanner sc = new Scanner(System.in);
		
		// 1. 통장에서 1500원을 입금한 후 출력
		System.out.print("입금할 금액 입력 >> ");
		int input = sc.nextInt();
		bank1.deposit(input);
		System.out.println("현재 잔액 : " + bank1.showMoney() + "원");
		
		// 2. 통장에서 500원을 인출한 후 출력
		System.out.print("출금할 금액 입력 >> ");
		input = sc.nextInt();
		bank1.withdraw(input);
		System.out.println("현재 잔액 : " + bank1.showMoney() +"원");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
