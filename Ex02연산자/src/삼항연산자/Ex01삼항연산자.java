package 삼항연산자;

import java.util.Scanner;

public class Ex01삼항연산자 {

	public static void main(String[] args) {
		// 변수 i와 j가 가지고 있는 값이
		// 같으면 => "같다" 를 출력
		// 다르면 => "다르다" 를 출력
		int i = 3;
		int j = 10;
		
		// 방법1)
		// String result = (i==j)?"같다": "다르다";
		// System.out.println(result);
		
		// 방법2)
		System.out.println((i==j)?"같다": "다르다");
		
		// 삼항연산자예제
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int input = sc.nextInt();
		String result = (input%2==1)?"홀수입니다": "짝수입니다";
		System.out.println(result);
		
		System.out.println("첫번째 정수 입력: ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
