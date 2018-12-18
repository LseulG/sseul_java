package j5_OOP;

public class M_10_PrinterEx {
	
	public static void main(String[] args) {
//		Printer printer = new Printer();
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("홍길동");
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");

	}

}

class Printer{
	//오버로딩 - 같은이름으로 만들어서 알아서 쓰게 하는거
	static void println(int a) {
		System.out.println(a);
	}
	
	static void println(boolean a) {
		System.out.println(a);
	}
	
	static void println(double a) {
		System.out.println(a);
	}
	
	static void println(String a) {
		System.out.println(a);
	}
}
