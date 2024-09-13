package phone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import model.PhoneDAO;
import model.PhoneDTO;

public class phone {

	public static void main(String[] args) {

		// 1. 동적로딩

		PhoneDAO dao = new PhoneDAO();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("========================전화번호 관리부=====================");
			System.out.print("1.전체 번호 조회 2. 번호 추가 3. 번호 삭제 4. 번호 수정 5. 이름으로 번호 찾기 6. 종료");
			int select = sc.nextInt();
			if (select == 6) {
				System.out.println("종료합니다.");
				break;
			} else if (select == 1) {

			} else if (select == 2) {
				System.out.print("이름을 입력하세요  ");
				String name = sc.next();
				System.out.print("번호를 입력하세요  ");
				String phoneNum = sc.next();
				System.out.print("나이를 입력하세요  ");
				int age = sc.nextInt();
				int row = dao.insertPhone(new PhoneDTO(name, phoneNum, age));
				
				if (row > 0) {
					System.out.println("insert success");
				} else {
					System.out.println("insert fail");
				}

			} else if (select == 3) {
				System.out.print("삭제할 이름을 입력하세요!");
				String d_name = sc.next();

			} else if (select == 4) {
				System.out.print("수정 할 번호의 이름을 입력하세요");
				String u_name = sc.next();
				System.out.print("수정 할 번호를 입력하세요 ");
				String u_num = sc.next();

			} else if (select == 5) {
				System.out.println("검색 할 이름을 입력하세요");
				String s_name = sc.next();

			}
		}

	}

}
