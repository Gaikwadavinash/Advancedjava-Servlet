package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class ServletInsert extends GenericServlet {
public InsertDAO3 ob3;
	@Override	
public void init() throws ServletException{
	ob3= new InsertDAO3();
}
@Override
public void service(ServletRequest req,ServletResponse res)
		throws IOException,ServletException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
int k=ob3.insert(req);
if(k>0) {
	pw.println("Data Inserted SucessFully..");
}
}
@Override
public void destroy() {
	try {
	DBConnection.getCon().close();	
	}catch(Exception e) {e.printStackTrace();}
}
}