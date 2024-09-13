package JavaFestival;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// 현재몸무게와 목표몸무게를 각각 입력받고 주차 별 감량몸무게를 입력받아 목표 달성 시
		// 축하메세지를 띄우는 프로그램을 구현하시오.
		// 현재몸무게 : 80
		// 목표몸무게 : 60 
		// 1주차 감량 몸무게 : 2
		// 2주차 감량 몸무게 : 5
		// 3주차 감량 몸무게 : 3
		// 4주차 감량 몸무게 : 4
		// 5주차 감량 몸무게 : 2
		// 6주차 감량 몸무게 : 1
		// 7주차 감량 몸무게 : 6
		// 57kg 달성!! 축하합니다!
		
		Scanner sc = new Scanner(System.in);
		
		// 현재몸무게와 목표몸무게 입력받기
		System.out.print("현재몸무게 : ");
		int current = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int target = sc.nextInt();
		
		// 주차별 감량 몸무게 입력받고 계산하기
		int week = 1;
		
		// 범위가 정해지지 않아 true, false 반복 여부
		while (current > target) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int loss = sc.nextInt();
			current -= loss;
			week++;
		}
		
		// 목표 몸무게 달성 시 축하 메세지 출력
		System.out.println(current + "kg 달성!! 축하합니다!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
