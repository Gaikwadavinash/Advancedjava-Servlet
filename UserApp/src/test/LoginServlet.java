package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
@Override
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ServletContext sct=this.getServletContext();
//RegBean2 rb3= new RegBean2();
 boolean z=new LoginDAO().login(req, sct);
if(z){	
RegBean rb=(RegBean)sct.getAttribute("bean");
String uName=rb.getlName();
Cookie ck=new Cookie("UserName",uName);	
res.addCookie(ck);
pw.println("Welcome:"+uName+"<br>");
RequestDispatcher rd=req.getRequestDispatcher("Link.html");	
rd.include(req, res);
}else {
pw.println("UserName and PassWord Invalid...")	;
RequestDispatcher rd=req.getRequestDispatcher("Login.html");
rd.include(req, res);
}
}
}
