package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegServlet1 extends HttpServlet {
public void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
	RegBean rb= new RegBean();
ServletContext sct=this.getServletContext();
rb.setuName(req.getParameter("uname"));
rb.setpWord(req.getParameter("pword"));
rb.setfName(req.getParameter("fname"));
rb.setlName(req.getParameter("lname"));
sct.setAttribute("bean",rb);
RequestDispatcher rd=req.getRequestDispatcher("Reg2.html");
rd.forward(req, res);
}
}
