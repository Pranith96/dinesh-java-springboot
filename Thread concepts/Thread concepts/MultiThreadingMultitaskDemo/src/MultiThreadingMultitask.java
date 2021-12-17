
class MultiThreadingMultitask extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			if (i % 2== 0) {
				System.out.println("even number" + i);
			}
		}
	}
}

class MultiThreadingMultitask1 extends Thread {
	public void run() {
		for (int i = 1; i <=30; i++) {
			if (i % 2 != 0) {
				System.out.println("odd number" + i);
			}
		}
	}
}

class MainThreadDemo {
	public static void main(String args[]) {
		MultiThreadingMultitask multiThreadingMultitask = new MultiThreadingMultitask();
		MultiThreadingMultitask1 multiThreadingMultitask1 = new MultiThreadingMultitask1();

		multiThreadingMultitask.start();
		multiThreadingMultitask1.start();
	}
}
