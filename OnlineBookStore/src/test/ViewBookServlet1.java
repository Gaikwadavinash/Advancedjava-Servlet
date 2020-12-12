package test;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewBookServlet1 extends HttpServlet{
	public boolean z;
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
	//RegBean2 rb3=(RegBean2)sct.getAttribute("bean3");
String uName=ck1[0].getValue();
pw.println("Login Page:"+uName+"<br>");
//ServletContext sct=this.getServletContext();

//z=new LoginDAO3().login3(req,sct);
ArrayList<RegBean2> b1= new LoginDAO3().login();
//RegBean2 rb3=(RegBean2)sct.getAttribute("bean3");
RequestDispatcher rd=req.getRequestDispatcher("link.html");
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
}
*/
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

