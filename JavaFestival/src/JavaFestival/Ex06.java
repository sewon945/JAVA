package JavaFestival;

public class Ex06 {

	public static void main(String[] args) {

		// (77*1) + (76*2) + (75*3) +...+ (1*77)를 계산하여 결과를 출력하시오
		// 79079

		int sum = 0;

		for (int i = 1; i <= 77; i++) {
			sum += (78 - i) * i;
		}
		System.out.println(sum);

	}

}
