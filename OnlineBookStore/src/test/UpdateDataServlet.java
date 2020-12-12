package test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class UpdateDataServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text.html");
		Cookie ck1[]=req.getCookies();
		if(ck1==null) {
		pw.println("please Login First..");
		RequestDispatcher rd=req.getRequestDispatcher("adminlogin.html");
		rd.include(req, res);
		}else {
		String uName=ck1[0].getValue();
		pw.println("WelCome:"+uName+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("link2.html");
		rd.include(req, res);
		//RegBean2 rb3= new RegBean2();
		ServletContext sct=this.getServletContext();
		RegBean2 rb3=(RegBean2)sct.getAttribute("bean3");		
rb3.setbName(req.getParameter("bname"));
rb3.setbAuthor(req.getParameter("bauthor"));
rb3.setbPrice(Float.parseFloat(req.getParameter("bprice")));
rb3.setbQty(Integer.parseInt(req.getParameter("bqty")));
sct.setAttribute("bean3", rb3);
int k=new UpdateDAO().update2(rb3);
if(k>0) {
pw.println("<br>Updated Sucessfully...");
			}
}
}
}