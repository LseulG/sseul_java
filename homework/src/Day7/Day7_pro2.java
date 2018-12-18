package Day7;

public class Day7_pro2 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:" + t.getChannel());
		
		t.setChannel(20);
		System.out.println("CH:" + t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH:" + t.getChannel());		

	}

}

class MyTv2{
	private boolean isPowerOn = true;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//
	int prev;
	void gotoPrevChannel() {
		setChannel(prev);
	}
	
	//ÄÚµå
	void setChannel(int n) {
		if(isPowerOn) {
			if(n>=MIN_VOLUME && n<=MAX_VOLUME) {
				this.prev = channel;
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