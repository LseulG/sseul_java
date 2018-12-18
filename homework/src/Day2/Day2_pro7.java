package Day2;

public class Day2_pro7 {
	//int타입의 변수 num이 있을때, 각 자리의 합을 더한 결과를 출력하는 코드
	//num = 12345 라면 '1+2+3+4+5'의 결과인 15 출력
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		//코드
		while(num != 0) {
			sum = sum + (num%10);
			num = num / 10;
		}
		
		System.out.println("sum="+sum);

	}

}
