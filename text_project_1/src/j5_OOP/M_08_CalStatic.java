package j5_OOP;

public class M_08_CalStatic {
	
	public static void main(String[] args) {
		//static ���x  
		//Calcu cal = new Calcu();
		//cal.plus(10, 20);
		
		//static ���
		Calcu.plus(10,20);
		
	}

}

class Calcu{
	static final double pi = 3.14; //���. ���̻� ���ٲ�
	//static double pi = 3.14;
	
	static int plus(int x, int y) {
		//pi = 0.111;
		return x + y;
	}
}
