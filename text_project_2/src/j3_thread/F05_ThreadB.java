package j3_thread;

public class F05_ThreadB extends Thread {
	public boolean stop = false;
	public boolean work = true;
	
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("Thread B");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadB program stop");
	}
}
