package JavaFestival;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//???????????????????????????????????????????????
		
		// 알파벳 개수
		int count = 26;
		// 시작 알파벳
		char start = 'A';
		// 한 줄에 표시된 문자수
		int charCount = 1;
		// for문을 사용하여 A~Z까지 출력하시오.
		for (int i = 0; i < count; i++) {
			System.out.print(start + " ");
			if (charCount == 5) {
				// 한줄에 5개의 문자가 표시된다면 개행
				System.out.println();
				charCount = 0;
			}
			start++;
			charCount++;
		}
	}

}
