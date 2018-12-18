package j2_conditionLoopFunction;

public class B_09_While {

	public static void main(String[] args) {
//		int i = 1;
//		while (i < 10) {
//			System.out.println(i);
//			i++;
//		}
		
		int i = 1;
		int j = 10;
		int sum = 0;
		
		while (i <= 5){
			sum = sum + i + j;
			i++;
			j--;
		}
		System.out.println(sum);
		


	}

}
