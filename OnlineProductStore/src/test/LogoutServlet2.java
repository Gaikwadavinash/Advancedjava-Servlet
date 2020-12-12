package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LogoutServlet2 extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
HttpSession hs=req.getSession(false);
hs.invalidate();
pw.println("Admin Logged SucessFully......");
RequestDispatcher rd=req.getRequestDispatcher("productLogin.html");
rd.include(req, res);
}
}
