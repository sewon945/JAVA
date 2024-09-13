package 인터페이스;

public abstract class Employee {
	// 부모클래스
	
	// 사번
	protected String empno;
	// 이름
	protected String name;
	// 연봉
	protected int pay;
	
	// protected : 상속관계에 있거나, 같은 패키지에 있는 클래스만 접근 가능하다.
	// private : 외부클래스 접근 불가하다, 노출되지 않게끔 해주는 것
	
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public abstract int getMoneyPay() ;
	// 추상메소드(abstract)는 접근제한자와 매개변수 사이에 넣는다
	
	// print - 사번 : 이름 : 연봉 리턴
	public String print() {
		return empno + "-" + name + "-" + pay;
	}
	
	// 눈에는 보이지 않지만 이 Employee 클래스에도 기본생성자메소드가 존재한다.
	
}
