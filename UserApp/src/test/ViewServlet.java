package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class ViewServlet extends HttpServlet{
@Override
public void doGet(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
Cookie c[]=req.getCookies();
if(c==null) {
pw.println("Please Login ! First...");
RequestDispatcher rd= req.getRequestDispatcher("Login.html");
rd.include(req, res);
}else {
	String uName=c[0].getValue();
pw.println("Login Page:"+uName+"<br>");
RequestDispatcher rd=req.getRequestDispatcher("Link.html");
rd.include(req, res);
pw.println("<br>UserProfile<br>");
ServletContext sct=this.getServletContext();
RegBean rb=(RegBean)sct.getAttribute("bean");
pw.println("<br>FirstName:"+rb.getfName());
pw.println("<br>LastName:"+rb.getlName());
pw.println("<br>Addr:"+rb.getAddr());
pw.println("<br>mid:"+rb.getMid());
pw.println("<br>phno:"+rb.getPhno());
}
	
}
}
