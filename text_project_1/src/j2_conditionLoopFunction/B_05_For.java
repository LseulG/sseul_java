package j2_conditionLoopFunction;

public class B_05_For {

	public static void main(String[] args) {
		
		//for문 안에서 선언한 변수는 for문에서만 사용 가능
		for(int i=1; i<=25; i++) {
			System.out.print(i + " ");
			if(i%5 == 0) {
				System.out.println();
			}
		}
		
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
