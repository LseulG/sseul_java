package j7_bbb;

import j7_aaa.*;

public class W_01_Car2 {
	//�ʵ�
		public int speed;
		
		//�޼ҵ�
		public void speedUp() { speed += 1; }
		
		//final �޼ҵ�
		public final void stop() {
			System.out.println("car stop");
			speed = 0;
		}
		
		public void carInstance() {
			W_01_Car car = new W_01_Car();
			car.speedUp();
		}
}
