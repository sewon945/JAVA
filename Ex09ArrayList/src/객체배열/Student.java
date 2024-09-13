package 객체배열;

public class Student {

	// 기본구조
	// 먼저 Student의 객체 생성
	private String name;
	private int ban;
	private int num;
	
	
	
	// 생성자 추가 alt shift s => 필드
	public Student(String name, int ban, int num) {
		super();
		this.name = name;
		this.ban = ban;
		this.num = num;
	}

	// alt shift s => Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
