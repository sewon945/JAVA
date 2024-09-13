package JavaFestival;

import java.util.Arrays;

public class Ex28 {

	public static void main(String[] args) {

//		// 문자열 형태의 2진수를 입력받아 10진수로 바꾸는 프로그램을 작성하시오
//		
//		String str = "01001101";
//		int total = 0;
//		int num = 0;
//		
//		char[] ch = str.toCharArray();
//		for(int i = ch.length; i >= 0; i--) {
//			if(ch[i] == 0) {
//				total += 0;
//			}else if(ch[i] == 1) {
//				for(int j = 0; j < i; j++ ) {
//					num = num*2;
//				}
//				total = total + num;
//			}
//		}
		
		
		 String str = "01001101";
	      
	      // 2진법 -> 10진법으로 
	      // 각 자리에 0 또는 1에 대하여 현재 자리의 2의 자리수 제곱
	      char[] ch = str.toCharArray();
	      
	      // System.out.println(Arrays.toString(ch));
	      System.out.print(ch);
	      
	      int squ = 0;
	      
	      for(int i = 0; i < ch.length; i++) {
	         int digit = ch[i] - '0';
	         
	         squ = squ * 2 + digit;
	      }
	      
	      System.out.print("(2)" + " = " + squ + "(10)");
	   

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
