package test;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class AdminServlet extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
	PrintWriter pw=res.getWriter();
	res.setContentType("text/html");
	RequestDispatcher rd=req.getRequestDispatcher("adminLogin.html");
	rd.forward(req, res);	
}
}
