package Day8;

public class Day8_pro2 {

	//outerŬ������ ���� Ŭ���� inner�� ������� iv�� ���� ���
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		
		System.out.println(in.iv);
	}

}

class Outer{
	class Inner {
		int iv = 100;
	}
}

