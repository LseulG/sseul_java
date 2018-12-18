package j5_OOP;



public class M_07_Asurada {
	int gas = 200;
	int maxSpeed = 80;
	int curSpeed;
	String mode; // D R B S
	String master;
	boolean power;
	
	// 매개변수 여부, 개수, 타입에 따라..
	M_07_Asurada(){
		System.out.println("안녕");
	}
	
	M_07_Asurada(String _master){
		master = _master;
		System.out.println("안녕 " + master);
	}
	//
	
	void PowerOn(String key) {
		if (key.equals(master)) {
			power = true;
			System.out.println(master + " 시동on");
		} else {
			System.out.println("접근 권한이 없습니다");
		}
	}
	
	void PowerOff(String key) {
		if (key.equals(master)) {
			power = false;
			System.out.println(master + " 시동off");
		} else {
			System.out.println("접근 권한이 없습니다");
		}
	}
	
	void transfer(String _mode) {
		if(power) {
			if (mode == "D" && _mode == "R") {
				System.out.println("모드 변환 안됨~ 현재 D");
			} else if (mode == "R" && (_mode == "D" || _mode == "B")){
				System.out.println();
			} else {
				mode = _mode;
			}
		} // power-on

	}
	
	void run() {
		if(power) {
			if (mode == "D" && gas > 5) {
				if (gas >= 0) {
					curSpeed += 10;
					gas -= 5;
				}
			} 			
		} // power - on
	}
	
	void booster() {
		int tempSpeed;
		if(power) {
			if(mode == "B" && gas >= 10) {
				tempSpeed = curSpeed;
				curSpeed = maxSpeed;
				System.out.println("부스터 on");
				
				for(int i=5; i>0; i--) {
					try {
						System.out.println(i + "초");
						Thread.sleep(1000); //1초
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("부스터 off");
				curSpeed = tempSpeed;
			}
		}
	}

	void stop() {
		if (power && mode == "S") {
			if (curSpeed <= 20) {
				curSpeed = 0;
			} else {
				curSpeed -= 20;
			}
		}
	}
	
	public static void main(String[] args) {
		M_07_Asurada asu = new M_07_Asurada("jjack");
		asu.PowerOn("jjack");
		asu.transfer("D");
		asu.run(); // 10 15
		System.out.println("현재속도:" + asu.curSpeed + ", 현재가스:" + asu.gas );
		asu.run(); // 20 10
		asu.run(); // 30 5
		System.out.println("현재속도:" + asu.curSpeed + ", 현재가스:" + asu.gas );
//		asu.stop();
//		System.out.println("현재속도:" + asu.curSpeed + ", 현재가스:" + asu.gas );
		asu.transfer("B");
		asu.booster();
		//asu.PowerOff("jjack");
		
//		M_07_Asurada enemy = new M_07_Asurada("aoi");
//		enemy.PowerOn("aoi");
//		enemy.PowerOff("aoi");
	}
}
