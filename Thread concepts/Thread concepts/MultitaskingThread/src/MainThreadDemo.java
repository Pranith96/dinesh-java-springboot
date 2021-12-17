
class MainThreadDemo {
	public static void main(String args[]) {
		MultiThreadingMultitask multiThreadingMultitask = new MultiThreadingMultitask();
		MultiThreadingMultitask1 multiThreadingMultitask1 = new MultiThreadingMultitask1();
		multiThreadingMultitask.start();
		multiThreadingMultitask1.start();
	}
}
