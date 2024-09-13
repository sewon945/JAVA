package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	
	// Controller
	
	// DAO : Data Access Object
	// DB에 관련된 기능들을 전부 가지고 있는 클래스
	Connection conn = null;
	PreparedStatement psmt = null;

	// 연결
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			String user = "hr";

			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 닫기
	public void dbClose() {

		try {
			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 전체 회원 조회
	public ArrayList<DTO> searchMember() { // 원래 리턴타입은 void였는데 return을 사용하기 위해 DTO로 리턴타입 바꿔주기
		                                   // 그리고 return이 list로 바껴서 리턴타입을 ArrayList<DTO>로 바꿔주기
		String sql = "select * from datamember";
		ResultSet rs = null; // ResultSet : select 절을 통한 테이블 형식 데이터를 받아올 수 있는 타입

		// 사용자정보 전부 Ex02회원관리로 넘기기
		// 힌트 1. ArrayList 사용 (DTO는 사람 하나만 알려주는 것)
		// 힌트 2. id, pw, name, age 를 다룰 수 있는 class 생성
		DTO dto = null;
		
		// dto를 담아줄 ArrayList 생성
		ArrayList<DTO> list = new ArrayList<DTO>(); // <> 안에는 자료형 넣어주기
		try {
			conn();  // DB 연결(Ex02에서 연결하지 않고 여기서 연결하기)
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			// ** rs.next() : DB에서 원래는 id,pw,name,age에 있는 칸을 첫 번째 칸이라고 
                     // 지정을 하는 것인데 rs.next()를 쓰면 한 칸 내려서 첫 번째 회원을 가리켜주는 것임
			         // => rs.next()를 써서 커서를 한 칸 내려서 데이터가 있으면 true 없으면 false
			while (rs.next()) { 
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				
				// 조회해 온 결과(rs)에 담겨있는 데이터(id,pw,name,age)를 DTO에 옮겨서 하나로 묶어주었다
				// 지역변수인 DTO dto를 while문 안에 써줘서 return할 때 오류가 생겨서
				// try 밖인 위로 빼서 전역변수로 바꿔주기
				dto = new DTO(id, pw, name, age); // 객체 생성할 거다
				
				// ArrayList를 이용해서 모든 회원 하나로 묶어주는 작업
				list.add(dto);
				
//				System.out.println("ID : " + id + "PW : " + pw + "NAME : " + name + "AGE : " + age);

			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // 여기서 finally를 해놓으면 회원관리에서 하지 않아도 됨 
			dbClose();
		}

		return list;
		
	}

	// 로그인 기능
	public String loginUser(String inputId, String inputPw) {
		String sql = "select age,name from datamember where id = ? and pw = ?";
		ResultSet rs = null;

		String name = "";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputId);
			psmt.setString(2, inputPw);

			// executeQuery --> 쿼리문을 통해서 테이블에 있는 데이터에 영향을 끼치지 않을 때 사용되어진다!
			rs = psmt.executeQuery(); // DB에 보내서 출력한 것

			// rs.nest() : 다음 행에 데이터가 있는지 확인하는 기능 / rs => resultset
			if (rs.next()) { // rs.next()가 없으면 결과가 나오지 않는다
				// rs.getString(2) : 결과데이터 중 두 번째 컬럼에 있는 데이터를 문자열데이터로 받아오겠다는 뜻이다.
				name = rs.getString(2);
//				System.out.println("이름 출력 : " + name);  
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return name; // return : 내가 메소드를 사용하는 공간에서 이 값을 가지고 있게 하겠다는 뜻

	}

	// 회원 정보 수정
	public int updateUser(String inputName, String inputId) {

		String sql = "UPDATE DATAMEMBER SET NAME = ? WHERE ID = ?";
		int row = 0;

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputName);
			psmt.setString(2, inputId);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;

	}

	// 회원 가입
	public int insertUser(String id, String pw, String name, int age) {

		String sql = "INSERT INTO DATAMEMBER VALUES(?, ?, ?, ?)";
		int row = 0;

		try { // trycatch 사용하는 이유 : 외부랑 연결하고 싶을 때 trycatch문을 사용하는데
				// try를 실행하되 오류가 나면 catch문을 실행하세요
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;

	}

	// [5]회원삭제, 삭제 기능
	public int deleteUser(String inputId) {
		String sql = "delete from datamember where id = ?";

		int row = 0;

		try {
			// 현재 이 작업이 자바 뿐만 아니라 외부에서도 하니까 그 작업은 확정지을 수 없어서 뭘 할지 모르니까 try catch 문 사용
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputId);
			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return row;

	}
//	public int updateUser(String inputId, String inputName) {
//
//		String sql = "UPDATE DATAMEMBER SET NAME = ? WHERE ID = ?";
//		int row = 0;
//		try {
//			row = psmt.executeUpdate();
//			psmt.setString(1, inputName);
//			psmt.setString(2, inputId);
//
//			psmt = conn.prepareStatement(sql);
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		return row;
//
//	}

}