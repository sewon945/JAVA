package Java시험;

public class MusicVO {
	private String title;
	private String singer;
	private int playTime;

	
	
	public MusicVO(String title, String singer, int playTime) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
	}

	
	
	public String getTitle() {
		return title;

	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public void setPlayTime(int playTime) {
		this.playTime = playTime;
	}

	public String toString() {
		return ("제목 :" + title + "가수 : " + singer + "시간 : " + playTime);

	}
}