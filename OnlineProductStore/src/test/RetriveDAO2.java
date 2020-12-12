package test;
import java.util.*;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;

import java.io.*;
import java.sql.*;
public class RetriveDAO2{
@SuppressWarnings({ "rawtypes", "unchecked" })
public ArrayList<ProductBean> al=new ArrayList();
public ArrayList<ProductBean> retrive(){
	try {
Connection con=DBConnection.getCon();
PreparedStatement ps=con.prepareStatement
("select *from product28");
ResultSet rs=ps.executeQuery();
while(rs.next()) {
	ProductBean pb=new ProductBean();
pb.setpId(rs.getString(1));
pb.setpName(rs.getString(2));
pb.setpPrice(rs.getFloat(3));
pb.setpQty(rs.getInt(4));
al.add(pb);
}
}catch(Exception e) {e.printStackTrace();}
	return al;
}
}
