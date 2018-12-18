package j5_OOP;

public class M_05_Calculator {
	int c = 0;
	
	int add(int a, int b) {
		return a+b;
	}
	
	void minus(int a, int b) {
		c = a-b;
		System.out.println(a-b);
		//return a-b;
	}
	
	//method
	void mux(int a) {
		c = c * a;
		System.out.println(c);
		//return a*b;
	}
	
	int div(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		M_05_Calculator cal = new M_05_Calculator();
		System.out.println(cal.add(5,6));
		
		cal.minus(6,5); //c = 6-5
		cal.mux(5); // c = c*5

	}

}
