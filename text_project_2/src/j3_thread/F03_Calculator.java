package j3_thread;

public class F03_Calculator {
	private int memory;
	
	public int get() {
		return memory;
	}
	
	/*
	 * synchronized 사용 시 
	 * thread1 사용 중에 다른 thread가 접근 안하고 대기 
	 * thread1 종료 이후 실행 됨
	 * */
//	#1 주로 많이 씀
	public synchronized void set(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2s
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 		
		System.out.println(Thread.currentThread().getName() + " " + this.memory);
	}
	
//	#2 잘 안씀
//	public void set(int memory) {
//		//synchronized (new User1())
//		synchronized (this) {
//			this.memory = memory;
//			try {
//				Thread.sleep(2000); // 2s
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			} 		
//			System.out.println(Thread.currentThread().getName() + " " + this.memory);
//		}
//	}
//
}

class User1 extends Thread {
	private F03_Calculator calc;
	
	public void setCalc (F03_Calculator calc) {
		this.setName("user1- thread");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.set(50);
	}
}

class User2 extends Thread {
	private F03_Calculator calc;
	
	public void setCalc (F03_Calculator calc) {
		this.setName("user2- thread");
		this.calc = calc;
	}
	
	@Override
	public void run() {
		calc.set(100);
	}
}