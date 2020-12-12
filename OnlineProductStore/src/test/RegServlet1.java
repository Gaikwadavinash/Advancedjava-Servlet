package test;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
@SuppressWarnings("serial")
public class RegServlet1 extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
@SuppressWarnings("unused")
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
RegBean rb1= new RegBean();
ServletContext sct1=this.getServletContext();
rb1.setuName(req.getParameter("uname"));
rb1.setpWord(req.getParameter("pword"));
rb1.setfName(req.getParameter("fname"));
rb1.setlName(req.getParameter("lname"));
sct1.setAttribute("bean",rb1);
RequestDispatcher rd= req.getRequestDispatcher("Reg2.html");
rd.forward(req, res);
}
}