package test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class LoginServlet1 extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ServletContext sct1=this.getServletContext();
boolean z= new LoginDAO1().login(req,sct1);
if(z) {
	String fName=(String)sct1.getAttribute("fName");
	HttpSession hs=req.getSession();
	hs.setAttribute("fName",fName);
	sct1.removeAttribute("fName");
	pw.println("<br>Welcome:"+fName+"<br>");
RequestDispatcher rd=req.getRequestDispatcher("link1.html");
rd.forward(req, res);
}else {
pw.println("Invalid UserName and PassWord");
RequestDispatcher rd=req.getRequestDispatcher("userLogin.html");
rd.include(req, res);
}
}
}
