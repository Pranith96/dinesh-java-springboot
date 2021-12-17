public class MultiThreadingDemo1 extends Thread{
	public void run() {
		System.out.println("thread started");
	}
	
	public static void main(String args[]) {
		MultiThreadingDemo1 MultiThreadingDemo1 =new MultiThreadingDemo1();
		MultiThreadingDemo1.start();
	}
}
