package test;
import javax.servlet.*;
import java.io.*;
public class ServletFirst {
public void init()throws ServletException{
	//NoCode
}
public void Service(ServletRequest Req,ServletResponse res)throws 
IOException,ServletException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
pw.print("WelCome Servlet Programming.....");

}
public void destroy() {
	//NoCode
}
}
