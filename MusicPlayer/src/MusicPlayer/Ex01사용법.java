package MusicPlayer;

import javazoom.jl.player.MP3Player;

public class Ex01사용법 {

	public static void main(String[] args) {

		// jar
		// : 일종의 java project를 압축해놓은 확장자
		// : 다른 사람이 개발해놓은 class 파일이 모아져있는 형태
		// : 일종의 라이브러리 라고 생각하면 된다
		
		// jar 파일 추가하는 방법
		// 프로젝트 선택 -> 마우스 우클릭 -> build path -> configure build path 
		// -> libraries 탭 선택 -> class path 선택 -> 우측에 add jars 클릭
		// -> 원하는 jar 파일 선택해서 추가 -> apply and close 하면 Libraries 추가가 됨
		
		
		// 노래 재생을 가능하게 해주는 도구 생성
		MP3Player mp3 = new MP3Player();
		
		// 1) 노래 재생하기
		mp3.play("C:\\Users\\ggg\\Desktop\\JavaStudy\\MusicPlayer\\Player\\밤양갱.mp3");
		
		// 2) 노래 멈추기
		mp3.stop();
		// 노래 재생을 했다면 꼭 멈추고 다음 노래 재생하기!!!!!!
		
		// 3) 노래 재생여부 판단
		System.out.println(mp3.isPlaying());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
