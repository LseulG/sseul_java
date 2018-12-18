package Day1;

public class Day1_pro6 {
	//num값보다 크면서도 가장 가까운 10의 배수에서
	//변수 num의 값을 뺀 나머지를 구하는 코드.
	//24의 크면서도 가장 가까운 10의배수는 30. 19는 20, 81은 90.
	//30에서 24를 뺀 나머지는 6.
	//나머지 연산자를 사용
	public static void main(String[] args) {
		int num = 24;

		//System.out.println(((num/10)+1)*10 - num);
		System.out.println((num-num%10)+10 - num);
	}
}
