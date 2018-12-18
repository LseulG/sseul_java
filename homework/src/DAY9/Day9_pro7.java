package DAY9;

import java.util.regex.Pattern;

public class Day9_pro7 {
	/*
	 * 첫번째 알파벳으로 시작
	 * 두번째부터 숫자와 알파벳으로 구성된 8~12자 사이
	 * 알파벳은 대소문자 모두 허용
	 */
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]\\w{8,12}";
		boolean isMatch = Pattern.matches(regExp,id);
		if(isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		} else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
	}

}
