package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class Addition  extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)
			throws ServletException,IOException{
PrintWriter pw=res.getWriter()	;
res.setContentType("text/html");
int v1=Integer.parseInt(req.getParameter("v1"));
int v2=Integer.parseInt(req.getParameter("v2"));
int v3=v1+v2;
pw.println("Sum:"+v3+"<br>");
RequestDispatcher rd=req.getRequestDispatcher("input.html");
rd.include(req, res);
		
}
}