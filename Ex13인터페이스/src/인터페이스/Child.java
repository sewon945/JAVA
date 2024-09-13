package 인터페이스;

public class Child extends Employee implements Temp, Temp2 {
	                                 // 인터페이스는 다중구현 가능

	public Child(String empno, String name, int pay) {
		super(empno, name, pay);
		
	}

	@Override
	public void temp() {

	}

	@Override
	public int getMoneyPay() {
		return 0;
	}

}
