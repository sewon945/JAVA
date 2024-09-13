package 월급관리프로그램;

public class PartTimeEmployee extends Employee {
	// 자식클래스
	
//	// 사번
//	private String empno;
//	// 이름
//	private String name;
//	// 일당
//	private int pay;
	// 일수
	private int workDay;

	// 필드 (생성자메소드)
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
		this.workDay = workDay;
	}

	// 메소드
	// getMoneyPay - 월급여 계산 후 리턴
	public int getMoneyPay() {
		return pay * workDay;
	}
//	// print - 사번 : 이름 : 연봉 리턴
//	public String print() {
//		return empno + ":" + name + ":" + pay;
//	}

}
