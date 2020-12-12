package test;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class UserServlet extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
RequestDispatcher rd=req.getRequestDispatcher("userlogin.html");
rd.include(req, res);
}
}
