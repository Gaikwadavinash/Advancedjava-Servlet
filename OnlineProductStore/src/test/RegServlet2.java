package test;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class RegServlet2 extends HttpServlet{
public void doPost(HttpServletRequest req,HttpServletResponse res)
		throws ServletException,IOException{
PrintWriter pw=res.getWriter();
res.setContentType("text/html");
ServletContext sct1=this.getServletContext();
RegBean rb1=(RegBean)sct1.getAttribute("bean");
rb1.setAddr(req.getParameter("addr"));
rb1.setmId(req.getParameter("mid"));
rb1.setPhNo(Long.parseLong(req.getParameter("phno")));
InserDAO id= new InserDAO();
int k=id.insert(sct1);
if(k>0) {	
pw.println("Register Sucessfully...<br>");
RequestDispatcher rd= req.getRequestDispatcher("userLogin.html");
rd.forward(req, res);
}
//sct1.setAttribute("bean",rb);
}
}
