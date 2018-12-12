package j3_thread;

public class F06_pro {

	public static void main(String[] args) {
		ThreadAA threadA = new ThreadAA();
		ThreadBB threadB = new ThreadBB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		threadA.stop = true;
		threadB.stop = true;
	}

}

class ThreadAA extends Thread {
	public boolean stop = false;
	int a = 1;
		
	public void run() {
		while(!stop) {
			if(a<=10) {
				System.out.println("a"+a);
				a++;
				Thread.yield();
			}
		}
		System.out.println("ThreadA program stop");
	}
}

class ThreadBB extends Thread {
	public boolean stop = false;
	int b = 10;
		
	public void run() {
		while(!stop) {
			if(b>0) {
				System.out.println("b"+b);
				b--;
				Thread.yield();
			}
		}
		System.out.println("ThreadB program stop");
	}
}