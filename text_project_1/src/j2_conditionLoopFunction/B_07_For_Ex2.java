package j2_conditionLoopFunction;

public class B_07_For_Ex2 {

	public static void main(String[] args) {
		int num = 1;
		
		// ------------ 1 3 5 7 9
		for(int i=0; i<5; i++) {
			System.out.print(num + " ");
			num = num + 2;
		}
		System.out.println();
		
		for(int i=1; i<=9; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
		// ------------ 1 3 9 27 81
		num = 1;
		for(int i=0; i<5; i++) {
			System.out.print(num + " ");
			num = num * 3;
		}
		System.out.println();
		
		for(int i=1; i<=81; i*=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// ------------ 1 2 3 5 8
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		for(int i=0; i<5; i++) {
			sum = num1 + num2;			
			System.out.print(sum + " ");
			num1 = num2;
			num2 = sum;
		}
		System.out.println();
		
		int a = 1;
		int b = 2;
		int c;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for(int i=0; i<3; i++) {
			c = a + b;			
			System.out.print(c + " ");
			a = b;
			b = c;
		}
		System.out.println();
	}

}
