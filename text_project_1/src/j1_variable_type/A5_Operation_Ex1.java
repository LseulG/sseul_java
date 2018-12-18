package j1_variable_type;

public class A5_Operation_Ex1 {
	public static void main(String[] args) {
		//maxSpeed; max_speed;
		int a = 10;
		int b = 6;
		
		System.out.println(a+b); //16
		System.out.println(a-b); //4
		System.out.println(a*b); //60
		System.out.println(a/b); //1
		System.out.println(a%b); //4
		System.out.println(a++); //10 / 연산 후 +1
		System.out.println(++a); //12 / a=a+1 후 연산
		
		double da = 10.0;
		double db = 6.1;
		
		System.out.println(da+db); //16.1
		System.out.println(da-db); //3.900000004
		System.out.println(da*db); //61.0
		System.out.println(da/db); //1.639344262295082
		System.out.println(da%db); //3.900000004
	}
}
