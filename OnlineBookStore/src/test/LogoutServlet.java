package test;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LogoutServlet extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res) 
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
Cookie ck[]=req.getCookies();
ck[0].setMaxAge(0);
pw.println("User Logged Out Sucessfully....");
RequestDispatcher rd=req.getRequestDispatcher("online.html");
rd.include(req, res);
}
}