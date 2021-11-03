package ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogOutServlet extends HttpServlet {
	ServletContext context;
	private static final long serialVersionUID = 1L;
     
    public LogOutServlet() {
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
		context = getServletContext();
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		String user_id = request.getParameter("user_id");

		session.invalidate();

//		List user_list = (ArrayList) context.getAttribute("user_list");
//		user_list.remove(user_id);
//		context.removeAttribute("user_list");
//		context.setAttribute("user_list", user_list);
		
		out.println("<html lang=\"ko\"> \r\n"
				+ "<head> \r\n"
				+ "<meta charset=\"UTF-8\"> \r\n"
				+ "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n"
				+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \r\n"
				+ "<title>초이스카 로그아웃</title> \r\n"
				+ "<style> * { box-sizing: border-box; } \r\n"
				+ "body { margin: 0; padding: 0; color: #ffffff; font-size: 15px; } \r\n"
				+ "input, textarea, button { color: #ffffff; font-size: 15px; } \r\n"
				+ "input:focus, textarea:focus, button:focus { outline: none; } \r\n"
				+ "textarea { resize: none; } h3 { margin: 0 0 12px 0; font-size: 45px; text-align: center; text-transform: uppercase; } \r\n"
				+ "p { padding: 0 10px; margin: 0 0 55px 0; text-align: center; line-height: 1.8; } \r\n"
				+ ".wrapper { min-height: 100vh; display: flex; align-items: center; } \r\n"
				+ ".form-container { max-width: 767px; margin: auto; padding: 70px 100px 80px; border: 10px solid #95c6db; background: #39459b; box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.2); } \r\n"
				+ ".form-group { position: relative; display: block; margin-bottom: 48px; } \r\n"
				+ ".form-group span { position: absolute; top: 11px; color: #04a5db; font-size: 15px; cursor: text; transition: all 0.2s ease; transform-origin: 0 0; } \r\n"
				+ ".form-group span.border { position: absolute; left: 0; top: 41px; width: 100%; height: 2px; display: block; background: #ffffff; transform: scaleX(0); transition: all 0.15s ease; } \r\n"
				+ ".form-control { width: 100%; height: 43px; display: block; font-size: 15px; border: none; border-bottom: 2px solid #04a5db; background: none; } \r\n"
				+ ".form-control:focus, .form-control:valid { border-bottom: 2px solid #ffffff; } \r\n"
				+ ".form-control:focus + span, .form-control:valid + span { transform: translateY(-22px) scale(0.8); } \r\n"
				+ ".form-control:focus + span + .border, .form-control:valid + span + .border { transform: scaleX(1); } \r\n"
				+ "textarea.form-control { padding: 13px 1px; } button[type=\"submit\"] { width: 162px; height: 51px; display: flex; align-items: center; justify-content: center; margin: 60px auto 0; padding: 0; color: #ffffff; border: 2px solid #ffffff; border-radius: 4px; background-color: #39459b; cursor: pointer; text-transform: uppercase; transition: background-color 0.2s linear; } \r\n"
				+ "button[type=\"submit\"]:hover { background-color: #299cd1; } \r\n"
				+ "@media(max-width:767px) { h3 { font-size: 38px } \r\n"
				+ "p { padding: 0; font-size: 14px; } \r\n"
				+ ".wrapper { background: #39459b; border: 10px solid #95c6db; } \r\n"
				+ ".form-container { width: 100%; padding: 24px; border: none; box-shadow: none; } } \r\n"
				+ "</style> \r\n"
				+ "</head> \r\n"
				+ "<body> \r\n"
				+ "<script>\r\n"
				+ "	function fn_sendMember(){\r\n"
				+ "		var frmMember = document.frmMember;\r\n"
				+ "		asdf;\r\n"
				+ "		ffewjj\r\n"
				+ "	}\r\n"
				+ "</script>\r\n"
				+ "<div class=\"wrapper\"> \r\n"
				+ "<div class=\"form-container\"> \r\n"
				+ "\r\n"
				+ " <form name=\"frmLogin\" method=\"post\" action=\"main.jsp\"  encType=\"UTF-8\"><h3>�α׾ƿ� �Ϸ�</h3> \r\n"
				+ "<p>즐거운 하루 보내세요.</p> \r\n"
				+ "\r\n"
				
				+ "\r\n"
				+ "<button type=\"submit\">홈으로</button> \r\n"
				
				+ "</script>\r\n"
				+ "</form>\r\n"
				+ "</div> \r\n"
				+ "</div> \r\n"
				+ "</body> \r\n"
				+ "</html>\r\n"
				+ "");
		
	}

}
