package Day7;

public class Day7_pro1 {	
	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		
		t.setVolume(20);
		System.out.println("VOL:" + t.getVolume());
		

	}

}

class MyTv{
	private boolean isPowerOn = true;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//ÄÚµå
	void setChannel(int n) {
		if(isPowerOn) {
			if(n>=MIN_VOLUME && n<=MAX_VOLUME) {
				this.channel = n;
			}
		}
	}
	
	int getChannel() {
		return this.channel;
	}
	
	void setVolume(int n) {
		if(isPowerOn) {
			if(n>=MIN_CHANNEL && n<=MAX_CHANNEL) {
				this.volume = n;
			}
		}
	}
	
	int getVolume() {
		return this.volume;
	}
}
