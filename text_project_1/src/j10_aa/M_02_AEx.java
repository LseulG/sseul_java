package j10_aa;

public class M_02_AEx {
	public static void main(String[] args) {
		M_02_A a = new M_02_A();
		
		M_02_A.B b = a.new B(); //�ν��Ͻ�
		b.fieldB = 100;
		b.methodB();
		
		M_02_A.C c = new M_02_A.C(); //����
		c.fieldC = 100;
		c.methodC();
		
		//a.method(); //class D ����
	}

}
