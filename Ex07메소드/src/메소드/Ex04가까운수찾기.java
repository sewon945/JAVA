package 메소드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

	}

	private static int close10(int num1, int num2) {
		// ex) 5와 9를 봤을 때 10에 가까운 수를 찾기 위해서는
		// 10-5=5 / 10-9=1 ---> 결과값이 더 작은 수가 10과 가깝다고 판단!
		// 11과 15 중에서 10에 가까운 수를 찾으려고
		// 10-11=-1 / 10-15=-5 ---> 더 작은 수가 10과 가깝다고 판단XXX

		// -1, -5에서 -를 뗄 수 있는 방법은?
		// 1) 큰 수에서 작은 수를 빼는 방법(if문이 많아져서 번거러움)
		// 2) 제곱 ---> -1*-1 =1 / -5*-5 = 25

		int result = 0;
		// 1. 자바에서 제곱 만드는 방법
		// if ((10 - num1) * (10 - num1) < (10 - num2) * (10 - num2)) {
		
		// 2. 절대값 구하는 방법
		if(Math.abs(10-num1) < Math.abs(10-num2)) {
			// num1이 10과 더 가깝다!    10-num1<10-num2 => 10-9<10-5 참이지만 
			                       // 10보다 num이 더 클 가능성도 있기에 제곱을 해줘야한다.
			result = num1;
		} 
		// 1.
		// else if ((10 - num1) * (10 - num1) > (10 - num2) * (10 - num2)) {
		
		// 2.
		else if(Math.abs(10-num1) > Math.abs(10-num2)) {
			// num2가 10과 더 가깝다!
			result = num2;
		} else {
			result = 0;
		}

		return result;
	}

}
