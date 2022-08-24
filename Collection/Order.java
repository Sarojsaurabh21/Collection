package Collection;

public class Order {
	private int orderld;
private String oName;
private int nooforders;
public Order()
{
	
}
public Order(int orderld, String oName, int nooforders) {
	super();
	this.orderld = orderld;
	this.oName = oName;
	this.nooforders = nooforders;
}
public int getOrderld() {
	return orderld;
}
public void setOrderld(int orderld) {
	this.orderld = orderld;
}
public String getoName() {
	return oName;
}
public void setoName(String oName) {
	this.oName = oName;
}
public int getNooforders() {
	return nooforders;
}
public void setNooforders(int nooforders) {
	this.nooforders = nooforders;
}
@Override
public String toString() {
	return "Order [orderld=" + orderld + ", oName=" + oName + ", nooforders=" + nooforders + "]";
}


	

}
