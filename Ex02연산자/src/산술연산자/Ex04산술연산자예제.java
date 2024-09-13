package 산술연산자;

import java.util.Scanner;

public class Ex04산술연산자예제 {

	public static void main(String[] args) {
		
		
		// 문제_ 초를 입력 받아 (시,분,초) 형태로 출력하세요 --> 초 입력: 3723, 1시2분3초

		Scanner scan = new Scanner(System.in);

		System.out.println("초 입력 : ");
		int input = scan.nextInt();  //3723
		
		int hour = input/3600;
		// 3723/3600 몫 : 1 나머지 : 123
		int min = (input%3600)/60;
		//123/60 몫: 2 나머지: 3
		// int sec = (input%3600)%60; 
		// --> 3600은 60으로 나누어 떨어지기에 더 편하게 하려면 아래와 같이
		int sec = input%60;
				
		System.out.println(hour+ "시 "+min+"분 "+sec+"초 ");
		
		// 대입연산자
		// 증감연산자
		// 비교연산자: 같니? 다르니? 질문하는 것
		// 논리연산자: NOT(!A), AND(&&), OR(||) - boolean의 true랑 false만 올 수 있음
		//문제_ int a=3;, int b=10;
		// System.out.println(!(a>b)); : 3>10 false -> !false = true
	    // tt t ft f tf t ff f
		// 괄호가 없어도 비교연산 먼저 한다!
		// System.out.println((1<3)&&(4<5)); T&&T T
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
