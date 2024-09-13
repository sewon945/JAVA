package 객체배열;

public class Person {

	private String name;
	private int age;
	public Person(String name, int age) {
		// super(); : 상속
		this.name = name;
		this.age = age;
	}
	
	public void talk() {
		// ~~(name)가 말한다 출력
		System.out.println(this.name + "가 말한다");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
