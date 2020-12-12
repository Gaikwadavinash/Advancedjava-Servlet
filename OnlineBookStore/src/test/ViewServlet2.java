package test;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ViewServlet2 extends HttpServlet{
	//public ResultSet rs=null;
	//public boolean z;
public void doGet(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
Cookie ck1[]=req.getCookies();
if(ck1==null) {
pw.println("Please Login First..");
RequestDispatcher rd= req.getRequestDispatcher("adminlogin.html");
rd.include(req, res);
}else {
String uName=ck1[0].getValue();
pw.println("Login Page:"+uName+"<br>");
ServletContext sct=this.getServletContext();
//z=new LoginDAO3().login3(req,sct);
ArrayList<RegBean2> b1= new LoginDAO3().login();
//RegBean2 rb3 =new RegBean2();
//RegBean2 rb3=(RegBean2)sct.getAttribute("bean3");
RequestDispatcher rd=req.getRequestDispatcher("link2.html");
rd.include(req, res);
/*
if(z)
{
pw.println("<br>....BookData...");
pw.println("<br>BCode:"+rb3.getbCode());
pw.println("<br>BName:"+rb3.getbName());
pw.println("<br>BAuthor:"+rb3.getbAuthor());
pw.println("<br>BPrice:"+rb3.getbPrice());
pw.println("<br>BQty:"+rb3.getbQty());
}*/
if(b1.size()==0) {
pw.println("<br>Please Insert Datat Into DataBase Table..");

}else {
b1.forEach((k)->
{
RegBean2 rb3=(RegBean2)k;
pw.println("<br>BCode:"+rb3.getbCode()+"&nbsp&nbsp"+"<br>BName:"+rb3.getbName()
+"&nbsp&nbsp"+"<br>BAuthor:"+rb3.getbAuthor()+"&nbsp&nbsp"+
"<br>BPrice:"+rb3.getbPrice()+"&nbsp&nbsp"+"<br>BQty:"+
rb3.getbQty()+"<br>"
		+ "<br>");
});
}
}
}
}
