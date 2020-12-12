package test;
import javax.servlet.*;
import java.io.*;
@SuppressWarnings("serial")
public class BookDetails extends GenericServlet{
	@Override
	public void init() throws ServletException{
	//No Code
	}
	@Override
public void service(ServletRequest req,ServletResponse res)
		throws IOException,ServletException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
String bCode=req.getParameter("bcode");
String bName=req.getParameter("bname");
float bPrice=Float.parseFloat(req.getParameter("bprice"));
int bQty=Integer.parseInt(req.getParameter("bqty"));
pw.println("==Dispaly the Book Details==");
pw.println("<br> BookCode:"+bCode);
pw.println("<br> BookName:"+bName);
pw.println("<br> BookPrice:"+bPrice);
pw.println("<br> BookQty:"+bQty);
}
@Override
public void destroy() {

}
	}


