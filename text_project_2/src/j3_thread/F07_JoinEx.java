package j3_thread;

public class F07_JoinEx {

	public static void main(String[] args) {
		SumThread sum = new SumThread();
//		sum.run(); //55
		sum.start(); // main이 먼저 끝나서 0만 출력됨
		
		try {
			sum.join(); // thread가 끝나면 합류
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