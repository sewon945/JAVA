package 삼항연산자;

import java.util.Scanner;

public class Ex03삼항연산자예제 {

	public static void main(String[] args) {

		// 두 개의 정수를 입력 받아 큰 수에서 작은 수를 뺀 결과값을 출력하세요.
		// 첫번째 정수 입력 : 10, 두번째 정수 입력: 45, 두 수의 차: 35
		// 첫번째 정수 입력 : 87, 두번째 정수 입력: 23, 두 수의 차: 64
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("첫번째 정수 입력 : ");
	    int input1 = scan.nextInt();
	      
	    System.out.print("두번째 정수 입력 : ");
	    int input2 = scan.nextInt();
	      
	    int result = (input1<input2)?input2-input1:input1-input2;
	    System.out.println("두 수의 차 : "+ result);

		
		
		
		
		
		
	}

}
