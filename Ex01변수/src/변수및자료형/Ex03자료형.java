package 변수및자료형;

public class Ex03자료형 {

	public static void main(String[] args) {
		// 자바의 기본 자료형
		// 1) 논리 자료형 : boolean (1byte)
		// : 참 또는 거짓을 저장하는 자료형
		// 참이라고 하는 데이터를 저장하는 bool이라는 변수를 선언
		boolean bool = true;
		bool = false;
		System.out.println(bool);
		
		// 2) 문자 자료형 : char (2byte) 
		// : 따옴표를 사용해서 작성하고, (용량이 작아서) 한 글자만 들어갈 수 있다.
		char name = '오';
		char c1 = 65;
		System.out.println(c1);
		System.out.println((char)(c1+1));
		
		// 문자열 자료형(기본 자료형이 아님!!!)
		// String : 쌍따옴표를 사용해서 작성하고, (한 글자가 아닌) 여러 글자가 들어갈 수 있다.
		String name2 = "오세원";
		System.out.println(name);
		System.out.println(name2);
		
		// 3) 정수 자료형
		// byte(1byte), short(2byte), int(4byte), long(8byte) >> 기본값 int
		// ---> 데이터의 크기가 의미하는 건 표현할 수 있는 숫자의 범위이다!
		// 정수를 작성하면 java는 기본적으로 int로 인식!
		byte num1 = (byte) 128;
		// 1. 강제 형변환(명시적 형변환)
		// : 큰 크기의 자료형에서 더 작은 크기의 자료형으로 변환할 때 사용
		//   데이터 손실이 발생할 수도 있기 때문에 () 사용해서
		//   손실이 일어나도 괜찮다고 명시해주는 방식
		
		// 2. 자동 형변환(묵시적 형변환)
		// : 작은 크기의 자료형이 자동으로 큰 크기의 자료형으로 형변환
		long num2 = 1000;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 4) 실수형
		// float(4byte), double(8byte) >> 기본값 double
		//  3.14라는 데이터를 가진 double 형태의 변수 num3 선언
		double num3 = 3.14;
		float num4 = (float) 3.14;
		float num5 = 3.14f; // 일종의 키워드!!
		System.out.println(num5);
		

	}

}
