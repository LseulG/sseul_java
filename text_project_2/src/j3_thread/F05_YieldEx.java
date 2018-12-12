package j3_thread;

public class F05_YieldEx {

	public static void main(String[] args) {
		F05_ThreadA threadA = new F05_ThreadA();
		F05_ThreadB threadB = new F05_ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadA.work = false;
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadA.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		threadA.stop = true;
		threadB.stop = true;		
	}
}
