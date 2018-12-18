package j2_conditionLoopFunction;

//import java.lang.Math;  //lang Àº ³»ºÎ ÇÔ¼ö. ¾È½áÁàµµ µÊ.

public class B_03_Random {

	public static void main(String[] args) {
		Math.random();
		
		//Math.random() * n + 1; //1~n ±îÁö ·£´ı
		
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 10 + 1));
		System.out.println((int)(Math.random() * 10 + 1));
	}

}
