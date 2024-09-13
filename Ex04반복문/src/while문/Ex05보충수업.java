package while문;

import java.util.Scanner;

public class Ex05보충수업 {

	public static void main(String[] args) {

		// int타입의 input을 선언하고 키보드로 값을 입력받으세요
		// 1부터 input 까지 더한 식과 결과값을 출력하세요
		// ex) 1+2+3+4+=10
		
		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		
		// 2. 숫자를 입력하세요 (개행없이)
		System.out.print("숫자를 입력하세요 >> ");
		
		// 3. 숫자 입력받기
		int input = sc.nextInt();
		
		// 누적시킬 변수
		int sum = 0;
		int num = 1;
		
		// 4. 1부터 입력받은 숫자까지 누적시키기
		// ---> 누적시킬 변수, 식을 출력할 숫자 변수 필요하다!
		while(num <= input){
		sum = sum + num;
		
		// 5. 식 만들 숫자 출력하기
		System.out.print(num);
		
		if(input == num) {
		// 6-1. 입력받은 숫자와 정수가 같다면 "=" 기호 출력
			System.out.print("=");
		
		// 6-2. 그렇지 않으면 "+" 기호 출력
		} else {
			System.out.print("+");
		}
		num++;
		}
		// 7. 누적시킨 결과값 출력
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
	}

}
