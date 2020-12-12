package test;
import java.io.*;
public class ProductBean implements Serializable{
private String pId,pName;
private int pQty;
private float pPrice;
public ProductBean() {}
public String getpId() {
	return pId;
}
public void setpId(String pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public int getpQty() {
	return pQty;
}
public void setpQty(int pQty) {
	this.pQty = pQty;
}
public float getpPrice() {
	return pPrice;
}
public void setpPrice(float pPrice) {
	this.pPrice = pPrice;
}

}
