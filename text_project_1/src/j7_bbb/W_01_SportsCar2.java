package j7_bbb;

import j7_aaa.*;

public class W_01_SportsCar2 extends W_01_Car{
	@Override
	public void speedUp() { speed +=  10; }
	
	//final �޼ҵ� �������̵� �� �� ����.
//	@Override
//	public void stop() {
//		System.out.println("sportscar stop");
//		speed = 0;
//	}
	public void carInstance() {
		W_01_Car car = new W_01_Car();
		car.speedUp();
	}
	
}
