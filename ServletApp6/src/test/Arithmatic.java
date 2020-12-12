package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class Arithmatic extends GenericServlet {
	@Override
public void service(ServletRequest req,ServletResponse res)
throws ServletException,IOException{
String s=req.getParameter("s");		

if(s.equals("Add")) {
RequestDispatcher rd=req.getRequestDispatcher("add");
	rd.forward(req,res);
	}else {
	RequestDispatcher rd=req.getRequestDispatcher("sub");
	rd.forward(req,res);
}
}
}
