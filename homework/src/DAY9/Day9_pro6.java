package DAY9;

public class Day9_pro6 {

	public static void main(String[] args) {
		String str = "";
		for (int i=1; i<=100; i++) {
			str += i;
		}
		System.out.println(str);
		
		//개선코드 작성
		StringBuilder sb = new StringBuilder(str);
		for (int i=1; i<=100; i++) {
			sb.append(i);
		}
		System.out.println(sb.toString());
	}
}
