package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class LogoutServlet1 extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
HttpSession hs=req.getSession(false);
if(hs==null) {
pw.println("Login First...");
RequestDispatcher rd=req.getRequestDispatcher("userLogin.html");
rd.include(req, res);
}else {
hs.removeAttribute("fName");
hs.invalidate();
pw.println("User Sucessfully logged Out......");
RequestDispatcher rd=req.getRequestDispatcher("productLogin.html");
rd.include(req, res);
}
}
}
