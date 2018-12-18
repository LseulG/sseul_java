package j1_variable_type;

public class A6_Operation_Ex2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("----------------");
		x++;
		++x;
		System.out.println("x=" + x); //12
		
		x = 10;
		y = 10;
		System.out.println("----------------");
		y++;
		++y;
		System.out.println("y=" + y); //12
		
		x = 10;
		y = 10;
		System.out.println("----------------");
		z = x++;
		System.out.println("z=" + z); //10
		System.out.println("x=" + x); //11
		
		x = 10;
		y = 10;
		System.out.println("----------------");
		z = ++x;
		System.out.println("z=" + z); //11
		System.out.println("x=" + x); //11
		
		x = 10;
		y = 10;
		System.out.println("----------------");
		z = ++x + y++;
		System.out.println("z=" + z); //21
		System.out.println("x=" + x); //11
		System.out.println("y=" + y); //11
		
		x = 10;
		y = 10;
		System.out.println("----------------");
		z = x++ + y++;
		System.out.println("z=" + z); //20
		System.out.println("x=" + x); //11
		System.out.println("y=" + y); //11
		
		x = 10;
		y = 10;
		System.out.println("----------------");
		z = ++x + ++y;
		System.out.println("z=" + z); //22
		System.out.println("x=" + x); //11
		System.out.println("y=" + y); //11
		
		
		System.out.println("----------------");
		x = 11;
		++x;
		System.out.println(x++); //12
		System.out.println(--x); //12
		System.out.println(--x); //11
		x++;
		System.out.println(x++); //12
		
		System.out.println(-(-x)); //13
	}
}
