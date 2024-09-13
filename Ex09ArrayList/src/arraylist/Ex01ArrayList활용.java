package arraylist;

import java.util.ArrayList;

public class Ex01ArrayList활용 {

	public static void main(String[] args) {

		
		

		//기본타입 : int , char , long..        => 저장못함
		//레퍼런스타입 : Integer , Character     => 저장 가능

		//<> : Generic

		//ArrayList<>
		//new ArrayList<Integer>();  => 컴파일이 일어나는 동시에 데이터의 형태가 결정됨
                            // 	     => 데이터의 형태가 잘못들어가는 것 방지
		//HashMap<> 
		

		// 1. ArrayList 생성
		
		// <> : Generic
		//           <데이터타입>(어레이리스트의 기본 크기 , (생략가능)->크기 10)
		// new Random();
		//       <데이터타입 - 필수>
		ArrayList<String> al = new ArrayList<>();
		
		// 레퍼런스타입 : 기본적으로 저장 가능 
		
		
		// 2. 데이터 삽입(맨 뒤에 추가)
		// 앞에서 문자열 타입 String으로 넣는다고 했으니 여기도 문자열로 넣기
		al.add("Hello");
		al.add("Java");
		al.add("Database");
		
		
		// 3. 데이터의 개수
		int size = al.size();
		System.out.println("데이터 개수 : " + al.size());
		// --> 앞에서 데이터 삽입을 총 3개를 해줬기에 콘솔창에 3개가 나온다

		
		// 4. 데이터 삽입 (중간에 (특정 인덱스에) 추가)
		al.add(2, "Python");
		// 배열처럼 헬로가 0번에 자바가 1번에 데이터베이스가 2번방에 있었는데 파이썬을 2번방에 넣는다고 해서
		// 데이터베이스가 3번방으로 밀리고 2번방에 파이썬이 들어왔다
		System.out.println("데이터 개수 : " + al.size());
		// --> 데이터가 하나가 더 추가 되었으니 4 출력
		
		// al.add(5, "Javascript");
		// size 보다 큰 위치에는 추가 불가능!!
		// --> 4번을 건너뛰고 5번에 넣으려고 하니까 오류뜸 
		// --> 어레이에서는 이것처럼 빈공간이 있으면 안된다!!
		
		System.out.println();
		
		// 5. 특정 위치(인덱스)의 데이터 가져오기
		String data1 = al.get(0);  // 1번에 있는 것을 가지고 온다는 뜻
		System.out.println(data1);
		System.out.println(al.get(1));  // 위에 두줄을 짧게 쓴 것
		System.out.println(al.get(2));  // 위에 두줄을 짧게 쓴 것
		System.out.println(al.get(3));  // 위에 두줄을 짧게 쓴 것
		// System.out.println(al.get(4));  // 범위를 벗어남 (오류)
		
		System.out.println();
		
		// 일반 for문
		for(int i = 0; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println();
				
		// for~each문(포이치문) : 배열, arraylist (순서가 있는 자료구조) 다룰 때 사용
		// 0번 인덱스의 데이터부터 차례대로 꺼내주는 형태
		for(String s:al) {  // ( :배열 레퍼런스 변수 이름 )
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4};
		for(int i:arr) {
			System.out.println(i);
		}
		
		// 6. 데이터 삭제(특정 위치 데이터 삭제)
		al.remove(1);
		for(String s:al) {  // ( :배열 레퍼런스 변수 이름 )
			System.out.println(s);
		}
		// --> 어레이는 절대로 빈공간이 없다!!(1번인 Java가 뒤로 밀린 것)
		
		// 7. 데이터 삭제(전부 삭제)
		al.clear();
		System.out.println(al.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
