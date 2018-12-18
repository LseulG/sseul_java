package j10_aa;

public class M_02_AEx {
	public static void main(String[] args) {
		M_02_A a = new M_02_A();
		
		M_02_A.B b = a.new B(); //인스턴스
		b.fieldB = 100;
		b.methodB();
		
		M_02_A.C c = new M_02_A.C(); //정적
		c.fieldC = 100;
		c.methodC();
		
		//a.method(); //class D 생성
	}

}
