package j7_aaa;

public class W_01_SportsCar extends W_01_Car {
	@Override
	public void speedUp() { speed +=  10; }
	
	//final 메소드 오버라이딩 할 수 없음.
//	@Override
//	public void stop() {
//		System.out.println("sportscar stop");
//		speed = 0;
//	}
}
