package Day4;

public class Day4_pro1 {
	//arr에 모든 값을 더하는 프로그램
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("sum=" + sum);

	}

}
