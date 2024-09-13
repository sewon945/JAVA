package 은행관리프로그램;

public class Bankbook {

	// 은행 관리 프로그램을 만든다고 가정!
	// 통장을 관리할 수 있는 우리만의 자료형을 만든다! --> 설계도
	
	
	// 1. Field(Data, 속성)
	// 잔액(money)
	private int money;
	// private으로 정보은닉을 지켜주어야 한다! (사용자가 임의로 변경하는 것을 막기 위해서 감추기)
	// 접근제한자 private : BankMain에서도 다른 사람들이  접근하지 못하게 하는 것
	// --> 설계할 때부터 아무나 접근이 가능하도록 해놔서 누구나 내 통장에 직접적으로 접근 가능
	// --> 설계(BankBook)할 때 접근이 불가능하도록 만들어놔야함

	
	
	// 2. Method(Logic, 행위, 기능)
	// 입금하다(deposit)
	public void deposit(int money) {
		this.money += money;
		// this : 현재 이 클래스를 가리키는 키워드
	}
	// money 라는 글씨의 색을 자세히 보면 파랑색과 연갈색으로 나뉘는데 색 구별을 잘 해줘야한다.
	// 매개변수의 개수를 최대한 줄이기 위해서 num이 아닌 money라는 키워드로 바꿔준 것
	// 그러기 위해서는 구별을 잘 해주어야 한다.
	// 매개변수의 money가 아닌 이 클래스의 money로 바꿔주어야 한다
	
	
	
	// 출금하다(withdraw)
	// return 없음
	// 매개변수로 정수형 하나 받아서 현재 잔액에서 빼주기
	public void withdraw(int money) {
		this.money -= money;
	}
	

	// 잔액 확인하기(showMoney)
	// return 있음
	// 매개변수X, 현재 잔액 리턴
	public int showMoney() {
		return money;
	}
	
	
	
	
	
}
