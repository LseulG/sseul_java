package Day8;

public class Day8_pro2 {

	//outer클래스의 내부 클래스 inner의 멤버변수 iv의 값을 출력
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

