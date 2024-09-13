package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {

		// 다음은 에버랜드 입장료 계산 프로그램입니다.
		// 기본료는 5000원이며 인원수에 따라 지불해야하는 프로그램을 만들어보세요.
		// 단, 20세 미만인 경우 50% 할인이 적용됩니다
		// 나이를 입력하세요 : 15, 인원수를 입력하세요 : 5, 총12500원입니다.
		// 나이를 입력하세요 : 20, 인원수를 입력하세요 : 5, 총25000원입니다.
		
		
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 나이 입력받기
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		// 3. 인원수 입력받기
	    System.out.print("인원수를 입력하세요 : ");
		int inwon = sc.nextInt();
		// 4. 입장료 계산하기
		// !!!!!! 지역변수 (local variable) !!!!!!
		// : {} 영역 안에서 선언된 변수는 {}영역 안에서만 사용 가능하다!!!
		// ---> {} : scope
		int money = 0; // 방해받고 싶지 않아 초기화(0) 시켜둔 것
		if(age < 20) {
			// 4-1) 20세 미만인 경우 입장료 50% 할인(기본 입장료 : 5000원)
			money = (int) (5000 * inwon * 0.5);
		}else {
			// 4-2) 그렇지 않은 경우 입장료 그대로 계산
			money = 5000 * inwon;
		}
		// 5. 결과 출력하기
		System.out.println("입장료는 " + money + "원 입니다.");
		// 5번 결과 출력하기에서 중괄호를 벗어나서 money 라는 단어를 써서 입력 오류남(지역변수)
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
