package j3_thread;

public class F06_pro2 {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();

		Thread thread2 = new Thread(new MusicRunable());
		thread2.start();		
	}
}

class MovieThread extends Thread {
	@Override
	public void run() {
		for (int i=0; i<3; i++) {
			System.out.println("video play");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MusicRunable implements Runnable{
	@Override
	public void run() {
		for (int i=0; i<3; i++) {
			System.out.println("music play");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}