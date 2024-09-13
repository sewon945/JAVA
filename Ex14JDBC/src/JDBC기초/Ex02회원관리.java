package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02회원관리 {

	public static void main(String[] args) {
		// 디자인 패턴 : 계속해서 같은 문제가 발생하여 이런 문제를 해결하고자 형식, 규칙을 지정해놓은 것
		
		// MVC 패턴 
		// Model      : 데이터를 조작, 저장하기 위한 코드들의 모음
		// View       : 사용자에게 직접 보여지는 부분 (Java에서는 콘솔창)
		// Controller : 실제 기능이 일어나는 부분
		
		
		// View - 출력문이 있는 클래스
		
		DAO dao = new DAO();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.로그인 2.회원가입 3.회원전체조회 4.회원정보수정 5.회원삭제 6.프로그램종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 로그인

				try {
					System.out.print("로그인할 ID 입력 >> ");
					String inputId = sc.next();
					System.out.print("로그인할 PW 입력 >> ");
					String inputPw = sc.next();

					dao.conn();

					String name = dao.loginUser(inputId, inputPw); // 리턴 값인 name을 가지고 온거다
					// name == "" -> 로그인 실패
					// name != "" -> 로그인 성공
					if (name.equals("")) {
						System.out.println("로그인 실패 ㅠㅠ");
					} else {
						System.out.println("로그인 성공!!");
						System.out.println(name + "님 환영합니다^^"); // 그 리턴 값을 가지고 와서 출력가능 한 것이다
					}

					// 2. 로그인 쿼리문 실행
					// 쿼리문 select 사용
					// select name from datamember where id = ? and pw = ?
					// OOO님 환영합니다

				} catch (Exception e) {
					// TODO: handle exception
				} finally {
					dao.dbClose(); // 객체 닫아주기
				}

			} else if (menu == 2) {
				try {
					// 회원가입
					System.out.print("ID 입력 : ");
					String id = sc.next();
					System.out.print("PW 입력 : ");
					String pw = sc.next();
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("나이 입력 : ");
					int age = sc.nextInt();

//				Connection conn = null;
//				PreparedStatement psmt = null; ==> DAO에서 써줘서 사용하고 있음

//				try {
//
					dao.conn();

//               Class.forName("oracle.jdbc.driver.OracleDriver");
//
//               String url = "jdbc:oracle:thin:@localhost:1521:xe";
//
//               String user = "hr";
//
//               String password = "12345";
//
//               conn = DriverManager.getConnection(url, user, password);

//               if (conn != null) {
//                  System.out.println("DB연결 성공!");
//               } else {
//                  System.out.println("DB연결 실패!");
//               }

//					String sql = "INSERT INTO DATAMEMBER VALUES(?, ?, ?, ?)";
//
//					psmt = conn.prepareStatement(sql);
//
//					psmt.setString(1, id);
//					psmt.setString(2, pw);
//					psmt.setString(3, name);
//					psmt.setInt(4, age);
//
//					int row = psmt.executeUpdate();

					int row = dao.insertUser(id, pw, name, age);

					if (row > 0) {
						System.out.println("회원가입 성공! :)");
					} else {
						System.out.println("회원가입 실패ㅠㅠ");
					}

//				} catch (Exception e) {
//
//					e.printStackTrace();

				} catch (Exception e) {

				}

				finally {

					dao.dbClose();

//               try {
//                  if (psmt != null)
//                     psmt.close();
//
//                  if (conn != null)
//                     conn.close();
//
//               } catch (SQLException e) {
//                  e.printStackTrace();
//               }

				}
			} else if (menu == 3) {

				// 회원전체조회
				// 1. dao가 가지고 있는 serchMember메소드 사용
				ArrayList<DTO> resultList = dao.searchMember(); // DTO를 담을 수 있는 어레이리스트
				// 2. 결과값 출력
				// 회원의 아이디, 이름, 나이 출력
				System.out.println("아이디 \t 이름 \t 나이");

//				System.out.println(resultList.get(0).getId());  // resultList.get(0) = DTO -> 사람 한 명 조회
//				System.out.println(resultList.get(0).getName());
//				System.out.println(resultList.get(0).getAge());

				for (DTO d : resultList) {
					System.out.print(d.getId() + " \t");
					System.out.print(d.getName() + " \t");
					System.out.println(d.getAge());
				}

			} else if (menu == 4) {
				// 회원정보수정 --> DAO 클래스를 이용해서 만들어주세
				// 회원정보수정 -->UPDATE구문
				// 회원 아이디를 입력받아서 회원의 name을 수정해주세요!!
				System.out.print("변경시킬 회원 ID 입력 : ");
				String inputId = sc.next();
				System.out.print("변경할 Name 입력 : ");
				String inputName = sc.next();

				// DB에 접근해서 inputId를 가진 회원의 Name 을 inputName 을 바꿔줄꺼에요!!

//				Connection conn = null;
//				PreparedStatement psmt = null;

				try {
					// 1. Java와 DB를 연결짓는 통로 만들어 주기!!
					dao.conn();

//					Class.forName("oracle.jdbc.driver.OracleDriver");
//					String url = "jdbc:oracle:thin:@localhost:1521:xe";
//
//					String user = "hr";
//
//					String password = "12345";
//
//					conn = DriverManager.getConnection(url, user, password);

					// 2. 통로 안에 쿼리문을 실행시키기
//					String sql = "UPDATE DATAMEMBER SET NAME = ? WHERE ID = ?";
//
//					psmt = conn.prepareStatement(sql);
//
//					psmt.setString(1, inputName);
//					psmt.setString(2, inputId);
//
//					int row = psmt.executeUpdate();

					int row = dao.updateUser(inputName, inputId);

					if (row > 0) {
						System.out.println("정보수정완료");
					} else {
						System.out.println("정보수정실패");
					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 3. 연결정보 닫아주기!!(역순)
				finally {
					dao.dbClose();

//					try {
//						if (psmt != null)
//							psmt.close();
//
//						if (conn != null)
//							conn.close();
//
//					} catch (SQLException e) {
//						e.printStackTrace();
//					}

				}

			} else if (menu == 5) {
				// 회원삭제
				// 어느 회원을 삭제할지 ID값을 입력받기
				// 1. Java와 DB 연결
				// 2. Java와 DB가 연결된 통로에 쿼리문을 올려서 실행
				// 3. 연결정보 닫기

			} else if (menu == 6) {
				// 끝
				break;
			}

		}

	}

}