package Day2;

public class Day2_pro2 {
	//1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ����
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
