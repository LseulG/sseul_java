package Day1;

public class Day1_pro7 {
	// 결과에 맞게 수정
	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		int c = a + b; 
		char ch = 'A';
		int ch2 = ch + 2; 
		float f = 3f / 2f;
		long l = (long)(3000 * 3000) * 3000;
		float f2 = 0.1f;
		double d = 0.1;
		boolean result = (float)d==f2;
				
		System.out.println("c="+c); //30
		//System.out.println("ch="+ch); //C
		System.out.println("ch="+(char)ch2); //C
		System.out.println("f="+f); //1.5
		System.out.println("l="+l); //27000000000
		System.out.println("result="+result); //true
	}

}
