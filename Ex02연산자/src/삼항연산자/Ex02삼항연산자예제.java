package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {

		
		// 정수를 입력받아 홀수인지 짝수인지 판별하세요.
		// 정수를 입력하세요: 35, 35는 홀수입니다.
		// 정수를 입력하세요: 24, 24는 짝수입니다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int input = scan.nextInt();
		
		String result = (input%2==0)?"짝수":"홀수";
		System.out.println(input+"는 " + result+"입니다 ");
		
		System.out.println("정수를 입력하세요 : ");
		int input2 = scan.nextInt();
		
        String result2 = (input2%2==0)?"짝수":"홀수";
	    System.out.println(input2+"는 "+ result2+"입니다"); 
		
		
		
		
		
		
	}

}
