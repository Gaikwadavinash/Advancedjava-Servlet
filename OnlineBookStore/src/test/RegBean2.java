package test;
import java.io.*;
public class RegBean2 implements Serializable{
public String bCode,bName,bAuthor;
public float bPrice;
public int bQty;
public String getbCode() {
	return bCode;
}
public void setbCode(String bCode) {
	this.bCode = bCode;
}
public String getbName() {
	return bName;
}
public void setbName(String bName) {
	this.bName = bName;
}
public String getbAuthor() {
	return bAuthor;
}
public void setbAuthor(String bAuthor) {
	this.bAuthor = bAuthor;
}
public float getbPrice() {
	return bPrice;
}
public void setbPrice(float bPrice) {
	this.bPrice = bPrice;
}
public int getbQty() {
	return bQty;
}
public void setbQty(int bQty) {
	this.bQty = bQty;
}

}
