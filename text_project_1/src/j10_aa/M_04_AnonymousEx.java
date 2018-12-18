package j10_aa;

public class M_04_AnonymousEx {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
				new M_04_Vehicle() {
					@Override
					public void run() {
						System.out.println("Ʈ��");
					}
				}
		);
	}

}

class Anonymous {
	M_04_Vehicle field = new M_04_Vehicle() {
		@Override
		public void run() {
			System.out.println("������");
		}
	};
	
	void method1() {
		M_04_Vehicle localVar = new M_04_Vehicle() {
			@Override
			public void run() {
				System.out.println("�¿���");
			}
		};
		localVar.run();
	}
	
	void method2(M_04_Vehicle v) {
		v.run();
	}
}
