
public class MultiThreadingDemo1 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) throws InterruptedException {

		MultiThreadingDemo1 multiThreadingDemo1 = new MultiThreadingDemo1();
		MultiThreadingDemo1 multiThreadingDemo2 = new MultiThreadingDemo1();
		multiThreadingDemo1.start();
		multiThreadingDemo1.join();
		multiThreadingDemo2.start();

	}

}
