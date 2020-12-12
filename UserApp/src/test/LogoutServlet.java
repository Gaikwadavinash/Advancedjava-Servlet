package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class LogoutServlet extends HttpServlet{
@Override
	public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
Cookie c[]=req.getCookies();
c[0].setMaxAge(0);
pw.println("User Logged Sucessful..<br>");
RequestDispatcher rd=req.getRequestDispatcher("Login.html");
rd.include(req, res);
}
}