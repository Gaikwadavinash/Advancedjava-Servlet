package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class ServletContexandConfig extends GenericServlet {
	public ServletContext stc=null;
	public ServletConfig sc=null;
@Override
public void init()throws ServletException{
stc=this.getServletContext();
sc=this.getServletConfig();
}

@Override
public void service(ServletRequest req,ServletResponse res)
throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.getContentType();
String uname=req.getParameter("uname");
int a=Integer.parseInt(stc.getInitParameter("a"));
int b=Integer.parseInt(sc.getInitParameter("b"));
pw.println("Welcome:"+uname);
pw.println("<br>===Servlet Context===");
pw.println(" <br>Context Parameter Value:"+a);
pw.println("<br>Server Info:"+stc.getServerInfo());


pw.println("<br>===Servlet Config===");
pw.println("<br> Config Parameter Value:"+b);
pw.println("<br>Server Info:"+sc.getServletName());
}
@Override
public void destroy() {
	
}
}

