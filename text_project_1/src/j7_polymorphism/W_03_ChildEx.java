package j7_polymorphism;

public class W_03_ChildEx {

	public static void main(String[] args) {
		Child cd = new Child();
		
		Parent par = cd;
		par.method1(); // par-method1
		par.method2(); // cd-method2
		//par.method3(); // X
	}
}

class Parent {
	public void method1() {
		System.out.println("Par-method1");
	}
	
	public void method2() {
		System.out.println("Par-method2");
	}
}

class Child extends Parent {
	@Override
	public void method2() {
		System.out.println("chd-method2");
	}
	
	public void method3() {
		System.out.println("chd-method3");
	}
}