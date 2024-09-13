package 월급관리프로그램;

public class TempEmployee extends Employee {
	// 자식클래스
	
//	// 사번
//	private String empno;
//	// 이름
//	private String name;
//	// 연봉
//	private int pay;

	// 필드(생성자 메소드)
	public TempEmployee(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	// 메소드
	// getMoneyPay - 월급여 계산 후 리턴
	public int getMoneyPay() {
		return pay / 12;
	
	}
//	// print - 사번 : 이름 : 연봉 리턴
//	public String print() {
//		return empno + ":" + name + ":" + pay;
//	}

}
