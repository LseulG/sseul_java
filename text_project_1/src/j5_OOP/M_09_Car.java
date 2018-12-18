package j5_OOP;

public class M_09_Car {
	int speed;
	
	void run() {
		System.out.println(speed + "로 달린다");
	}
	
	public static void main(String[] args) {
		M_09_Car myCar = new M_09_Car();
		myCar.speed = 60;
		myCar.run();
	}
}
