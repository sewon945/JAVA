package JavaFestival;

import java.util.Arrays;
import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {

		// 8칸 크기의 배열을 선언하고 랜덤수로 초기화 한 후 가장 큰 수와 작은 수를 각각 출력
		// 배열에 있는 모든 값 : 10 56 21 55 35 54 14 26
		// 가장 큰 값 : 56
		// 가장 작은 값 : 10
		
		int[] array = new int[8];
		
		Random num = new Random();
		// int array[] = num.nextInt(100)+1;
		
		for(int i =0; i < 8; i++) {
		array[i] = num.nextInt(100)+1;
		}
		
		int max = 0;
		int min = 101;
		
		for(int i = 0; i< 8; i++) {
			if(max < array[i]) {
				max = array[i];
			} 
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.println("배열에 있는 모든 값 : " + Arrays.toString(array));
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
		
		
		
		
		
		
		
		
	}

}
