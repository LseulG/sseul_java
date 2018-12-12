package j3_thread;

public class F04_StatePrintThread extends Thread{
	private Thread targetThread;
	
	public F04_StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("target thread : " + state);
			
			if(state == Thread.State.NEW) {
				targetThread.start();
			}
			
			if (state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}
