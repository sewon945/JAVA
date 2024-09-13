package MusicPlayer;

import java.util.ArrayList;
import java.util.Scanner;

import javazoom.jl.player.MP3Player;

public class MusicMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1. 노래 재생시키는 도구 생성
		MP3Player mp3 = new MP3Player(); // MP3Player() 생성자 메소드

		// 공통 경로
		String comPath = "C:\\Users\\ggg\\Desktop\\JavaStudy\\MusicPlayer\\Player\\";

		// 2. 노래 데이터 생성
		// 우리가 설계한 Music 자료형을 기반으로 Music 객체 생성
//		Music m1 = new Music(comPath + "Magnetic.mp3", "Magnetic", "아일릿");

		// 노래를 전부 저장하는 musicList 만들기(ArrayList)
		ArrayList<Music> musicList = new ArrayList<Music>();

		// musicList에 노래 추가하기
		musicList.add(new Music(comPath + "Magnetic.mp3", "Magnetic", "아일릿"));
		musicList.add(new Music(comPath + "Smart.mp3", "Smart", "르세라핌"));
		musicList.add(new Music(comPath + "밤양갱.mp3", "밤양갱", "비비"));
		musicList.add(new Music(comPath + "첫만남은계획대로되지않아.mp3", "첫 만남은 계획대로 되지않아", "TWS"));
		musicList.add(new Music(comPath + "한페이지가될수있게.mp3", "한 페이지가 될 수 있게", "DAY6"));
		System.out.println(musicList.size());
		
		int i = 0;   // 몇 번째 곡인지 기억하는 변수(기능을 초시화시키는 게 아니라 다음곡으로 가기 위해 기억시키는 것)
		
		while (true) {
			System.out.print("[1]재생 [2]정지 [3]이전곡 [4]다음곡 [5]종료 >> ");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("======재생======");
				// 1) 노래가 재생중인지 여부 확인
				if (mp3.isPlaying()) {
					// 2) 노래가 재생중이라면 노래 멈추기
					mp3.stop();
				}
				// 3) musicList에서 0번방에 있는 노래 재생
				// 노래 재생을 위해서 필요한 데이터는?
				// 필요한 데이터를 musicList의 0번방에서 가져올 수 있는 방법은?
				mp3.play(musicList.get(i).getPath()); // (musicList.get(0)) --> 0번방에 있는 뮤직 하나인 객체!
				// (musicList.get(0).getPath()) --> musicList에 있는 0번방 객체를 가지고 올 것이다 라는 것임
				// 4) 가수 이름 - 노래 제목 재생중입니다. 라고 출력
				// ex) 아일릿 - Magnetic 재생중입니다.
				System.out.println(musicList.get(i).getSinger() + " - " 
				+ musicList.get(i).getTitle() + " 재생중입니다.");

			} else if (input == 2) {
				System.out.println("======정지======");
				// 1) 노래 재생 여부 확인
				if (mp3.isPlaying()) {
					// 2) 노래가 재생중이라면 노래를 멈추고 '노래르 정지합니다!'라고 출력
					mp3.stop();
					System.out.println("노래를 정지합니다!");
				} else {
					// 3) 재생중이 아니라면 '재생중인 노래가 없습니다.' 출력
					System.out.println("재생중인 노래가 없습니다.");
				}

			} else if (input == 3) {
				System.out.println("======이전곡======");
				// 1) 노래가 재생중인지 여부 확인
				if(mp3.isPlaying()) {
					// 2) 노래가 재생중이라면 노래 멈추기
					mp3.stop();
				}
				// 3) musicList의 이전곡 재생
				if(i >= 0) {
					i--;
					mp3.play(musicList.get(i).getPath());
					// 4) 가수 - 제목 재생중입니다. 출력
					System.out.println(musicList.get(i).getSinger() 
							+ " - " + musicList.get(i).getTitle() + " 재생중입니다.");
				}else {
					// 5) 단, 이전곡이 없다면 '이전곡이 없습니다.' 출력
					System.out.println("이전곡이 없습니다.");
		
				}
				
			} else if (input == 4) {
				System.out.println("======다음곡======");
				// 1) 노래가 재생중인지 여부 확인
				if (mp3.isPlaying()) {
					// 2) 노래가 재생중이라면 노래 멈추기
					mp3.stop();
				}
				// 3) musicList의 다음곡 재생
				// 0-->1 / 3-->4 재생
				if(i < 4) { // i가 4일 때 4가 4보다 작니? 하면 다음곡(5번째곡)이 없으니 else로 가서 마지막 곡 재생
					i++;   // 다음곡이 있을 때만 +1 --> 다음곡이 있는지 확인부터 해야함
					
					mp3.play(musicList.get(i).getPath());
					// 4) 가수 - 제목 재생중입니다. 출력
					System.out.println(musicList.get(i).getSinger() 
							+ " - " + musicList.get(i).getTitle() + " 재생중입니다.");
				}else {
					// 5) 단, 다음곡이 없다면 '다음곡이 없습니다.' 출력
					// ---> 다시 재생을 누른다면 musicList의 마지막 곡이 재생되도록 만들기
					// ** 우리 노래는 딱 5곡 있다는 거 기억하기!
					System.out.println("다음곡이 없습니다.");
					i = 4; // 다시 재생을 눌렀을 때 4로 고정될 수 있도록 마지막 곡 재생
				}
				
				
			} else if (input == 5) {
				System.out.println("======종료======");

				break;

			} else {
				System.out.println("숫자를 잘못 입력하셨습니다 ^^;");
			}

		}

	}

}
