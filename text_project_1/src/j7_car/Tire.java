package j7_car;

public class Tire {
	int maxRotation;
	int accumulatedRotation;
	String location;
	
	Tire(String location, int maxRotation){
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	boolean roll() {
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			return true;
		} else {
			System.out.println(location + " 타이어를 교체해주세오");
			return false;
		}
	}
}
