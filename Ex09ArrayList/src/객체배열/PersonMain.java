package 객체배열;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person("강예진",21);
		Person p2 = new Person("임경남",20);
		
		
		// Person 타입의 객체 2개를 저장할 수 있는 배열 생성
		Person[] arrPerson = new Person[2];
		arrPerson[0] =p1;
		arrPerson[1] =p2;
		
		System.out.println(arrPerson[0].getName());
		//System.out.println(arrPerson[0]); => 이렇게만 적으면 값을 찾아올 수 없다
		System.out.println(arrPerson[0].getAge());
		
		// 0번과 1번에 저장되어있는 Person의 이름과 나이 출력
		// ~~(이름)의 나이는 ~~(나이)입니다   ex) 강예진의 나이는 21입니다
		// 반복문 사용
		for(int i = 0; i < arrPerson.length; i++) {
		System.out.println(arrPerson[i].getName() + "의 나이는 " + arrPerson[i].getAge() + "입니다");
		}
//		System.out.println(arrPerson[1].getName()+"의 나이는 "+arrPerson[1].getAge()+"입니다");
//		System.out.println(arrPerson[0].getName());
//		System.out.println(arrPerson[0].getAge());
//		System.out.println(arrPerson[1].getName());
//		System.out.println(arrPerson[1].getAge());
		
		
		
		
		
		
		
		
		
	}

}
