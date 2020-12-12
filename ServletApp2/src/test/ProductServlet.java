package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class ProductServlet extends GenericServlet{
@Override
public void init()throws ServletException{
	//NoCode
}
@Override
public void service(ServletRequest req, 
		ServletResponse res) 
		throws  IOException,ServletException {
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
String pCode=req.getParameter("pcode");
String pName=req.getParameter("pname");
float pPrice=Float.parseFloat(req.getParameter("pprice"));
int pQty=Integer.parseInt(req.getParameter("pqty"));
pw.println("===Display Product Details===");
pw.println("<br> ProductCode:"+pCode);
pw.println("<br> ProductName:"+pName);
pw.println("<br> ProductPrice:"+pPrice);
pw.println("<br> ProductQty:"+pQty);
}
	@Override
	public void destroy() {
	//NoCode
	}
}



