package ex01;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DBAction {
	private static DBAction instance = new DBAction();
	private Connection conn;
	private DataSource ds;

	public DBAction() {
//		String driver = "com.mysql.cj.jdbc.Driver"; // mysql
//		String url = "jdbc:mysql://localhost:3306/app?characterEncoding=UTF-8&serverTimezone=UTC";
//
//		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url, "root", "java");
////			System.out.println("________  DBMS에 정상적으로 연결되었습니다.  ________");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		try {
			InitialContext initctx = new InitialContext();
			Context ctx = (Context) initctx.lookup("java:/comp/env");
			ds = (DataSource) ctx.lookup("jdbc/oracle");

		} catch (NamingException e) {
			e.printStackTrace();
		}
	}

	public static DBAction getInstance() {
		if (instance == null) {
			instance = new DBAction();
		}
		return instance;
	}

	public Connection getConnection() {
		return conn;
	}

	public void close() {
		try {
			if (conn != null)
				conn.close();
		} catch (Exception e) {

		}
	}
}
