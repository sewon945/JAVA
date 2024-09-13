package 메소드;

import java.util.Scanner;

public class Ex05완전수 {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.print("num1 입력 :");
//		int num1 = sc.nextInt();
//		System.out.print("num2 입력 : ");
//		int num2 = sc.nextInt();
//		boolean divisor = isDivisor(num1, num2);
//		System.out.println(divisor);

		// System.out.println(getSum(44));

		// System.out.println(isPerfect(7));
		// System.out.println(isPerfect(6));

		System.out.println("1부터 1000까지의 완전수 : ");
		for (int i = 1; i <= 1000; i++) {
			if (isPerfect(i)) {
				// 이 중괄호 안에 들어왔다는 건 i가 완전수일 때!!
				System.out.print(i + " ");
			}
		}

		
		
	}

	
	
	// 3. 완전수인지 확인하는 메소드
	// 메소드명 isPerfect 매개변수 int 1개 리턴타입 boolean
	// 입력받은 매개변수가 완전수라면 true, 아니면 false를 반환하는 알고리즘

	private static boolean isPerfect(int num) {
		boolean result = false;
		// 입력된 숫자 num과 num의 약수(자신은 제외)의 합이 같은지 판별
		if (getSum(num) == num) { // 아래에 getSum으로 약수의 총합 구하는 식을 작성해줬음
			// num이 완전수일 때!
			result = true;
		}

		return result;
	}

	
	
	
	// 2. 자신을 제외한 약수의 총합 구하기
	// 이름 getSum , 매개변수 int 1개 , 리턴타입 int

	private static int getSum(int num) {

		int result = 0;
		// 1. 입력된 숫자의 약수 구하기 --> 1~num까지 숫자 중에서 num을 제외한 범위
		// 2. 나 자신을 제외한 약수의 합을 구한 --> result에 누적

		for (int i = 1; i < num; i++) {
			// * 기존 로직
			// if (num % i == 0) {

			// ** 메소드를 호출한 로직
			// 메소드 구조 안에 메소드를 새롭게 만들 수는 없으나
			// 메소드를 호출해서 사용하는 것은 가능하다!
			if (isDivisor(num, i)) { // isDivisor(num, i) == true를 줄여서 쓴 것임 if절이 boolean이기에 true는 지워도 된다
				// 이 중괄호 안에 들어온 i는 num의 약수이다!
				result += i; // result = result + i;
			}
		}
		return result;

//		if(num % 2 == 0) {
//			result = result+2
//		}
//		if(num%3==0) {
//			result =result+3
//		}
//		if(num% 4==0) {
//			result = result +4
//		}
//		if(num % 5 == 0) {
//			result =result +5
//		}
//	    if(num%6 ==0) {
//	    	result = result +6
//		}

	}

	
	
	
	// 1. num2가 num1의 약수인지 확인하여 약수라면 true, 아니라면 false를 반환하는
	// isDivisor 메소드를 만들어주세요

	// 1) 약수 찾는 메소드
	private static boolean isDivisor(int num1, int num2) {
		boolean result = false;
		// num2가 num1의 약수이니?
		if (num1 % num2 == 0) {
			// num2가 num1의 약수이다!
			result = true;
		}
//	 else if(num1 % num2 == 1) {
//		 result = false ;
//	 } ==> 위 처음에 false를 result에 넣어줬으니 if절 조건식을 만났을 때
		// false이면 중괄호 안에 들어가지 못하고 return result를 만나서 결과값이 나온다
		// 그래서 else if절을 사용하지 않아도 된다!

		return result;
	}

}
