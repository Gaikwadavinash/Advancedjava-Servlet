package test;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import java.util.*;
@SuppressWarnings("serial")
public class ViewServlet2 extends HttpServlet{
@SuppressWarnings("unused")
public void doGet(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
HttpSession hs=req.getSession(false);
hs.getAttribute("fName");
if(hs==null) {
pw.println("Please Login First.....");
RequestDispatcher rd=req.getRequestDispatcher("adminLogin.html");
rd.include(req, res);
}else {
String fName=(String)hs.getAttribute("fName");
pw.println("Welcome:"+fName);
ArrayList< ProductBean> al= new RetriveDAO2().retrive();
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
