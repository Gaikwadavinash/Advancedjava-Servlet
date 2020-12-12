package test;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EditServlet2 extends HttpServlet{
	public boolean z;
public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
Cookie ck1[]=req.getCookies();
if(ck1==null) {
pw.println("<br>Please Login First...");
RequestDispatcher rd=req.getRequestDispatcher("adminlogin.html");
rd.include(req, res);
}else {
	String uName=ck1[0].getValue();
ServletContext sct=this.getServletContext();
boolean  z=new BookDAO().bookcheck(req,sct);
RegBean2 rb3=(RegBean2)sct.getAttribute("bean3");
if(z) {
pw.println("<form action='update' method='post'>");
pw.println("BookName:<input type='text' name='bname' value='"+rb3.getbName()+"'><br>");
pw.println("BookAuthor :<input type='text' name='bauthor'  value='"+rb3.getbAuthor()+"'><br>");
pw.println("BookPrice:<input type='text' name='bprice' value='"+rb3.getbPrice()+"'><br>");
pw.println("BookQty:<input type='text' name='bqty' value='"+rb3.getbQty()+"'><br>");
pw.println("<input type='Submit' value='UpdateBook'>");
pw.println("</form>");
}else {
pw.println("<br>Invalid BookCode ");
RequestDispatcher rd=req.getRequestDispatcher("edit.html");
rd.include(req, res);
}
}
	
	
	
}
}
