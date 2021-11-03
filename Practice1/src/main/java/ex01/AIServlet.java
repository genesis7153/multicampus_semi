package ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ai")
public class AIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public AIServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
//		String user_id = request.getParameter("user_id");
//		String user_pw = request.getParameter("user_pw");
		String name = request.getParameter("name");
//		System.out.println(user_id);
//		System.out.println(user_pw);
		System.out.println(name);
		
		out.print("<html><body>");
		out.print("안녕하세요 " + name + " 님 로그인하셨습니다. 좋은 하루 되세요 <br>");
		out.print("</body></html>");
		
		
	
	}

}
