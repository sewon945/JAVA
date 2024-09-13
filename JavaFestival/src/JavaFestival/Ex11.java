package JavaFestival;

public class Ex11 {

	public static void main(String[] args) {

		// 두 개의 정수를 매개변수로 받아 앞의 정수가 뒤의 정수로 나누어지는지를 판별하는
		// 메소드isDivide( )를 작성하세요.
		// 이때, 나누어지면 true, 나누어지지 않으면 false를 반환함

		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인 : " + result);
	}

	// 결과화면에서 출력값을 확인
	// 이를 통해 리턴 타입을 유추
	public static boolean isDivide(int num1, int num2) {
		boolean result = false;
		if (num1 % num2 == 0) {
			result = true;
		}
		return result;

	}

}
