package Day1;

public class Day1_pro4 {
	// num 값 중에 백의자리 이하를 버리는 코드. 456 > '400'
	public static void main(String[] args) {
		int num = 456;
		
		System.out.println(num - (num%100));
	}
}
