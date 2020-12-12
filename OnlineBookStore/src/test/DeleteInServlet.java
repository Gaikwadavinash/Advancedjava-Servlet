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

public class DeleteInServlet extends HttpServlet{
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
		pw.println("WelCome:"+uName+"<br>");
		RequestDispatcher rd=req.getRequestDispatcher("link2.html");
		rd.include(req, res);
		ServletContext sct=this.getServletContext();
		//sct.setAttribute("bean3", rb3);
		boolean z=new DeleteDAO().delete(req, sct);
		RegBean2 rb3=(RegBean2)sct.getAttribute("bean3");
		if(z) {
			z=true;
		pw.println("<br>Deleted BookCode Data Sucessfully");	
		//String uName=ck1[0].getValue();
	// sct=this.getServletContext();
	//boolean  z=new DeleteDAO().delete(req,sct);
	//RegBean2 rb3=(RegBean2)sct.getAttribute("bean3");
	//if(z){
		//pw.println("<form action='delete3' method='post'><br>");
		//pw.println("<input type='Submit' value='Delete'>");
	}else{
	pw.println("<br>Invalid BookCode ... ");
	RequestDispatcher rd1=req.getRequestDispatcher("delete.html");
	rd1.include(req, res);
	}
}
}
}