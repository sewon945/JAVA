package OOP기초;

public class MemberMain {
	// 실행할 수 있는 공간!!
	public static void main(String[] args) {

		// 1. 클래스 설계도면을 기반으로 객체를 생성
		// (객체를 생성할 때에는) 자료형 변수명 = new(레퍼런스) 자료형();
		Member m1 = new Member();
		System.out.println(m1);
		System.out.println(m1.getName());
		// field에 아무런 겂도 넣지 않았을 때는 가본값이 세팅된다
		// String --> null
		// int    --> 0
		
		// m1.name = "오세원";
		m1.setName("오세원");
		System.out.println(m1.getName());
		
		// 내 나이, id
		//m1.age = 24;
		m1.setAge(24);
		//m1.id = "energizer710";
		m1.setId("energizer710");
		System.out.println(m1.getAge());
		System.out.println(m1.getId());
		
		
		// 하나의 설계도로 여러 개의 객체가 생성 가능!
		// 여러분 옆자리 친구의 정보를 저장하는 m2 이름의 객체를 생성, 안에 저장된 데이터 모두 출력
		Member m2 = new Member();
		// 멤버 클래스를 가지고 = 객체를 만든 것임
		
		//m2.name = "박민수";
		m2.setName("박민수");
		//m2.age = 30;
		m2.setAge(30);
		//m2.id = "minsu11";
		m2.setId("minsu11");
		System.out.println(m2.getName());
		System.out.println(m2.getAge());
		System.out.println(m2.getId());
		
		m1.kakakoTalk("여러분 안녕!");
		// 에러 arguments --> () 안에 매개변수를 String 타입으로 넣어주지 않아서 오류가 남
		
		
		
		// 초기값을 알고 있을 때에는 각각 생성하지 않고 동시에 사용하기
		// 객체 생성과 동시에 필드를 초기화하는 방법!
		// 이름: 정연희  나이: 20  아이디: smhrd
		      //new Member();  ==>  멤버 객체만 만들어지고 필드는 초기화되지 않은 상태
		Member m3 = new Member("정연희" , 20 , "smhrd");
		System.out.println(m3.getName());
		System.out.println(m3.getAge());
		System.out.println(m3.getId());
		
		
		
		
		
		
		
	}

}
