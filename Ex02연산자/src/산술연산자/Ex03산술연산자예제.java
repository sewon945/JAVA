package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {

		// 문제 ---> 정수입력 : 456 , 결과 값 : 400
		// 1. 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		
		// 2. 정수입력 출력하기(개행없이)
		System.out.print("정수입력 : ");
		
		// 3. 정수 입력받기
		int num = sc.nextInt();
		
		// 4. 백의 자리 이하를 버리기
		// ---> 백의 자리 이하를 버리는 걸 어떻게 머리에서 계산했는지 생각해보기
		// ---> 코드로 작성하는 게 어려울 것임
		// 1) 456/100*100
		int result = num / 100 * 100;
		
		// 다른 방법 2) 456-(456%100)
	    System.out.println("정수 입력 : ");
		int num1 = sc.nextInt();
		int result1 = num1 - (num1 % 100);
		System.out.println("결과 값 : " + result1);
				
		// 5. 결과값 출력하기
		System.out.println("결과 값 : " + result);
		
	
		
		// 복습 3/21 대문자로 쓰여있으면 상수, 소문자로 쓰여있으면 정수
				// class 이름 : ex) Myclass
				// 자료형 : 기본자료형(primitive)-아래 8가지, 소문자로 시작 -> 자기 기능 없음
				// / 참조자료형(reference)-대문자로 시작, String 
				String str = "abc";
				// 기본자료형: 논리형 - boolean(true/false) --> 조건문, 반복문 -> switch
				//        : 문자형 - char '가','a' (O) '가나' (X)--> 문자 하나만 저장 가능
				//        : 정수형 - byte, short, int(기본-4byte), long
				//        : 실수형 -              float, double(기본)
				// System.out.println(); --> System: 도구 -> 자기 기능이 있음
				Scanner scanner = new Scanner(System.in);
				// --> scanner는 입력도구 x, 괄호 안 in이 입력도구 o
				// --> scanner는 컴퓨터가 알아들을 수 있게 바꿔주는 도구
				scanner.next(); // 문자
				scanner.nextInt(); // 숫자
		// 연산자 부분 복습 3/21
				// 논리연산자 : !(NOT), &&(AND), ||(OR)
				// 산술연산자
				// 비교연산자 : ==(같다), !=(다르다), <=, >=
				// 대입연산자 : =, +=, -= / a += b ---> a = a-b
				// 증감연산자
		// 삼항연산자
		
		
		
		
		
		
		
		
		
	}

}
