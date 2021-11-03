package ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx7
 */
@WebServlet("/ServletEx7")
public class DoingLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DoingLogin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() throws ServletException {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/webapp?characterEncoding=UTF-8&serverTimezone=UTC";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "javajava");	//change on macbook's workbench
//			out.println("________  DBMS�� ���������� ����Ǿ����ϴ�.  ________");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF=8");
		response.setContentType("text/html;charset=UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pwd");
		PrintWriter out = response.getWriter();
		Statement stmt = null;
		ResultSet rs = null;
		MemberVO user = new MemberVO();
//		Member member = null;	//DTO VO bean
		out.println("<html>");
		out.println("<body>");
		try {
			stmt.getConnection().createStatement();
			rs = stmt.executeQuery("select * from members where ID='" + id + "'");
			if (rs.next()) {
				if (pw.equals(rs.getString("pwd"))) {
//					user.setId(rs.getString(id)).setPwd(rs.getString(pw))
//							.setName(rs.getString("Name"));
					out.println("ID : " + user.getId() + ", NAME : " + user.getName());
					out.print("<br><b>인증되었습니다.</b>");
				} else {
					out.println("PW X");
				}
			} else {
				out.print("ID X");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}

	public void destroy() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
