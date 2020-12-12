package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet2 extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException ,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");

ServletContext sct=this.getServletContext();
boolean z= new LoginDAO2().login(req, sct);
if(z) {
	
RegBean rb2=(RegBean)sct.getAttribute("bean2");
String uName=rb2.getfName();
Cookie ck1=new Cookie("userName",uName);
res.addCookie(ck1);
pw.println("WelCome:"+uName+"<br>");
RequestDispatcher rd=req.getRequestDispatcher("link2.html");
rd.include(req, res);
}else {
pw.println("UserName and PassWord Invalid...")	;
RequestDispatcher rd=req.getRequestDispatcher("adminlogin.html");
rd.include(req, res);	
}
}
}
