package Day1;

public class Day1_pro3 {
	// 변수 num의 값에 따라 '양수','음수','0'을 출력하는 코드
		// 삼항 연산자를 두 번 사용하라.
		public static void main(String[] args) {
			int num = 10;
			
			System.out.println((num==0)?"0":((num>0)?"양수":"음수"));
		}
}
