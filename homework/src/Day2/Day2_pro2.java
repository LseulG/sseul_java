package Day2;

public class Day2_pro2 {
	//1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합
	// 2 : 2 4 6 8 10 12 14 16 18 20
	// 3 : 3 6 9 12 15 18
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum = sum + i;
			}
		}
		
		System.out.println(sum);
	}

}
