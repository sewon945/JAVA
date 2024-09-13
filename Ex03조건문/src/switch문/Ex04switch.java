package switch문;

import java.util.Scanner;

public class Ex04switch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		
		// 자판기 문제_ 문제는 첫번째 사진부터 차례대로 쪼개서 풀기
		
				// 1. 잔돈계산
				
				// 2. 돈이 부족할 때
				
				// 3. 천원,오백원,백원 몇 개 필요한지 계산
				
				// => 정상 동작 확인
				
				// => 최종 : 중복코드 최대한 줄여보기
				
		System.out.print("넣을 금액 : ");
		int inputMoney = sc.nextInt();
		
	    System.out.println("--메뉴--");
		
	    System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) : ");
	    int menu = sc.nextInt();
		
	    int change = 0; // 계산한 잔돈을 저장할 변수 처음에는 0으로 초기화
	    
		if(menu==1) { //콜라(1800)
			change = inputMoney - 1800; //잔돈
			
		}else if(menu==2) { //파워에이드(2000)
			change = inputMoney - 2000; //잔돈
			
		}else { //탄산수(1200)
			change = inputMoney - 1200; //잔돈
		}
	
		 if(change<0) {
	            System.out.println("돈이 부족해요 ㅠㅜ");
	         }else{
	            System.out.println("잔돈 : "+ change);
	            System.out.println("천원 : "+ (change/1000));
	            System.out.println("오백원 : "+ (change%1000/500));
	            System.out.println("백원 : "+(change%500/100));
	         }	
		
		
	    // 3/22 어제 복습내용(이도연)
		// 지역변수 : {} 영역 안에서 선언된 변수는 {} 영역 안 쪽에서만 사용 가능
		 
		// 다중if문 : if(조건식(참 혹은 거짓 형태로만 작성 가능)) {
		// 실행문장1
	    //   }else if(조건식){		
		// }else{		
		// }
		
		 
		 // switch - case 문
		 // switch(딱 떨어지는 값인 식 작성){
		 // case 딱 떨어지는 값 지정 :
		    // 실행문장1
		    // break;
		 // case 값2:
		    // 실행문장2
		 // default:
		    // 실행문장3
		 
		 
		 
		
	}

}
