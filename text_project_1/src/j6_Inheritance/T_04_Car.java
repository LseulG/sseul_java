package j6_Inheritance;

public class T_04_Car {
	String color;
	int price;
	
	T_04_Car(String _color){ //1
		System.out.println("Car ������ (color)");
	}
	
	T_04_Car(int _price){ //2
		System.out.println("Car ������ (price)");
	}
	
	T_04_Car(String _color, int _price){ //3
		System.out.println("Car ������ (color,price)");
		this.color = _color;
		this.price = _price;
	}
	
	//@Override
	void drive() {
		System.out.println("������");
	}

}
