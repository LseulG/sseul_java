package j1_variable_type;

public class A2_Variable_Ex1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 0;
		double doud = 20.1;
		double doue = 0;
		doue = (double)a + doud;
		
		c = a+b;
		System.out.println("a+b=" + c );
		System.out.println("a+d=" + doue );
		
		int d;
		d = (int)doud;
		System.out.println(d);
		
		
	}

}
