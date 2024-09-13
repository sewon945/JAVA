package 인터페이스;

public interface Temp {
	
	// 인터페이스(Interface)란?
	// 클래스들이 구현해야 하는 공통되는 기능들을 미리 지정(정의)
	// 작업 명세서(지켜야하는 규칙) 또는 프로젝트 설계도

	// 인터페이스의 특징
	// 1. 필드에 들어갈 수 있는 데이터는 반드시 상수여야한다.
	// 2. static 키워드가 있는 필드만 선언 가능하다.
	// 3. 필드에서 final, static 키워드 생략이 가능하다.
	// 4. 추상메소드만 가질 수 있다.
	// 5. 추상메소드 선언할 때 abstract 키워드 생략이 가능하다.
	
	
	// 1) 하나의 클래스가 여러 개의 인터페이스를 구현할 수 있다.(다중구현 가능)
	// 2) 객체 생성이 불가능하다
	// 3) 필드에 들어갈 수 있는 데이터는 변수 선언이 불가능하다(상수로만 선언가능 / final, static 생략가능)
	// 4) 추상 메소드만 선언 가능하다(public abstract 생략가능)
	// 5) 접근제한자 protected 사용 불가능
	// 6) Java7 버전 이후로 static, default 키워드가 붙어있으면 일반 메소드도 선언 가능
	
	// 1. 필드
	int num = 0;
	// 2. 메소드(강제성을 주는 설계도)
	public void temp();
	
	// 6) Java 7버전 이후
	// -> default, static 키워드 사용하여 일반메소드 선언도 가능
	static void temp2() {
		
	}

	
	// class 클래스 implements 인터페이스
	// implements : 구현하다 -> 여러 개의 인터페이스 구현가능! 다중구현(다중상속) 가능!
	
	// 인터페이스 vs 추상클래스
	// 인터페이스 : 특정 메소드 강제 구현
	//         : 다중 구현 상속을 사용하고 싶은 경우
	//         : 관련 없는 클래스들이 특정 interface를 구현받게 하고 싶은 경우
	// => HAS -A "~을 할 수 있는"
	// 추상클래스 : 클래스들 사이에 동일한 코드 사용
	//         : 다양한 접근제한자를 사용하고 싶은 경우
	//         : 객체의 상태를 저장, 수정하고 싶은 경우
	// => IS - A "~이다."
	
	// 추상메소드 사용 -> 재사용도 증가
	// 해당 클래스의 구분을 추상클래스 상속을 통해 해결하고, 할 수 있는 기능들을 인터페이스로 구현
}
