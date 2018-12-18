package Day7;

public class Day7_pro4 {
	
	static void action(Robot r) {
		if (r instanceof DanceRobot) {
			((DanceRobot) r).dance();
		} else if (r instanceof SingRobot) {
			((SingRobot) r).sing();
		} else if (r instanceof DrawRobot) {
			((DrawRobot) r).draw();
		} else {
			
		}
	}	
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		
		for (int i=0; i<arr.length; i++) {
			action(arr[i]);
		}
	}
}

class Robot {}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("������");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("�뷡�뷡");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("�׸��׸�");
	}
}