package JDBC기초;

public class DTO {
	
	// Data Transfer Object : 데이터를 이동할 수 있게 하는 나만의 자료형
	// Table마다 한 개씩
	// Table의 컬럼을 필드로가진다.
	
	// Model
	
	// 1. 필드 설계
	private String id;
	private String pw;
	private String name;
	private int age;
	
	
	// 2. 메소드 만들기(생성자, 게터 세터)
	public DTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	
	
	

}
