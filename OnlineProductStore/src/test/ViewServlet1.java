package test;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;
@SuppressWarnings("serial")
public class ViewServlet1 extends HttpServlet{
	@SuppressWarnings("unused")
	public void doGet(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
HttpSession hs=req.getSession(false);
if(hs==null) {
pw.println("login First...");
RequestDispatcher rd=req.getRequestDispatcher("userLogin.html");
}else {
String fName=(String)hs.getAttribute("fName");

RequestDispatcher rd=req.getRequestDispatcher("link1.html");
rd.include(req, res);
pw.println("<br>Welcome:"+fName+"<br>");
ArrayList<ProductBean> al= new RetriveDAO1().retrive();
if(al.size()==0) {
pw.println("Product Not Available...");
}else {

al.forEach((k)->
{
ProductBean pb=(ProductBean)k;
pw.println("<br>......Product Details.....<br>");
pw.println("<br>pI:"+k.getpId()+"<br>"+"pName:"+k.getpName()+"<br>"+"pPrice:"
+k.getpPrice()+"<br>"+"pQty:"+k.getpQty()+"<br>"+"<br>");
});
}
}		
}
}
