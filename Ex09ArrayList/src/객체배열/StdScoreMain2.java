package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class StdScoreMain2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		// ArrayList로 푸는법
		// StdScore 자료형을 보관할 수 있는 sList라는 이름의 ArrayList 생성
		ArrayList<StdScore> sList = new ArrayList<StdScore>();

		for (int i = 0; i < 3; i++) {
			System.out.print(i + 1 + "번째 학생의 이름을 입력하세요. >> ");
			String name = sc.next();
			System.out.print(i + 1 + "번째 학생의 Java점수를 입력하세요. >> ");
			int javaScore = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 Web점수를 입력하세요. >> ");
			int webScore = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 Android점수를 입력하세요. >> ");
			int androidScore = sc.nextInt();

			sList.add(new StdScore(name, javaScore, webScore, androidScore));  // 메서드 사용
			// new StdScore(name, javaScore, webScore, androidScore);
			// StdScore라고 하는 자료형 객체 생성 코드
			System.out.println();
		}

		for (StdScore s : sList) {
			int total = s.getScoreJava() + s.getScoreWeb() + s.getScoreAndroid();
			int avg = total / 3;
			System.out.println(s.getName() + "님의 총점은 " + total + ", 평균은 " + avg + "점 입니다");
		}

		
		
	}

}
