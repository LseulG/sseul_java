package j3_thread;

public class F04_TargetThread extends Thread{
	public void run() {
		for (long i=0; i<1000000000; i++) {}
		
		try { 
			Thread.sleep(1500);
		} catch (Exception e) {}
		
		for (long i=0; i<1000000000; i++) {}
	}
}
