package ex01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import ex01.DBAction;

//import ex01.MemberVO;

public class MemberDAO {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
	private static final String user = "root";
	private static final String pwd = "javajava";	//change in macbook because of mysql
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private DataSource dataFactory;

	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		try {
			connDB();
			String query = "select * from members";
			System.out.println(query);
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				System.out.println("rs next");
				String id = rs.getString("id");
				String pwd = rs.getString("pwd");
				String name = rs.getString("name");
				String email = rs.getString("email");
				Date cre_date = rs.getDate("cre_date");
				MemberVO vo = new MemberVO();
				vo.setId(id);
				vo.setPwd(pwd);
				vo.setName(name);
				vo.setEmail(email);
				vo.setCre_date(cre_date);
				list.add(vo);
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public void addMember(MemberVO memberVO) {
		try {
			System.out.println("dao insert");
			Class.forName(driver);
			System.out.println("jdbc 연결 성공 ");
			conn = DriverManager.getConnection(url, user, pwd);
			
			System.out.println("Connection 생성 ");
			String id = memberVO.getId();
			String pwd = memberVO.getPwd();
			String name = memberVO.getName();
			String email = memberVO.getEmail();
			Date cre_date = memberVO.getCre_date();
			Date mod_date = memberVO.getMod_date();
			String query = "insert into members";
			
			
			query += " (id,pwd,name,email,cre_date,mod_date)";
			query += " values(?,?,?,?,?,?)";
			System.out.println("prepareStatememt: " + query);
			pstmt = conn.prepareStatement(query);
			System.out.println("p-Statement 생성 ");
			
			pstmt.setString(1, id);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.setDate(5, cre_date);
			pstmt.setDate(6, mod_date);
			pstmt.executeUpdate();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delMember(String id) {
		try {
			Class.forName(driver);
			System.out.println("jdbc 연결 성공");
			conn = DriverManager.getConnection(url, user, pwd);
//			conn = DBAction.getInstance().getConnection();
			System.out.println("Connection 생성");
//			stmt = conn.createStatement();
		
			String query = "delete from members" + " where id=?";
			System.out.println("prepareStatememt:" + query);
			pstmt = conn.prepareStatement(query);
			System.out.println("pStatement 생성");
			pstmt.setString(1, id);
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean isExisted(MemberVO memberVO) {
		boolean result = false;
		String id = memberVO.getId();
		String pwd = memberVO.getPwd();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, user, "javajava");
//			String query = "select decode(count(*),1,'true','false') as result from members";

			String query = "select pwd from members where id=?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				if (pwd.equals(rs.getString(1))) { // ��й�ȣ�� �Բ� ���Ͽ� �α����� ����
					System.out.println("성공");
					result=true;
				} else {
					System.out.println("비밀번호 불일치");
					
				}
			}
			System.out.println(query);
			System.out.println("result=" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("jdbc 연결 성공");
			conn = DriverManager.getConnection(url, user, pwd);
//			conn = DBAction.getInstance().getConnection();
			System.out.println("Connection 생성");
			stmt = conn.createStatement();
			System.out.println("Statement 생성");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
