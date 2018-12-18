package a7_String;

public class EqualsEx {
	/* 2
	 * equals()
	 * 문자열 비교 메소드
	 */
	public static void main(String[] args) {
		String str1 = "라이언";
		String str2 = new String("라이언");
		
		// == 연산자 : 참조하는 객체(주소값) 비교
		if (str1 == str2) {
			System.out.println("같은 String 객체 참조");
		} else {
			System.out.println("다른 String 객체 참조");
		}
		
		
		// equals() : 문자열 비교
		if (str1.equals(str2)) {
			System.out.println("같은 문자열");
		} else {
			System.out.println("다른 문자열");
		}
		
	}

}
