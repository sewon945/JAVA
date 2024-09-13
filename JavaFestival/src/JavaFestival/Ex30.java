package JavaFestival;

import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {

		// 입력된 문장에 포함된 알파벳의 빈도를 대소문자 구별없이 구하는 프로그램을 작성하시오

		Scanner sc = new Scanner(System.in);
		System.out.println("===== 알파벳 빈도수 구하기 =====");
		System.out.print("입력 >> ");
		String str = sc.nextLine(); // Line-> 띄어쓰기
		String str2 = str.toLowerCase(); // String 변수의 모든 문자를 소문자로 변환하는 메소드
		System.out.println(str2);

		// 입력받은 문장을 쪼개서 배열로 담아주는 메소드
		char[] ch = str2.toCharArray();
		System.out.println(Arrays.toString(ch));

		int[] cnt = new int[26]; // 알파벳을 카운트 할 변수

		for (int j = 0; j < ch.length; j++) {
			// j --> 입력받은 글자 하나하나 가져오는 과정(smart Media)
			for (int i = 97; i <= 122; i++) {
				// 배열에서 알파벳 하나를 가져와서 a~z까지 확인하는 반복문
				if (ch[j] == i) {
					cnt[i - 97] += 1;
					// i-97은 97-97이 돼어 0번방을 확인시켜줌
				}
			}
		}

		// 출력해보기
		for (int i = 97; i <= 122; i++) {
			System.out.println((char) i + ":" + cnt[i - 97]); // char 강제 형 변환
		}

	}

}
