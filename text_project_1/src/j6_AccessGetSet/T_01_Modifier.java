package j6_AccessGetSet;

//import j5_OOP.M_01_Student;

public class T_01_Modifier {

	public static void main(String[] args) {
		A a = new A();
		//System.out.println(a.a);
		System.out.println(a.getA());
		a.setA(20);
		System.out.println(a.getA());
		
		
		//a.printa();
		
	}

}

class A{
	//int a = 10; // field
	private int a = 10;
	
	A() {}; // Constructor
	//private A() {}; // Constructor
	
	void printa() { // Method
		System.out.println(a);
	}
	
	// getter
	int getA() {
		return this.a;
	}
	
	// setter
	void setA(int _a) {
		this.a = _a;
	}
}