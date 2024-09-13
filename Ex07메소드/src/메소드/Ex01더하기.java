package 메소드;

public class Ex01더하기 {

	public static void main(String[] args) {

		
		// 메소드의 기본 구조
		// public - 접근제한자(누구나 사용할 수 있음)
		// int - 리턴 타입(문자열이 들어오면 String으로 바뀜)
		// addNumber - 메소드 이름
		// (int num1, int num2) - 매개변수
		// {int result = num1+num2;
		// return result;} - 반환데이터(마지막에 어떤 결과값을 가지고 있게 할지 콕 찝는 것)
		

		
		// 메소드 사용하기(main영역 안쪽에서 사용)
		// 1.
		double result = addDouble(4.2, 3.14);
		System.out.println(result);

		// 2.
		// 결과를 바로 확인하고 싶으면 출력문 작성 후 여기 안에 넣는 것도 가능
		System.out.println(subNum(5, 5));

		// 3.
		printHello();
		printHello();

	}

	// 3. 리턴값이 없고, 매개변수도 없는 메소드(리턴할 게 없는데 리턴값을 만들어야 할 경우 void)
	public static void printHello() {
		// void : 리턴값이 없을 때 리턴타입 대신에 작성
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
	}

	
	// 2. 빼기 연산 메소드
	// 리턴타입 : int , 매개변수 : int 2개 , 메소드명 : subNum
	// 매개변수로 받아온 데이터 두 개를 뺀 결과값을 돌려주는 메소드
	// 단, 빼기를 할 때 큰 수에서 작은 수를 뺀 결과값 돌려주기

	public static int subNum(int num1, int num2) {
		int result = 0;
		result = num1 > num2 ? num1 - num2 : num2 - num1;
		// num1이 num2보다 크니? 라고 물어보고 이게 참(?)이면 num1-num2
		// 그게 아니면(:) num2-num1
		return result;
	}

	
	// 1. 메소드 생성(main영역 벗어나서 작성하기!)
	// 리턴타입 : double , 매개변수 : double 2개 , 메소드명 : addDouble

	public static double addDouble(double num1, double num2) {
		// 메소드는 return 키워드를 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에 코드 작성할 것!
		double result = num1 + num2;
		return result;
	}

	


}
