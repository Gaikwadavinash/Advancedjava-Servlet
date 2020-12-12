package test;
import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
public class DeleteServlet1 extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)
throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
pw.println("<form action='delete' method='post'><br>");
pw.println("DeleteBookCode:<input type='text' name='bcode'><br>");
pw.println("<input type='Submit' value='Delete'>");
pw.println("</form>");

//RequestDispatcher rd=req.getRequestDispatcher("delete.html");
//rd.include(req, res);
}
}
