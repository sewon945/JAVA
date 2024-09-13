package MusicPlayer;

public class Music {
	
	// MusicPlayer에서 사용할 우리만의 Music 자료형 만들기
	
	// 1. 필드
	// 1) 노래 데이터의 경로(주소, 위치) 
	private String path;
	// 2) 노래 제목
	private String title;
	// 3) 가수 이름
	private String singer;
	
	// 2. 메소드
	// 1) 모든 필드값을 채울 수 있는 생성자 메소드
	public Music(String path, String title, String singer) {
		this.path = path;
		this.title = title;
		this.singer = singer;
	}

	
	
	// 2) 모든 필드의 getter 메소드 만들기
	public String getPath() {
		return path;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getSinger() {
		return singer;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
