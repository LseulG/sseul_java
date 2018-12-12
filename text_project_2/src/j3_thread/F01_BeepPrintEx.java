package j3_thread;

public class F01_BeepPrintEx {

	public static void main(String[] args) {
//		#1
//		Runnable bt = new BeepTask();
//		Thread bt2 = new Thread(bt);
//		bt2.start();
		
//		#2
//		Thread bt3 = new BeepTask2();
//		bt3.start();
		
//		#3
		Thread bt2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i=0; i<5; i++) {
					System.out.println("yo~");
					
					try {
						Thread.sleep(500);; // 0.5ÃÊ
					} catch (Exception e) {
						
					}
				}
			}
		});
		bt2.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("ho~");
			
			try {
				Thread.sleep(300);; // 0.3ÃÊ
			} catch (Exception e) {
				
			}
		}
		
	}

}

class BeepTask implements Runnable {
	@Override
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("yo~");
			
			try {
				Thread.sleep(500);; // 0.5ÃÊ
			} catch (Exception e) {
				
			}
		}
		
	}
}

class BeepTask2 extends Thread {
	@Override
	public void run() {
		
	}
}