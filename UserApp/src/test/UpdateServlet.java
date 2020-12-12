package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class UpdateServlet extends HttpServlet{
@Override
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
Cookie c[]=req.getCookies();
if(c==null) {
pw.println("Login ! first....<br>")	;
RequestDispatcher rd=req.getRequestDispatcher("Login.html");
rd.include(req, res);
}else {
String uName=c[0].getValue();
pw.println("Login Page:"+uName+"<br>");
RequestDispatcher rd=req.getRequestDispatcher("Link.html");
rd.include(req, res);
ServletContext sct=this.getServletContext();
RegBean rb=(RegBean)sct.getAttribute("bean");
rb.setAddr(req.getParameter("addr"));
rb.setMid(req.getParameter("mid"));
//rb.setPhno(Long.parseLong(req.getParameter("phno")));
int k= new UpdateDAO().update(rb);
if(k>0) {
pw.println("<br>Profile Updated Sucessfully..");
}
}	
}
}
