package DAY9;

import java.util.regex.Pattern;

public class Day9_pro7 {
	/*
	 * ù��° ���ĺ����� ����
	 * �ι�°���� ���ڿ� ���ĺ����� ������ 8~12�� ����
	 * ���ĺ��� ��ҹ��� ��� ���
	 */
	public static void main(String[] args) {
		String id = "5Angel1004";
		String regExp = "[a-zA-Z]\\w{8,12}";
		boolean isMatch = Pattern.matches(regExp,id);
		if(isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		} else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}
	}

}
