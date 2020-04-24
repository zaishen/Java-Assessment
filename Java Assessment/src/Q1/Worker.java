package Q1;

public class Worker extends Thread {

	//thread limit
	static int counter;
	public Order o;

	public Worker(Order o) {
		this.o = o;
		System.out.println("OrderNumber:" + o.getOrderNumber() +" Status:"+o.getState());
	}

	public void run() {
		try {
			counter--;
			o.setState("FULFILLED");
			System.out.println("OrderNumber:" + o.getOrderNumber() +" Status:"+o.getState());
		} catch (Exception e) {

		}
	}

}
