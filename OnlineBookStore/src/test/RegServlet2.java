package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RegServlet2 extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ServletContext sct=this.getServletContext();
RegBean rb=(RegBean)sct.getAttribute("bean");
RegBean2 rb3=(RegBean2)sct.getAttribute("bean3");
rb.setAddr(req.getParameter("addr"));
rb.setPhNo(Long.parseLong(req.getParameter("phno")));
rb.setmId(req.getParameter("mid"));
InsertDAO id= new InsertDAO();
int k=id.insert(sct);
if(k>0) {
pw.println("Register Sucessfully....");
RequestDispatcher rd=req.getRequestDispatcher("online.html");
rd.include(req, res);
}
}
}
