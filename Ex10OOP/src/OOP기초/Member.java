package OOP기초;

public class Member {

	// 나만의 자료형의 설계도!!
	// main method 포함 XXX

	// OOP(Object Oriented Programming) - 객체 지향 프로그래밍

	
	
	// 1. Field(Data, 속성)
	
	// 접근제한자   : private , default , protected , public
	// private   : 현재 클래스 안에서만 접근 가능
	// default   : 같은 패키지 안에서만 접근 가능
	// protected : 같은 패키지 안에 있거나 상속관계에 있는 경우
	// public    : 어디에서든 접근 가능 => 아무나 접근해서 값을 변경 혹은 사용할 수 있음
	// 접근제한자를 따로 작성하지 않으면 default
	
	// 이름
	String name;
	// 나이
	int age;
	// 아이디
	String id;

	
	
	// 2. Method(Logic, 행위, 기능)
	// + 필수 메서드 => 생성자(constructor)
	// 접근제한자 (반환타입(void 등)은 쓰지않는다) 메서드이름(클래스 이름과 아예 동일하게)(매개변수){필드초기화구문}
	// 객체 생성 시 사용하는 필수메서드 / 기본메서드인 Member m2 = new Member();에 있는 Member() 생성
	// String과 int의 순서는 Main에 있는 new Member("정연희" , 20 , "smhrd");와 순서를 맞게 작성해주어야 한다 
	public Member(String name, int age, String id) {
		this.name = name;
		this.age  = age;
		this.id   = id;
	}
	// 매개변수가 들어가지 않고 로직이 따로 없는 구조 => 기본 생성자
	// 클래스 안에 생성자를 아무것도 작성하지 않았을 경우에는 컴파일 시 컴파일러가 자동으로 생성
	// 생성자 오버로딩
	public Member() {
		
	}
	

	// 각 필드에 접근할 수 있는 메서드(규칙) => getter 메서드
	// 필드 하나하나 따로따로 접근 가능
	// name에 접근할 것이기에 String을 반환타입으로 써주고 get필드이름(앞글자 대문자)
	public String getName() {
		return name;
	}
	
	// 각 필드에 저장된 값을 수정 or 초기화 하는 메서드
	// => stter 메서드
	public void setName(String name) {
		this.name = name;
	}
	
	//alt + shift+s
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	// 카카오톡 메세지 보내기
	public void kakakoTalk(String msg) {
		System.out.println(name + "님이 " + msg + "을(를) 전송합니다.");
	}

	// 기프티콘 보내기
	public void gift() {
		System.out.println(name + "님이 선물을 보냅니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
