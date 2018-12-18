package j2_conditionLoopFunction;

public class B_02_IfElse_Ex1 {
	public static void main(String[] args) {
		int a = 70;
		int b = 65;
		int c = 4;
		
		int max = 0; //최대값
		int min = 0; //최소값
		
		if (a > b) {
			max = c;
			min = b;
			if (a > c) {
				max = a;
			}
			if (b > c) {
				min = c;
			}
		} else {
			max = c;
			min = a;
			if(b > c) {
				max = b;
			}
			if(a > c) {
				min = c;
			}
		}
		
		System.out.println("max = " + max);
		System.out.println("min = " + min);
		
		//max = Math.max(Math.max(a,b),c);
		//min = Math.min(Math.min(a,b),c);
	}
}
