package test;
import javax.servlet.*;

import java.io.*;

public class ServletFirst extends GenericServlet {

	public void init()throws ServletException{
	//No Code
}
public void service(ServletRequest req,ServletResponse res)throws
IOException,ServletException
{
	PrintWriter pw=res.getWriter();
res.setContentType("text/html");
pw.println("WelCome To Servlet Programming.....");

}	
@Override
public void destroy(){
	//No Code
}
	

}
