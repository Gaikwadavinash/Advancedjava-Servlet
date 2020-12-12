package test;
import java.io.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.*;
public class SecondServlet extends HttpServlet {
public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
String fName=req.getParameter("fName");
String lName=req.getParameter("lName");
pw.println("<br>FirstName:"+fName);
pw.println("<br>LastName:"+lName);
}
}
