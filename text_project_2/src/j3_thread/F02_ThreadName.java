package j3_thread;

public class F02_ThreadName {

	public static void main(String[] args) {
		
		Thread tc = new ThreadB();
		tc.setName("ThreadC - 01");
		tc.setPriority(Thread.NORM_PRIORITY);
		tc.start();
		//System.out.println(tc.getName()); 
		
		Thread ta = new ThreadA();
		ta.setName("ThreadA - 01"); // thread 이름 지정
		ta.setPriority(Thread.MIN_PRIORITY);
		ta.start();
		//System.out.println(ta.getName()); // Thread-0 (이름 지정 안했을때 순서대로 번호 매겨짐)

		Thread tb = new ThreadB();
		tb.setName("ThreadB - 01");
		tb.setPriority(Thread.MAX_PRIORITY);
		tb.start();
		//System.out.println(tb.getName()); // Thread-1
		
	}	
}

class ThreadA extends Thread {
	@Override
	public void run() {
		for (int i=0; i<100000; i++) {
			try {
				System.out.println(this.getName());
				Thread.sleep(100); //0.1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}	
}

class ThreadB extends Thread {
	@Override
	public void run() {
		for (int i=0; i<100000; i++) {
			try {
				System.out.println(this.getName());
				Thread.sleep(100); //0.1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}	
}
