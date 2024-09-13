package ifelse문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {

		// 다음은 마트 계산대 프로그램입니다.
		// 10000원 짜리 선물세트를 구입했을 때 지불해야하는 금액을 계산해 보세요.
		// 단, 11개 이상 구매 시에는 전체금액에서 10% 할인이 적용됩니다.
		// 상품의 개수를 입력하세요: 9, 가격은 90000원입니다.
		// 상품의 개수를 입력하세요: 12, 가격은 108000원입니다.
		
		// 1. 입력 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받기
		System.out.print("상품의 개수를 입력하세요 : ");
		int product = sc.nextInt();
		// 3. 선물세트 구입 시 지불할 금액 계산하기
		// 지역변수 (local variable)
		int money = 0;
		    // 0으로 왜 초기화를 시키는가? 
		    // => 변수 선언 int num; System.out.println(num);
		    // (num) --> 오류발생
		    // 그래서 최대한 오류를 발생 시키지 않게끔 0이라는 값을 넣어주는 것임
		if(product >= 11) {
			// 3-1) 11개 이상 구매 시 전체금액에서 10% 할인(1세트 : 10000원)
			money = (int) (10000 * product * 0.9);
			// int로 왔으므로 강제 형변환 한 것임(원래는 10000 * product * 0.9)
			                       // --> 이렇게 쓰면 오류가 뜨므로 강제 형변환인 int를 쓰는 것임
		}else {
			// 3-2) 그렇지 않은 경우 정가로 계산
			money = 10000 * product;
		}
		// 4. 가격 출력하기
		System.out.println("가격은 " + money + "원입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
