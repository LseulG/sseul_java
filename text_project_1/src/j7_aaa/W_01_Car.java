package j7_aaa;

//public final class W_01_Car //
public class W_01_Car {
	//�ʵ�
	public int speed;
	
	//�޼ҵ�
	public void speedUp() { speed += 1; }
	
	//final �޼ҵ�
	public final void stop() {
		System.out.println("car stop");
		speed = 0;
	}

}
