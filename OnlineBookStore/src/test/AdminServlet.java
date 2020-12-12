package test;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class AdminServlet extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
RequestDispatcher rd=req.getRequestDispatcher("adminlogin.html");
rd.forward(req, res);
}
}