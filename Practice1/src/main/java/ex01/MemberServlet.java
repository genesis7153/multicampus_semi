package ex01;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import ex01.MemberDAO;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public MemberServlet() {
        super();
        
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}
	protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//	      PrintWriter out=response.getWriter();	
//	      MemberDAO dao=new MemberDAO();
//	      List<MemberVO> list=dao.listMembers();
//		
//	      out.print("<html><body>");
//	      out.print("<table  border=1><tr align='center' bgcolor='lightblue'>");
//	      out.print("<td>���̵�</td><td>��й�ȣ</td><td>�̸�</td><td>�̸���</td><td>������</td></tr>");
//	      
//	      System.out.println("�����۵�");
//	     for (int i=0; i<list.size();i++){
//	    	System.out.println("�����۵�");
//			MemberVO memberVO=list.get(i);
//			String id=memberVO.getId();
//			String pwd = memberVO.getPwd();
//			String name=memberVO.getName();
//			String email=memberVO.getEmail();
//			Date cre_date = memberVO.getCre_date();
//			out.print("<tr><td>"+id+"</td><td>"+
//				                pwd+"</td><td>"+
//				                name+"</td><td>"+
//				                email+"</td><td>"+
//				                cre_date+"</td></tr>");		
//	      }
//	      out.print("</table></body></html>");
	      
	      
	      request.setCharacterEncoding("utf-8");
	      response.setContentType("text/html;charset=utf-8");
	      MemberDAO dao=new MemberDAO();
	      PrintWriter out=response.getWriter();
	      String command=request.getParameter("command");
	      
	      if(command!= null && command.equals("addMember")){
			 String _id=request.getParameter("id");
			 String _pwd=request.getParameter("pwd");
			 String _name=request.getParameter("name");
			 String _email=request.getParameter("email");
			 System.out.println("addmember");
//			 Date date = new SimpleDateFormat("dd/MM/yyyy");
//			 Date date = new Date();        
//			 String _date = dateFormat.format(date);
			 java.sql.Date _date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
//			 Date _date = new Date(0);
//			 _date.setTime(new java.util.Date().getTime());
//			 System.out.println(_date);
			 
			 MemberVO vo = new MemberVO();
			 vo.setId(_id);
			 vo.setPwd(_pwd);
			 vo.setName(_name);
			 vo.setEmail(_email);
			 vo.setCre_date(_date);
			 vo.setMod_date(_date);
		     dao.addMember(vo);
		     
	      }else if(command!= null && command.equals("delMember")) {
	    	  String id = request.getParameter("id");
	    	  dao.delMember(id);
	      }else if(command!=null && command.equals("member")) {
	    	  List list=dao.listMembers();
	 	     out.print("<html><body>");
	 	     out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
	 	     out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입</td><td >삭제</td></tr>");
	 	    
	 	     for (int i=0; i<list.size();i++){
	 	 		MemberVO memberVO=(MemberVO) list.get(i);
	 	 		String id=memberVO.getId();
	 	 		String pwd = memberVO.getPwd();
	 	 		String name = memberVO.getName();
	 	 		String email =memberVO.getEmail();
	 	 		Date cre_date = memberVO.getCre_date();
	 	 		out.print("<tr><td>"+id+"</td><td>"
	 	 			                +pwd+"</td><td>"
	 	 			                +name+"</td><td>"
	 	 			                +email+"</td><td>"
	 	 			                +cre_date+"</td><td>"
	 	 		                    +"<a href='/Practice1/member?command=delMember&id="+id+"'>삭제 </a></td></tr>");

	 	 	 }
	 	 	 out.print("</table></body></html>");
	      }
	}

}
