package test5;

public class Car {
	String color;
	int account;
	
	public Car(String color, int account) {
		this.color = color;
		this.account = account;
	}
	
	public String toString() {
		String str = "[����] " + color + "\t[�������] " + account;
		return str;
	}

}
