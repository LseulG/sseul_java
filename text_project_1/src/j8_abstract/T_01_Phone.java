package j8_abstract;

public abstract class T_01_Phone {
	// field
	public String owner;
	
	// Constructor
	public T_01_Phone(String owner) {
		this.owner = owner;
	}
	
	// Method
	void turnOn() {
		System.out.println("phone power on");
	}
	
	void turnOff() {
		System.out.println("phone power off");
	}
	
	// abstract Method -> abstract class 안에서 가능
	public abstract void call();

}
