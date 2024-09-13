package javafestival;

public class Ex23 {

	public static void main(String[] args) {

		
		int[][] array = new int[5][5];
		int num = 1; 
		for(int j = 0; j <array.length; j++) {
			for(int i = array.length-1; i>-1; i--) {
				array[i][j] = num++;
			}
		}
		
		for(int j =0; j <array.length; j++) {
			for(int i =0; i< array.length;i++) {
				System.out.println(array[j][i] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
