package 월급관리프로그램;

public class RegularEmployee extends Employee {
	// 자식클래스

//	// 사번
//	private String empno;
//	// 이름
//	private String name;
//	// 연봉
//	private int pay;
	// 보너스
	private int bonus;

	// 필드 (생성자메소드)
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno, name, pay);
		// 내 부모의 이름을 그대로 가져와서 뒤에 소괄호()만 쓴다는 말 
		// --> super(); 내 부모의 기본생성자메소드만 가져와서 쓴다는 말인데 
		// 부모클래스에 생성자메소드를 만들어줬기에 중복되어 () 안에만 적어주면 된다
		// => 부모한테 있는 생성자 메소드를 쓸 수 있다!!
		this.bonus = bonus;
	}

	// 메소드
	// getMoneyPay - 월급여 계산 후 리턴
	public int getMoneyPay() {
		return (pay + bonus) / 12;

	}
//	// print - 사번 : 이름 : 연봉 리턴
//	public String print() {
//		return empno + ":" + name + ":" + pay;
//	}

}
