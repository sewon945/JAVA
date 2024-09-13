package ifelse문;

import java.util.Scanner;

public class Ex01ifelse문 {

	public static void main(String[] args) {

		// int타입의 변수 grade를 선언하고 키보드로 값을 입력 받으세요.
		// 만약 grade가 60점 이상이면"합격입니다."
		// 그렇지 않다면 "불합격입니다."를 출력하는 프로그램을 작성하세요.
		// 점수를 입력하세요 : 65, 합격입니다.
		// 점수를 입력하세요 : 44, 불합격입니다.
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 점수를 입력받기
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		// 3. 60점 이상인지 판단
		if(grade >= 60) {
			// 3-1) 참인 경우 합격입니다. 출력
		System.out.println("합격입니다.");
		} else {
			// 3-2) 거짓인 경우 불합격입니다. 출력
		System.out.println("불합격입니다.");
		}
		
		
		
		// 3/22 ifelse문
		// 정수형 변수 5개를 선언한 후 정보처리기사의 각 과목의 정답 개수를 입력받아 할당하시오.
		// 한 과목이라도 8개 미만인 경우 "불합격입니다"를 출력하고
		// 총 개수가 60개 이상이면 "합격입니다"를 출력하는 프로그램을 작성하시오.
		
		System.out.print("소프트웨어 설계 : ");
		int a = sc.nextInt();
		
		System.out.print("소프트웨어 개발 : ");
		int b = sc.nextInt();
		
		System.out.print("데이터베이스 구축 : ");
		int c = sc.nextInt();
		
		System.out.print("프로그래밍 언어 활용 : ");
		int d = sc.nextInt();
		
		System.out.print("정보시스템 구축 관리 : ");
		int e = sc.nextInt();
		
		
		
		
		
		
		
		
		
	}

}
