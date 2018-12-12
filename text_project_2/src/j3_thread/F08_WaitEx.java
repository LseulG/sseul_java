package j3_thread;

public class F08_WaitEx {

	public static void main(String[] args) {
		WorkObject wobj = new WorkObject();
		
		ThreadA8 ta = new ThreadA8(wobj);
		ThreadB8 tb = new ThreadB8(wobj);
		
		ta.start();
		tb.start();		
	}
}

class WorkObject {
	public synchronized void methodA() {
		System.out.println("methodA run");
		notify(); // wait에 빠진 애를 깨우고
		try {
			wait(); // 스스로 wait에 빠지고
		} catch (InterruptedException e) {} 
	}
	
	public synchronized void methodB() {
		System.out.println("methodB run");
		notify();
		try {
			wait(); // 스스로 wait
		} catch (InterruptedException e) {} 
	}
}


class ThreadA8 extends Thread{
	WorkObject wo;
	
	public ThreadA8(WorkObject wo) {
		this.wo = wo;
	}
	
	public void run() {
		for (int i=0; i<10; i++) {
			wo.methodB();
		}
	}
}

class ThreadB8 extends Thread{
	WorkObject wo;
	
	public ThreadB8(WorkObject wo) {
		this.wo = wo;
	}
	
	public void run() {
		for (int i=0; i<10; i++) {
			wo.methodA();
		}
	}
}