package 객체배열;

import java.util.Scanner;

public class StdScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 배열로 푸는 법
		StdScore[] arr = new StdScore[3];

		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + 1 + "번째 학생의 이름을 입력하세요. >> ");
			String name = sc.next();
			System.out.print(i + 1 + "번째 학생의 Java점수를 입력하세요. >> ");
			int javaScore = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 Web점수를 입력하세요. >> ");
			int webScore = sc.nextInt();
			System.out.print(i + 1 + "번째 학생의 Android점수를 입력하세요. >> ");
			int androidScore = sc.nextInt();

			arr[i] = new StdScore(name, javaScore, webScore, androidScore);
			// (생성자 메서드)
			System.out.println();

		}

		for (StdScore s : arr) {
			int total = s.getScoreJava() + s.getScoreWeb() + s.getScoreAndroid();
			int avg = total / 3;
			System.out.println(s.getName() + "님의 총점은 " + total + ", 평균은 " + avg + "점 입니다");
		}

//		int total = arr[0].getScoreJava()+arr[0].getScoreWeb()+arr[0].getScoreAndroid();
//		int avg = total/3;

		
		
	}

}
