package j2_conditionLoopFunction;

public class B_08_For_Ex3 {
	// -- 2  3  4  --
	// 6  -- 8  -- 10
	// 11 12 -- 14 15
	// 16 -- 18 -- 20
	// -- 22 23 24 --
	public static void main(String[] args) {
		int num = 1;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(num + " ");
				num += 1;
			}
			System.out.println();
		}
	}

}
