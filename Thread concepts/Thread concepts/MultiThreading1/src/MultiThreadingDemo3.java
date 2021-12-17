
public class MultiThreadingDemo3 extends Thread{
	
	public void run() {
		 for(int i=1;i<=50;i++) {
			 if(i%2!=0) {
				 System.out.println("odd number"+i);
			 }
			
		 }
	}

	
	public static void main(String[] args) {
		MultiThreadingDemo3 multiThreadingDemo3=new MultiThreadingDemo3();
		multiThreadingDemo3.start();
	}
}
