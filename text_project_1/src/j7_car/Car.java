package j7_car;

public class Car {
//	Tire fl = new Tire("Front Left", 10);
//	Tire fr = new Tire("Front Right", 20);
//	Tire bl = new Tire("Back Left", 30);
//	Tire br = new Tire("Back Right", 40);
	
	//다형성
//	Tire fl = new HankookTire("Front Left", 10);
//	Tire fr = new HankookTire("Front Right", 20);
//	Tire bl = new KumhoTire("Back Left", 30);
//	Tire br = new KumhoTire("Back Right", 40);
	
	Tire[] tire = {
		new HankookTire("Front Left", 10),
		new HankookTire("Front Right", 20),
		new KumhoTire("Back Left", 30),
		new KumhoTire("Back Right", 40)
		};
	
//	void run(){
//		System.out.println("자동차가 달립니다.");
//		fl.roll();
//		fr.roll();
//		bl.roll();
//		br.roll();
//	}
	
	void run() {
		System.out.println("자동차가 달립니다.");
		for (int i=0; i<4; i++) {
			tire[i].roll();
			if (tire[i].accumulatedRotation == tire[i].maxRotation) {
				this.stop();
				break;
			}
		}
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
			
}
