package ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowMember
 */
@WebServlet("/show")
public class ShowMember extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
     }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		doHandle(request, response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String id ="", pwd="", email="";
        Boolean isLogon=false;
        HttpSession session =  request.getSession(false);			

        if( session != null){
	    isLogon=(Boolean)session.getAttribute("isLogon");
           if(isLogon==true){ 
	        id = (String)session.getAttribute("login.id");
	        pwd = (String)session.getAttribute("login.pw");
//	        email=(String)session.getAttribute("login.email");
//	        out.print(email);
//	        out.print("�̸��Ͽ�");
   	        out.print("<html><body>");
//	        out.print(id+"<h2>");
//	        out.print(pwd+"<h2>");   
//	        out.println("<a href='logout?user_id=" + id + "'>�α׾ƿ� </a>");
   	        
   	        
   	     out.println("<%@ page language=\"java\" contentType=\"text/html; charset=UTF-8\"\r\n"
	        		+ "    pageEncoding=\"UTF-8\"%>\r\n"
	        		+ "<!DOCTYPE html> \r\n"
	        		+ "\r\n"
	        		+ "@WebServlet(\"/login\")\r\n"
	        		+ "<html lang=\"ko\"> \r\n"
	        		+ "<head> \r\n"
	        		+ "<meta charset=\"UTF-8\"> \r\n"
	        		+ "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"> \r\n"
	        		+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \r\n"
	        		+ "<title초이스카 로그인</title> \r\n"
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
	        		+ "	\r\n"
	        		+ "</script>\r\n"
	        		+ "<div class=\"wrapper\"> \r\n"
	        		+ "<div class=\"form-container\"> \r\n"
	        		+ "\r\n"
	        		+ " \r\n"
	        		+ " <h2>아이디 : ");
	        out.print(id+"<h2>");
	        out.print("<h2>비밀번호 : ");
	        out.print(pwd+"<h2>");
	        
	        out.print("<button type=\"submit\" onClick=\"bye()\" >로그아웃</button> \r\n"
	        		+ "");
	        out.print("<button type=\"submit\" onClick=\"location='main.jsp'\" >홈으로</button> \r\n"
	        		+ "<script>\r\n"
	        		+ "function bye(){ \r\n"
	        		+ "location.href='logout?user_id="
	        		+ "");
	        out.print(id+"';\r\n"
	        		+ "	}\r\n"
	        		+ "</script>\r\n"
	        		+ "</form>\r\n"
	        		+ "</div> \r\n"
	        		+ "</div> \r\n"
	        		+ "</body> \r\n"
	        		+ "</html>\r\n"
	        		+ "");
	        out.print("</body></html>");
	        
	        
	    }else{
	       response.sendRedirect("login.jsp");
	    }
         }else{
            response.sendRedirect("login.jsp");
        }
	}
}
