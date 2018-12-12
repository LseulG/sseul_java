package j3_thread;

public class F07_JoinEx {

	public static void main(String[] args) {
		SumThread sum = new SumThread();
//		sum.run(); //55
		sum.start(); // main�� ���� ������ 0�� ��µ�
		
		try {
			sum.join(); // thread�� ������ �շ�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(sum.sum);		
	}
}

class SumThread extends Thread {
	int sum;
	
	public void run() {
		for (int i=1; i<11; i++) {
			sum += i;
		}
	}
}