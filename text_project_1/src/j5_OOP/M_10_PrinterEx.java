package j5_OOP;

public class M_10_PrinterEx {
	
	public static void main(String[] args) {
//		Printer printer = new Printer();
//		printer.println(10);
//		printer.println(true);
//		printer.println(5.7);
//		printer.println("ȫ�浿");
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");

	}

}

class Printer{
	//�����ε� - �����̸����� ���� �˾Ƽ� ���� �ϴ°�
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
