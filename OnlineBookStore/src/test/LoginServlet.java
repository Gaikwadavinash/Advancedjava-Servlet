package test;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LoginServlet extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ServletContext sct=this.getServletContext();
boolean z=new LoginDAO().login(req, sct);
if(z) {
//RegBean rb=(RegBean)sct.getAttribute("bean");
//String uName=rb.getfName();
//Cookie ck= new Cookie("userName",uName);
//res.addCookie(ck);
//	pw.println("WelCome:"+uName+"<br>");
	String fName=(String)sct.getAttribute("fName");
HttpSession hs=req.getSession();
hs.setAttribute("fName",fName);
sct.removeAttribute("fName");
pw.println("Welcome:"+fName+"<br>");
RequestDispatcher rd=req.getRequestDispatcher("link.html");	
rd.include(req, res);
}else {
	pw.println("UserName and PassWord Invalid...")	;
	RequestDispatcher rd=req.getRequestDispatcher("userlogin.html");
	rd.include(req, res);
}
}
}
