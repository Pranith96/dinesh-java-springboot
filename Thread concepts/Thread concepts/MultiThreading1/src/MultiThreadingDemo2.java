
public class MultiThreadingDemo2 extends Thread{
	
	public void run() {
		 for(int i=1;i<=50;i++) {
			 if(i%2==0) {
				 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				 System.out.println("even number"+i);
			 }
			
		 }
	}

	
	public static void main(String[] args) {
		MultiThreadingDemo2 multiThreadingDemo2=new MultiThreadingDemo2();
		multiThreadingDemo2.start();
	}
}
