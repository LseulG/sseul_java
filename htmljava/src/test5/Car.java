package test5;

public class Car {
	String color;
	int account;
	
	public Car(String color, int account) {
		this.color = color;
		this.account = account;
	}
	
	public String toString() {
		String str = "[색상] " + color + "\t[생산수량] " + account;
		return str;
	}

}
