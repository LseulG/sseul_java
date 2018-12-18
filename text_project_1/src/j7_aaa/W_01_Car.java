package j7_aaa;

//public final class W_01_Car //
public class W_01_Car {
	//필드
	public int speed;
	
	//메소드
	public void speedUp() { speed += 1; }
	
	//final 메소드
	public final void stop() {
		System.out.println("car stop");
		speed = 0;
	}

}
