package j10_aa;

public class M_01_Outter {

	String M_01_Outter = "Outter field";
		
	void method() {
		System.out.println("Outter method");
	}
	
	// 중첩 클래스 - 인스턴스 멤버 클래스
	class NestedClass {
		String nested = "nested field";
		
		void method() {
			System.out.println("nested method");
		}
	}
}
