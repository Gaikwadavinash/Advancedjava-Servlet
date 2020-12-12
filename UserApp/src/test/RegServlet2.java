package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
public class RegServlet2 extends HttpServlet{
	@Override
public void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ServletContext sct=this.getServletContext();
RegBean rb=(RegBean)sct.getAttribute("bean");
rb.setAddr(req.getParameter("addr"));
rb.setMid(req.getParameter("mid"));
rb.setPhno(Long.parseLong(req.getParameter("phno")));
InsertDAO id= new InsertDAO();
int k=id.insert(sct);
if(k>0) {
pw.println("Register Sucessfully....<br>");
pw.println("=======");
RequestDispatcher rd=req.getRequestDispatcher("Login.html");
rd.include(req, res);
}//end if
}
}
