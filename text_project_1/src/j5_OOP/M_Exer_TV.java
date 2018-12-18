package j5_OOP;

public class M_Exer_TV {
	public static void main(String args[]) {
		TV lg = new TV();
		lg.powerOn();
		lg.powerOn();
		lg.changeChanel(13);
		lg.channelUp();
		lg.channelDown();
		lg.volumeUp();
		lg.volumeDown();
		lg.mute();
		lg.powerOff();
	}
}

class TV{
	String maker; //제조사
	int screenSize; //화면크기
	int channel = 8; //채널 1~15
	int volume = 3; //볼륨 0~10
	boolean power = false; //전원
	
	//켜기
	void powerOn() {
		if(power == false) {
			power = true;
			System.out.println("TV ON");
			System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
		} else {
			System.out.println("이미 켜져있습니다");
			System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
		}
	}
	
	//끄기 >>>>power(boolean power)
	void powerOff() {
		System.out.println("TV OFF");
		power = false;
	}
	
	//한채널위
	int channelUp() { 
		if(power) {
			if (channel < 15) channel += 1;
			else channel = 1;
			System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
			System.out.println("채널 " + channel + "로 변경 되었습니다.");
			return channel;
		}
		System.out.println("TV를 켜주세요");
		return 0;
	}
	
	//한채널아래
	int channelDown() {
		if(power) {
			if (channel > 1 ) channel -= 1;
			else channel = 15;
			System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
			System.out.println("채널 " + channel + "로 변경 되었습니다.");
			return channel;
		}
		System.out.println("TV를 켜주세요");
		return 0;
	}
	
	//채널변경
	int changeChanel(int chChannel) {
		if(power) {
			if(chChannel>0 && chChannel<=15) {
				channel = chChannel;
				System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
				System.out.println("채널 " + channel + "로 변경 되었습니다.");
				return channel;
			} else {
				System.out.println("없는 채널 입니다.");
				System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
				return channel;
			}
		}
		System.out.println("TV를 켜주세요");
		return 0;
	}
	
	//볼륨업 _최대볼륨10
	void volumeUp() {
		if(power) {
			if (volume < 10) {
				volume += 1;
				System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
				System.out.println("볼륨 " + volume + "로 변경 되었습니다.");
			} else {
				System.out.println("10이 최대 볼륨 입니다.");
				System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
			}
		} else 	System.out.println("TV를 켜주세요");
	}
	
	//볼륨다운
	void volumeDown() {
		if(power) {
			if (volume > 0) {
				volume -= 1;
				System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
				System.out.println("볼륨 " + volume + "로 변경 되었습니다.");
			} else {
				System.out.println("이미 볼륨이 0 입니다.");
				System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
			}
		} else System.out.println("TV를 켜주세요");
	}
	
	//음소거
	int tempVol = volume; // 현재 볼륨을 temp에 저장
	
	void mute() {
		if(power) {
			if (volume == 0) {
				// 이미 음소거 일때, 저장해둔 temp 볼륨으로 돌아감.
				volume = tempVol;
				System.out.println("현재 채널:" + channel + ", 현재 볼륨:" + volume);
			} else {
				// 음소거
				volume = 0;
				System.out.println("현재 채널:" + channel + ", 현재 볼륨:음소거");
			}
		} else System.out.println("TV를 켜주세요");
	}
}
