package Day8;

public class Day8_pro3 {
	//outerŬ������ ����Ŭ���� inner�� ������� iv�� �� ���
	public static void main(String[] args) {
		Outer2.Inner2 in = new Outer2.Inner2();
		
		System.out.println(in.iv);
	}
}

class Outer2{
	static class Inner2{
		int iv=200;
	}
}