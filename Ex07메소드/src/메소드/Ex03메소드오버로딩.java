package 메소드;

public class Ex03메소드오버로딩 {

	public static void main(String[] args) {
		
		// 교재 p.209
		// 메소드 오버로딩(중복정의)
		// 매개변수를 다르게 하고, 메소드의 이름을 똑같이 부여
        // 메소드의 이름은 같지만 매개변수를 다르게 함으로써 서로 다른 메소드를 만드는 기법
		
		System.out.println(add(3 , 5));
		System.out.println(add(3.5 , 5.5));
		
	}

	// 메소드 오버로딩 성립 조건
	// 1. 이름이 같아야한다.
	// 2. 매개변수의 개수  혹은 자료형(타입)이 달라야한다.
	// 3. 매개변수와 메소드 이름이 동일하고 리턴타입만 다른경우는 오버로딩이 아니다.
	private static double add(double num1, double num2) { // 실수는 double
		return num1+num2;
	}

	private static int add(int num1, int num2) { // 정수는 int
		return num1+num2; 
		
		
		
		
		// 4월 3일 복습
		
		// 메소드 
		// : 함수, 기능
		// : 반복적인 코드를 최소화 --> 유지보수가 쉽다
		// 메소드 구조
		// 접근제한자 static 리턴타입 메소드명 (매개변수) {
		// int result = 0;
		// 알고리즘
		// return result ;
		//  }
		// 리턴타입이 없을 때 -. void를 리턴타입에 넣어줌
		
		// 메소드 오버로딩(중복정의)
		// : 한 클래스 파일에서 메소드 이름을 중복으로 정의
		// : 매개변수의 개수나 타입을 다르게 함으로써 중복으로 정의하는 기법
		
		
		
		
	}

}
