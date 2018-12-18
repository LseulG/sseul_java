package Day8;

public class Day8_pro4 {
	//???????????
	//30 20 10. 결과에 맞게 짜라
	public static void main(String[] args) {
		Outer4 out = new Outer4();
		Outer4.Inner4 inner = out.new Inner4();

		inner.method1();
	}
}

class Outer4{
	int value=10;
	
	class Inner4 {
		int value=20;
		void method1() {
			int value=30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer4.this.value);
		}
	} //inner
} //outer