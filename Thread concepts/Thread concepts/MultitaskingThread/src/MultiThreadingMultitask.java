
class MultiThreadingMultitask extends Thread {
	public void run() {
		for (int i = 1; i <= 30; i++) {
			if (i % 2== 0) {
				System.out.println("even number" + i);
			}
		}
	}
}


