package JavaFestival;

import java.util.Arrays;
import java.util.Random;

public class Ex18 {

	public static void main(String[] args) {

		// 문제 18
		// 중복이 없이 숫자를 뽑는 로또 프로그램을 만드시오
		
		int[] array = new int[6];
		Random ran = new Random();
		
		array[0] = ran.nextInt(6) + 1;
		
		for (int j = 1; j < array.length; j++) {
			array[j] = ran.nextInt(6) + 1;
			for (int i = 0; i < j; i++) {
				if (array[j] == array[i]) {
        // 위에 있는 j++를 거치면 무조건 +1이 되는데 그곳이 중복이 되었을 수 있기에 
	    // -1을 해주어 중복을 막고 다시 반복
                 j--;
				}
			}

		}
		
		for(int j = 0;j < 6;j++){
		System.out.println("행운의 숫자 : " + array[j]);
		}
		
//		System.out.println("행운의 숫자 : " + array[1]);
//		System.out.println("행운의 숫자 : " + array[2]);
//		System.out.println("행운의 숫자 : " + array[3]);
//		System.out.println("행운의 숫자 : " + array[4]);
//		System.out.println("행운의 숫자 : " + array[5]);
		



		
		
}
}