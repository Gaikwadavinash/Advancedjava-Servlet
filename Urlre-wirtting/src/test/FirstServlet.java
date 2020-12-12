package test;
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.http.*;
public class FirstServlet extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ResultSet rs=new LoginDAO().login(req);
try {
if(rs.next()) {
String fName=rs.getString(3);
String lName=rs.getString(4);
pw.println("<a href='second?fName="+fName+"&lName="+lName+"'>Display</a>");
}else {
pw.println("Invalid UserName and PassWord");
RequestDispatcher rd=req.getRequestDispatcher("login.html");
rd.include(req, res);
}
}catch(Exception e) {e.printStackTrace();}
}

}
