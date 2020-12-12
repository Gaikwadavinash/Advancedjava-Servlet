package test;
import java.sql.*;

import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

import oracle.net.aso.b;
public class RetriveDAO1 {
@SuppressWarnings("unchecked")
public ArrayList<ProductBean> al= new ArrayList();
public ArrayList<ProductBean>retrive(){
	try {
	
	Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *from product28 ");
ResultSet rs=ps.executeQuery();
while(rs.next()) {
ProductBean pb= new ProductBean();
pb.setpId(rs.getString(1));
pb.setpName(rs.getString(2));
pb.setpPrice(rs.getFloat(3));
pb.setpQty(rs.getInt(4));
//sct1.setAttribute("bean2", pb);
al.add(pb);
}
}catch(Exception e) {e.printStackTrace();}
	return al;
}

}
