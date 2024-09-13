package 삼항연산자;

import java.util.Scanner;

public class Ex04삼항연산자예제 {

	public static void main(String[] args) {

		// 농구공을 담기 위해 필요한 상자의 개수를 구하세요. 
		// 상자 하나에는 농구공이 5개 들어갈 수 있습니다.
		// 만일 농구공이 '23'개 라면 필요한 상자의 개수는 '5'개 입니다.
		// 농구공의 개수를 입력하세요: 33, 필요한 상자의 수: 7
		// 농구공의 개수를 입력하세요: 20, 필요한 상자의 수: 4
		

		Scanner scan = new Scanner(System.in);
		
		System.out.println("농구공의 개수를 입력하세요: ");
		int input = scan.nextInt();
		
		int box = (input%5==0)?input/5 : input/5+1;
		System.out.println("필요한 상자의 수 : "+box);
		
		int box1 = (input%5>0)?input/5+1 : input/5;
		System.out.println("필요한 상자의 수 : "+box1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
