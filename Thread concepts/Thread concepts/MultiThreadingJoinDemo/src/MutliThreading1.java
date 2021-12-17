
public class MutliThreading1 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		MutliThreading1 mutliThreading1 = new MutliThreading1();
		MutliThreading1 mutliThreading2 = new MutliThreading1();
		MutliThreading1 mutliThreading3 = new MutliThreading1();
		MutliThreading1 mutliThreading4 = new MutliThreading1();

		mutliThreading1.start();
		try {
			mutliThreading1.join();
		} catch (Exception e) {
			System.out.println(e);
		}

		mutliThreading2.start();

		try {
			mutliThreading2.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		mutliThreading3.start();
		mutliThreading4.start();

	}

}
