package Q1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			Order o = new Order(i);
			
			Worker w = new Worker(o);
			w.start();
			w.counter++;
			while (w.counter > 5);
		}		
	}

}
