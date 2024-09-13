package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PhoneDAO {
	// dao : data access object
	// 데이터 접근 객체

	// 클래스 - 필드(변수), 메소드

	Connection conn;

	public void getConn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 연결 준비

			String user = "hr";
			String pw = "12345";
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

			// 지역변수 - try문 안에서만 알고 있음 --> 전역변수로 바꿔줘야함
			conn = DriverManager.getConnection(url, user, pw);

			if (conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 전화번호 추가 기능
	public int insertPhone(PhoneDTO dto) {

		getConn();
		// 쿼리문 작성

		String sql = "insert into phone values(?,?,?)";

		// 쿼리문이 지나갈 수 있는 통로 - preparedStatement
		// connection
		try {
			PreparedStatement psmt = conn.prepareStatement(sql);

			// ? 채워주기
			psmt.setString(1, dto.getName());
			psmt.setString(2, dto.getPhone_num());
			psmt.setInt(3, dto.getAge());

			// 쿼리문 통과 코드 쓰기 execultUpdate는 inset, updat, delete에서만 사용 가능
			int row = psmt.executeUpdate(); // 실행된 행의 개수를 리턴

			return row;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

}
