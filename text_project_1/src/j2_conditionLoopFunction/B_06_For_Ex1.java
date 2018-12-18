package j2_conditionLoopFunction;

public class B_06_For_Ex1 {

	public static void main(String[] args) {
		int num = 5;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<num; j++) {
				System.out.print("*");
			}
			num -= 1;
			System.out.println();
		}
		
		for(int i=0; i<5; i++) {
			for(int j=i; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}