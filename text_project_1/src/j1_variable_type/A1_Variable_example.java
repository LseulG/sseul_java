package j1_variable_type;

public class A1_Variable_example {
	public static void main(String[] args) {
		//byte1 int4 long8 float4 double8 char1 String boolean1
		
		//정수 4byte
		int a = 10;
		int a8 = 012;
		int a16 = 0xA;
		System.out.println(a);
		System.out.println(a8);
		System.out.println(a16);
		
		//정수 long
		long lo1 = 10;
		long lo8 = 012;
		long lo16 = 0xA;
		short sh10 = 10;
		
		System.out.println(lo1);
		System.out.println(lo8);
		System.out.println(lo16);
		
		//실수
		float fa = (float)0.12;
		double doua = 0.00012;
		
		//문자
		char ch = 'a';
		System.out.println(ch);
		String str = "apple";
	}
}
