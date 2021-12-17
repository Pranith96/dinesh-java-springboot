
public class MutltiThread2  implements Runnable {
	
	public void run() {
		
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				System.out.println("even number"+i);
			}
			else if(i%2!=0) {
				System.out.println("odd numbers"+i);
			}
		}
	}
	public static void main(String args[]) {
		MutltiThread2 mutltiThread2=new MutltiThread2();
		Thread thread=new Thread(mutltiThread2);
		thread.start();
		
	}

}
