package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class EditServlet extends HttpServlet  {
@Override
public void doGet(HttpServletRequest req,HttpServletResponse res )
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
Cookie c[]=req.getCookies();
if(c==null) {
pw.println("<br>Please Login ! First..<br>");
RequestDispatcher rd=req.getRequestDispatcher("Login.html");
rd.include(req, res);
}else {
	String uName=c[0].getValue();
ServletContext sct=this.getServletContext();
RegBean rb=(RegBean)sct.getAttribute("bean");
pw.println("<form action='update' method='post'>");
pw.println("Address:<input type='text' name='addr' value='"+rb.getAddr()+"'><br>");
pw.println("mId    :<input type='text' name='mid'  value='"+rb.getMid ()+"'><br>");
pw.println("phno   :<input type='text' name='phno' value='"+rb.getPhno()+"'><br>");
pw.println("<input type='Submit' value='UpdateProfile'>");
pw.println("</form>");
}
}
}