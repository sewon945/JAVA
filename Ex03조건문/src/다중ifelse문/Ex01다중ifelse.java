package 다중ifelse문;

import java.util.Scanner;

public class Ex01다중ifelse {

	public static void main(String[] args) {

		// 정수형 변수 score를 선언하고 키보드 값을 입력받은 후 값을 할당하시오.
		// 입력받은 값이 90점 이상이면 "A학점입니다",
		// 80점 이상 90점 미만인 경우는 "B학점입니다",
		// 70점 이상 80점 미만인 경우는 "C학점입니다"를 출력하고
		// 70점 미만인 경우는 "F학점입니다"를 출력하시오.
		
		
		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 :");
		int input = sc.nextInt();
		
		if(input>=90) {
			System.out.println("A학점입니다");
		}else if(input>=80) {
			// input>=80 && input<70 을 더 간편하게 위처럼 input>=80 표기(아래로 다 같음)
			System.out.println("B학점입니다");
		}else if(input>=70) {
			System.out.println("C학점입니다");
		}else if(input<70) {
			System.out.println("F학점입니다");
		}
		
	     System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
