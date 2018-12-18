package j5_OOP;

public class M_08_CalStatic {
	
	public static void main(String[] args) {
		//static 사용x  
		//Calcu cal = new Calcu();
		//cal.plus(10, 20);
		
		//static 사용
		Calcu.plus(10,20);
		
	}

}

class Calcu{
	static final double pi = 3.14; //상수. 더이상 못바꿈
	//static double pi = 3.14;
	
	static int plus(int x, int y) {
		//pi = 0.111;
		return x + y;
	}
}
