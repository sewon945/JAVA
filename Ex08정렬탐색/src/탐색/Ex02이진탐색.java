package 탐색;

public class Ex02이진탐색 {

	public static void main(String[] args) {

		// 이진탐색
		// 변수 3개를 사용해서 데이터를 탐색하는 알고리즘
		// lowIndex, highIndex, middleIndex
		// 장점 : 시간 복잡도가 1/2로 빠른 탐색 속도를 가지고 있음
		// 단점 : 정렬이 이미 되어있는 리스트에서만 사용 가능!

		// 1. 정렬이 된 배열 선언
		int[] array = { 1, 7, 16, 25, 30, 33, 41, 66, 78, 90 };

		// 2. lowIndex : 최소 index 값으로 초기화
		int lowIndex = 0;

		// 3. highIndex : 배열이 가지는 최대 index 값으로 초기화
		int highIndex = array.length - 1;

		// 4. 내가 찾고자하는 숫자 하나 정하기!
		int num = 78;

		while (true) {
			// 5. middleIndex 값 초기화
			int middleIndex = (lowIndex + highIndex) / 2;
			if (array[middleIndex] == num) {
				// 중간값과 num이 같다면 위치 출력
				System.out.println(middleIndex);
				break;
			} else {
				// 중간값과 다르다면
				// 중간값보다 작은지, 큰지를 판단해서
				// lowIndex, highIndex 값을 다시 설정!
				if (array[middleIndex] > num) {
					// 중간값보다 num이 작은 경우
					highIndex = middleIndex - 1;
				} else {
					// 여기로 들어왔다는 건 중간값보다 num이 큰 경우
					lowIndex = middleIndex + 1;
				}
			}

		}

	}

}
