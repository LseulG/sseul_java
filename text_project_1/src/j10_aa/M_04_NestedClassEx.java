package j10_aa;

public class M_04_NestedClassEx {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();
		
		Car.Engine engine = new Car.Engine();

	}

}

class Car{
	class Tire {}
	static class Engine {}
}