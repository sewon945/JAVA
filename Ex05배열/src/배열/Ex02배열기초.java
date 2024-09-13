package 배열;

public class Ex02배열기초 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		// 배열의 길이
		// --> 변수명.length;
		int length = numbers.length;
		System.out.println("배열의 길이 : " + length);

		// 배열의 각 칸을 5의 배수로 초기화하세요.
		numbers[0] = 5; // 5*1
		numbers[1] = 10; // 5*2
		numbers[2] = 15; // 5*3
		numbers[3] = 20; // 5*4
		numbers[4] = 25; // 5*5

		for (int i = 0; i < numbers.length; i++) { // numbers.length => 숫자5
			numbers[i] = 5 * (i + 1);
		}

		for (int i = 0; i < numbers.length; i++) { // numbers.length => 5
			System.out.print(numbers[i] + "\t");
		}
        // \t => tap이 되어 console창에서 탭 형태로 나타남
		// \(역슬레시) - enter 위에 있음
		
		
		
		// 풀이 (반복되기에 위 같이 for문으로 사용 가능)

//		System.out.print(numbers[0]+" ");
//		System.out.print(numbers[1]+" ");
//		System.out.print(numbers[2]+" ");
//		System.out.print(numbers[3]+" ");
//		System.out.print(numbers[4]+" ");

		
		
		System.out.println();
		
		// 배열을 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = {"오세원", "강예진", "조준용"};
		// --> names 라는 배열을 설정해서 0번에는 오세원이라는 데이터를,
		//     1번에는 강예진이라는 데이터, 3번에는 조준용이라는 데이터 설정
		
		// 강예진 데이터 출력하기
		System.out.println(names[1]);
		
		
		
		
		
		
		
		
		
		
		
	}

}
