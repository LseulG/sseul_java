package j8_interface;

public interface T_03_RemoteControl {
	//public static final int MAX_VOLUME = 10;
	public int MAX_VOLUME = 10; //static final �Ƚ��൵ int�� �ᵵ �����
	public int MIN_VOULME = 10; //static final ����
	
	public abstract void turnOn();
	public void turnOff(); //abstract  ����
	
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("����");
		} else {
			System.out.println("�Ҹ�");
		}
	}
	
	public static void changeBattery() {
		System.out.println("battery change");
	}
}

