package multiThreading.com;


class Task implements Runnable { 

	@Override
	public void run() {
		Thread t = Thread.currentThread();
//		System.out.println(t);
		try {
			Thread.sleep(5000);
			String name = t.getName();
			int i = t.getPriority();
			System.out.println(name + " = Hi with Priority "+ i);
		} catch(Exception e) {
	
	}
}
}

public class TaskTest {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		Task tt = new Task();
		Thread t1 = new Thread(tt);
		Thread t2 = new Thread(tt);
		Thread t3 = new Thread(tt);
		Thread t4 = new Thread(tt);
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(2);
		t4.setPriority(8);
		t1.setName("Ravi");
		t2.setName("Raju");
		t3.setName("Rajesh");
		t4.setName("Raj");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		}

}
