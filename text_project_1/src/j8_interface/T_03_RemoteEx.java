package j8_interface;

import java.rmi.RemoteException;

public class T_03_RemoteEx {

	public static void main(String[] args) {
//		T_03_Tv tv = new T_03_Tv();
//		tv.turnOn();
//		tv.turnOff();
//		tv.setMute(true);
		
		T_03_RemoteControl.changeBattery();
		
		T_03_LGTv lgtv = new T_03_LGTv();
		
		T_03_Audio audio = new T_03_Audio();
//		audio.turnOn();
//		audio.turnOff();
//		audio.setMute(ture);
		
		T_03_RemoteControl rc = null;
		rc = audio;
		rc.turnOn();
		rc.turnOff();
		
		rc = lgtv;
		rc.turnOn();
		rc.turnOff();
		
	}

}
