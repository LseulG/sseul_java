package j10_aa;

public class M_02_A {
	M_02_A(){System.out.println("A() ������"); }
	
	B field1 = new B();
	C field2 = new C();
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//static B field3 = new B();
	static C field4 = new C();
	
	static void method2() {
		//B var1 = new B();
		C var2 = new C();		
	}
	
	int field5;
	void method3() {System.out.println();}
	static int field6;
	static void method4() {System.out.println();}
	
	class B {
		B() {}
		int fieldB;
		//static int sfieldB; 
				
		
		void methodB() {
			field5 = 10;
			method3();
			field6 = 10;
			method4();
		}	
		//static void smethodB() {}
		// A�� ���� �Ŀ� B�� ��������� ������ static ��� �Ұ�
		
		//D d1 = new D();
		//�޼��� ���ο����� �����Ǽ� ��� �Ұ�
		
		
	}
	
	static class C {
		C() {}
		int fieldC;
		static int sfieldC;
		void methodC() {}
		static void smethodC() {}
		
		//D d1 = new D();
		//�޼��� ���ο����� �����Ǽ� ��� �Ұ�
	}
	
	void method(int arg1, int arg2) {
		final int var1 = 1;
		int var2 = 2;
		
		// �޼��� ȣ�� �ÿ��� �����Ǿ��ٰ� �������� Ŭ����
		class D{
			D() {}
			int fieldD = 100;
			//static int sfieldD;
			
			void methodD(int arg) {
				System.out.println(arg + fieldD);
			}
			
			void methodD() {
				System.out.println(var1 + var2 + arg1 + arg2);
			}
			//static void smethodD() {}
		}
		
		// �޼��� ���ο��� ��� �뵵�� �������
		D d = new D();
		d.fieldD = 10;
		d.methodD();
	}
}
