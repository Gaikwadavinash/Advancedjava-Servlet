package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EditServlet1 extends HttpServlet{
public void doGet(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
RequestDispatcher rd= req.getRequestDispatcher("edit.html");
rd.include(req, res);
}
}
