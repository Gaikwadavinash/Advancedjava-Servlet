package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class BookUpdated  extends GenericServlet{
	public InsertDAO ob;
	@Override
public void init() throws ServletException{
		ob=new InsertDAO();
	}
public void service(ServletRequest req,ServletResponse res) 
throws IOException,ServletException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
int k=ob.insert(req);
if(k>0) {
	pw.println("Updated Sucessfully..");
}
}
public void destroy() {
	try {
DBConnection.getCon().close();		
	}catch(Exception e) {e.printStackTrace();}
}
}
