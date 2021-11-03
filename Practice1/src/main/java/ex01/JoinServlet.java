package ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
@WebServlet("/list")
//ȸ������ �� ����ϴ� ��. 
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public JoinServlet() {
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
	      MemberDAO dao=new MemberDAO();
	      PrintWriter out=response.getWriter();
	      String command=request.getParameter("command");
	      
	      if(command!= null && command.equals("join")){
			 String _id=request.getParameter("id");
			 String _pwd=request.getParameter("pwd");
			 String _name=request.getParameter("name");
			 String _email=request.getParameter("email");
			 DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				Date date = new Date();        
				String _date = dateFormat.format(date);
			 MemberVO vo=new MemberVO();
			 vo.setId(_id);
			 vo.setPwd(_pwd);
			 vo.setName(_name);
			 vo.setEmail(_email);
			 vo.setCre_date((java.sql.Date) date);
		     dao.addMember(vo);
	      }else if(command!= null && command.equals("delMember")) {
	    	  String id = request.getParameter("id");
	    	  dao.delMember(id);
	      }
	       List list=dao.listMembers();
	     out.print("<html><title>초이스카 회원리스트 정보</title><body><div style=\"text-align: center;\">");
	     out.print("<br><br><h1 text align:center>회원정보</h1><br><table border=1 align=center><tr align='center' bgcolor='skyblue'>");
	     out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td >삭제</td></tr>");
	    
	     for (int i=0; i<list.size();i++){
	 		MemberVO memberVO=(MemberVO) list.get(i);
	 		String id=memberVO.getId();
	 		String pwd = memberVO.getPwd();
	 		String name = memberVO.getName();
	 		String email =memberVO.getEmail();
	 		Date joinDate = memberVO.getCre_date();
	 		out.print("<tr><td>"+id+"</td><td>"
	 			                +pwd+"</td><td>"
	 			                +name+"</td><td>"
	 			                +email+"</td><td>"
	 			                +joinDate+"</td><td>"
	 		                    +"<a href='/Practice1/member?command=delMember&id="+id+"'>삭제 </a></td></tr>");

	 	 }
	 	 out.print("</table></div></body></html>");
//		 	response.sendRedirect("/Practice1/list"); ���������� ���ѷ���. ��� �ؾ� ������ �ٽ� �� ����Ʈ �c������ ���� �����غ���
//	 	 	�Ƹ� ������ ���̵�� ���������� ����Ʈ ���̰� �ϰ� �������� �׳� member�� / list ���� �־ �Ͼ�� �����ε� �ϴ�.


	  }
}

