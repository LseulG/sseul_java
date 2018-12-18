package a7_String;

public class LowerUpperEx {
	/* 5
	 * toLowerCase()
	 * 알파벳 소문자 변경
	 * 
	 * toUpperCase()
	 * 알파벳 대문자 변경
	 * 
	 */

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println("기존: " + str1);
		System.out.println("소문자: " + str1.toLowerCase());
		System.out.println("대문자: " + str1.toUpperCase());
		System.out.println();
		
		// 문자열 비교 (대,소문자 구분)
		System.out.println(str1.equals(str2));
		
		// equalsIgnoreCase()
		// 대,소문자 구분 없이 문자열 비교
		System.out.println(str1.equalsIgnoreCase(str2));
	}

}
