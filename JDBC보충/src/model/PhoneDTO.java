package model;

public class PhoneDTO {
	// data transfer object
	// 데이터 변환 객체
	// 주로 데이터베이스의 컬럼과 맞춰서 작성
	
	// 필드 - 캡슐화 : 외부로부터 함부로 접근X
	
	private String name;
	private String phone_num;
	private int age;
	
	// 생성자 - 생성할 때 실행되는 코드
	// 생성자는 클래스명과 똑같이 만들어야함
	public PhoneDTO(String name, String phone_num, int age) {
		super();
		this.name = name;
		this.phone_num = phone_num;
		this.age = age;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
}
