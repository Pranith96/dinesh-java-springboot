
public class MultiThreading1 implements Runnable {
	
	public void run() {
		
		System.out.println("thread started");
	}

	public static void main(String args[]) {
		MultiThreading1 multiThreading1=new MultiThreading1();
		Thread thread1=new Thread(multiThreading1);
		thread1.start();
	}
}
