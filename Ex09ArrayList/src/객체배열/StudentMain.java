package 객체배열;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		// Student 객제 2개 저장할 수 있는 배열
		Student[] stuArr = new Student[2];

		// * 생성자를 호출해서 객체를 생성하게 되면 해당 객체의 참조값(주소값)을 반환
		// Student s1 = new Student("오세원", 1, 1);
		// stuArr[0] = s1;
		stuArr[0] = new Student("오세원", 1, 1); // 위 두 개를 한 번에 쓴 것
		stuArr[1] = new Student("최지원", 2, 3);

		stuArr[0] = new Student("김미희", 1, 20);
		stuArr[1] = new Student("이은비", 2, 12);

		for (int i = 0; i < stuArr.length; i++) {
			System.out.println(stuArr[i].getName() + ", " + stuArr[i].getBan() + "반, " + stuArr[i].getNum() + "번");
		}
//		System.out.println(stuArr[0].getName() + ", " + stuArr[0].getBan() + "반, " +stuArr[0].getNum() + "번");
//		System.out.println(stuArr[1].getName() + ", " + stuArr[1].getBan() + "반, " +stuArr[1].getNum() + "번");

		// 좀 더 간결하게 별칭 지정
		for (int i = 0; i < stuArr.length; i++) {
			Student s = stuArr[i];
			System.out.println(s.getName() + ", " + s.getBan() + "반, " + s.getNum() + "번");
		}

		// for~each : 배열/ arraylist의 0번부터 끝에 객체까지 차근차근 꺼내고 싶을 때 사용
		for (Student s : stuArr) {
			System.out.println(s.getName() + ", " + s.getBan() + "반, " + s.getNum() + "번");
		}

		
		Scanner sc = new Scanner(System.in);
		
		// 입력한 값으로 초기화 시킨 객체를 저장할 arraylist 활용
		ArrayList<Student> al = new ArrayList<Student>();

		for (int i = 0; i < 2; i++) {
			System.out.print("이름 >> ");
			String name = sc.next();
			System.out.print("반 >> ");
			int ban = sc.nextInt();
			System.out.print("번호 >> ");
			int num = sc.nextInt();

			Student s = new Student(name, ban, num);

			// 저장하기
			al.add(s);
		}

		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i).getName());
			System.out.println(al.get(i).getBan());
			System.out.println(al.get(i).getNum());
		}
		
		
		


	}

}
