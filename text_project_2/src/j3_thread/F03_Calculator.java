package j3_thread;

public class F03_Calculator {
	private int memory;
	
	public int get() {
		return memory;
	}
	
	/*
	 * synchronized ��� �� 
	 * thread1 ��� �߿� �ٸ� thread�� ���� ���ϰ� ��� 
	 * thread1 ���� ���� ���� ��
	 * */
//	#1 �ַ� ���� ��
	public synchronized void set(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000); // 2s
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 		
		System.out.println(Thread.currentThread().getName() + " " + this.memory);
	}
	
//	#2 �� �Ⱦ�
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