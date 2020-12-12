package test;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class UserServlet extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
RequestDispatcher rd=req.getRequestDispatcher("userLogin.html");
rd.forward(req, res);	
}
}
