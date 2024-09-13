package 탐색;

public class Ex01순차탐색 {

	public static void main(String[] args) {

		// 순차탬색 : 0번부터 끝번호까지 하나하나 비교해서 찾는 방법
		// : 정렬이 되어있을 필요가 없다!
		int[] array = { 13, 35, 15, 11, 26, 72, 78, 13, 61, 90 };

		// 내가 찾고자 하는 숫자
		int num = 78;

		// 78은 6번 인덱스에 있습니다! (출력)
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				// 숫자를 찾은 경우 (조건문이 맞은 경우)
				System.out.println(num + "은 " + i + "번에 있습니다!");
				break; // 값이 위의 78처럼 중복되지 않고 하나만 있을 경우에 더이상 뒤쪽을 확인하지 않도록 멈춰줌!
			}
		}

	}

}
