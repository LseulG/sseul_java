package j8_interface;

public class T_03_Audio implements T_03_RemoteControl{
	@Override
	public void turnOn() {
		System.out.println("tv turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("tv turn off");
	}
}
