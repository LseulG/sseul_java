package j10_aa;

public class M_01_Outter {

	String M_01_Outter = "Outter field";
		
	void method() {
		System.out.println("Outter method");
	}
	
	// ��ø Ŭ���� - �ν��Ͻ� ��� Ŭ����
	class NestedClass {
		String nested = "nested field";
		
		void method() {
			System.out.println("nested method");
		}
	}
}
