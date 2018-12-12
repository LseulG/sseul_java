package j3_thread;

public class F09_InterruptEx {

	public static void main(String[] args) {
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread.interrupt();
	}
}

class PrintThread2 extends Thread {
	public void run() {
		try {
			while(true) {
				System.out.println("process");
				Thread.sleep(1);
			}
		} catch (Exception e) {	
			
		}
		
		System.out.println("oh~");
	}
}