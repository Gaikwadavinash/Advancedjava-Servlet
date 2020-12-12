package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class LoginServlet2 extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ServletContext sct1=this.getServletContext();
boolean z=new LoginDAO2().login(req,sct1);
if(z) {
	HttpSession hs=req.getSession();
	String fName=(String)sct1.getAttribute("fName");
	hs.setAttribute("fName", fName);
	pw.println("Welcome:"+fName);
RequestDispatcher rd=req.getRequestDispatcher("link2.html");
rd.include(req, res);
}
else {
pw.println("Please Login First..");
RequestDispatcher rd=req.getRequestDispatcher("adminLogin.html");
rd.include(req, res);
}
}
}
