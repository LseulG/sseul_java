package a7_String;

public class IndexOfEx {
	/* 4
	 * length()
	 * 문자열 길이 리턴
	 * 
	 * indexOf()
	 * 매개값으로 주어진 문자열이 시작되는 인덱스 리턴
	 * 포함되저 있지 않으면 -1 리턴
	 * 
	 * replace()
	 * 문자열 대치
	 * 첫 번째 매개 값을 찾아 두 번째 매개값 문자열로 대치(치환)
	 * 
	 */
	public static void main(String[] args) {
		String sub = "자바 프로그래밍";
		
		int length = sub.length();
		System.out.println("문자열 길이: " + length); 	// 공백 포함		
		
		int index = sub.indexOf("프로그래밍");
		System.out.println("프로그래밍이 시작되는 인덱스 위치: " + index);
		
		String newSub = sub.replace("자바", "JAVA");
		System.out.println("문자열 치환 후: " + newSub);
	}

}
