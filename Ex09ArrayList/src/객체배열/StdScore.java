package 객체배열;

public class StdScore {

	private String name;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;

	public StdScore(String name, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public String getName() {
		return name;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;

	}
}
