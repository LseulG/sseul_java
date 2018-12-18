package Day8;

public class Day8_pro3 {
	//outer클래스의 내부클래스 inner의 멤버변수 iv의 값 출력
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