package j3_thread;

public class F06_pro_2 {

	public static void main(String[] args) {
		ThreadAAA threadA = new ThreadAAA();
		ThreadBBB threadB = new ThreadBBB();
		
		threadA.start();
		threadB.start();
	}
}

class ThreadAAA extends Thread {
	public boolean stop = false;
	public boolean work = true;
		
	public void run() {
		int i = 1;
		while(!stop) {
			if(work) {
				System.out.println("a"+i);
				i++;
				work = false;
			} else {
				Thread.yield();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				work = true;
			}
			if (i==11) {
				stop = true;
			}
		}
		System.out.println("ThreadA program stop");
	}
}

class ThreadBBB extends Thread {
	public boolean stop = false;
	public boolean work = true;
		
	public void run() {
		int i = 10;
		while(!stop) {
			if(work) {
				System.out.println("b"+i);
				i--;
				work = false;
			} else {
				Thread.yield();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				work = true;
			}
			if (i==0) {
				stop = true;
			}
		}
		System.out.println("ThreadB program stop");
	}
}