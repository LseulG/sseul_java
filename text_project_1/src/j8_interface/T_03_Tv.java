package j8_interface;

public abstract class T_03_Tv implements T_03_RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("tv turn on");
	}

	
	public void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
		} else {
			System.out.println("소리");
		}
	} 

}
