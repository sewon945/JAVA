package JavaFestival;

import java.util.Scanner;

public class Ex보너스01 {

	public static void main(String[] args) {

		// 다음과 같은 프로그램을 작성하시오.
		//  A,B 숫자를 입력 받는다.
		//  A-B를 출력한다.
		//  A와 B가 모두 0을 입력 받으면 프로그램이 종료된다.
		

		Scanner sc = new Scanner(System.in);
		// 무한 루프문 작성
		String lee = "sssss";
		
		while(true)
		{
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
			System.out.print("B 입력 >> ");
			int num2 = sc.nextInt();
			
			// 두개의 입력값이 전부 0 이면 프로그램종료
			if(num1==0 && num2 ==0)
			{
				break;
			}
			// A-B 값 저장 후 출력
			int result = num1-num2;
			System.out.print("결과 >> " + result);
			System.out.println();
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
