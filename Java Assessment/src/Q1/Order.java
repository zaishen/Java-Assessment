package Q1;

public class Order {
 private String state;
 private int orderNumber;
 
 public Order(int num){
	state ="NEW";
	orderNumber = num;
 }
 
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getOrderNumber() {
	return orderNumber;
}
public void setOrderNumber(int orderNumber) {
	this.orderNumber = orderNumber;
}
 
 
}
