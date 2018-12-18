package a7_String;

public class TrimEx {
	/* 6
	 * trim()
	 * 문자열 앞뒤 공백 잘라내기
	 */

	public static void main(String[] args) {
		String str1 = "   자바     ";
		System.out.println(str1.trim());
		
		String tel1 = "    010";
		String tel2 = "12348888    ";
		String tel = tel1.trim() + tel2.trim();
		System.out.println(tel);
		
	}
}
