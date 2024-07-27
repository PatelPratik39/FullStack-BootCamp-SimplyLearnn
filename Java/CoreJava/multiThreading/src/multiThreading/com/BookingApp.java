package multiThreading.com;


class Booking implements Runnable {
	int avl = 1;
	@Override
	public synchronized void run() {
	Thread t = Thread.currentThread();
	String name = t.getName();
		if(avl==1) {
			System.out.println(name+" got the ticket");
			avl = avl-1;
		}else {
			System.out.println(name+" no ticket");
		}
	}
}



public class BookingApp {
	public static void main(String[] args) {
		Booking b1 = new Booking();		// avl=1
		//Booking b2 = new Booking();		// avl=1
		//Booking b3 = new Booking();		// avl=1
		//Booking b4 = new Booking();		// avl = 1
		Thread t1 = new Thread(b1);		// number of client equal to number of thread in any web application
		Thread t2 = new Thread(b1);
		Thread t3 = new Thread(b1);
		Thread t4 = new Thread(b1);
		t1.setName("Steven");
		t2.setName("Leena");
		t3.setName("Lex");
		t4.setName("John");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}


