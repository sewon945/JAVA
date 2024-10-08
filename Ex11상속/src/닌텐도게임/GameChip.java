package 닌텐도게임;

public abstract class GameChip {
	// 닌텐도에 들어갈 수 있는 게임의 공통의 부모 클래스
	// 1. 추상클래스
	// -> 추상메소드를 하나라도 가지고 있다면 반드시 추상클래스가 되어야한다!
	// -> abstract 키워드 사용하여 선언한다.
	// -> 추상클래스도 일반메소드를 가지고 있을 수 있다.
	// -> 추상메소드 없이도 추상클래스를 만들 수는 있다
	
	public abstract void run();
	// 닌텐도게임이 되려면 run이라는 공통의 단어를 넣었으니 부모클래스인 여기에도 똑같이 run 넣어주기
	
	// 2. 추상메소드
	// -> {}가 없는 메소드!
	// -> 선언(틀 : 리턴타입, 매개변수, 메소드명)은 되어있으나 로직이 구현되어 있지 않은 메소드
	// -> abstract 키워드 사용하여 선언한다.
	
	
	// 형변환을 위한 틀이지 {} 안을 사용하진 못하기에 중괄호를 빼고
	// 추상메소드와 추상클래스를 만들어주기
	// 클래스 안에 추상 메소드가 하나라도 있으면 무조건 추상 클래스로 만들어줘야함
	// abstract : 추상화
	
	public void test() {
		System.out.println("테스트용 메소드");
	}

}
