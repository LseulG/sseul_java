package j8_interface;

public interface T_03_RemoteControl {
	//public static final int MAX_VOLUME = 10;
	public int MAX_VOLUME = 10; //static final 안써줘도 int만 써도 상수값
	public int MIN_VOULME = 10; //static final 생량
	
	public abstract void turnOn();
	public void turnOff(); //abstract  생략
	
	public default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음");
		} else {
			System.out.println("소리");
		}
	}
	
	public static void changeBattery() {
		System.out.println("battery change");
	}
}

